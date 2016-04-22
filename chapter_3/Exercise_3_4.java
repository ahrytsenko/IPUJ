/*
Exercise 3.4:
Write a program that reads one line of input text and breaks it up into words. 
The words should be output one per line. A word is defined to be a sequence of letters. 
Any characters in the input that are not letters should be discarded. For example, if the user inputs the line
He said, "That's not a good idea."
then the output of the program should be
He
said
That
s
not
a
good
idea
An improved version of the program would list "that's" as a single word. 
An apostrophe can be considered to be part of a word if there is a letter on each side of the apostrophe.
To test whether a character is a letter, you might use (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'). 
However, this only works in English and similar languages. 
A better choice is to call the standard function Character.isLetter(ch), 
which returns a boolean value of true if ch is a letter and false if it is not. 
This works for any Unicode character.
*/

class Exercise_3_4 {
    
    public static void main(String[] args) {

        BrakeUp brakeUp = new BrakeUp();
        
        System.out.println("Enter your string, please.");
        brakeUp.setString(TextIO.getln());
        brakeUp.brakeUpTotWords();
        
    }

    private class BrakeUp {
        
        private String aString;
        
        public BrakeUp(String aString) { this.aString = aString; }
        
        public void setString(String aString) { this.aString = aString; }
        
        public void brakeUpToWords() { this.brakeUpToWords(this.aString); }
        
        public void brakeUpTotWords(String value) {
    
            // if value is an empty string then exit
            value = value.trim();
            if (value.length() == 0) return;
    
            // seek for the first alphabet character
            // store index of the 1st alpha char in indexFrom
            int i = 0, indexFrom = 0;
            while ((i < value.length()) && (!Character.isLetter(value.charAt(i)))) {
                i++;
            }
            
            // if there is no alpha chars then exit
            if (indexFrom == value.length()) return;
            
            // save index of the 1st alpha char
            indexFrom = i;
            
            // seek for the first non-alpha character
            while ((i < value.length()) && (Character.isLetter(value.charAt(i)))) {
                i++;
            }
            
            // print extracted Word
            System.out.println(value.substring(indexFrom, i));
            
            // extract next word from the string
            getWord(value.substring(i, value.length()));
            
        } // brakeUpTotWords
        
    } // class BrakeUp

} // class Exercise_3_4
