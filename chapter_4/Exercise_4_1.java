class Exercise_4_1 {

    public static void main(String[] args) {
        System.out.println("Enter a string, please.");
        printCapitalized(TextIO.getln());
    }
    
    /**
     * printCapitalized prints gives string with capitalized first letter of each word.
     * If given string is empty printCapitalized prints nothing.
     * @param string is a given string
     * @return nothing
     */
    public static void printCapitalized(String string) {

        // Flag indicates that current letter is the first
        boolean firstLetter = true;

        // If string is empty stop execution
        if (string.length() == 0) return;
        
        for (int i = 0; i < string.length(); i++) {
            
            // If current character is a letter
            if (Character.isLetter(string.charAt(i))) {
                
                // and flag is rised
                if (firstLetter) {
                    
                    // print capitalized character
                    System.out.print(Character.toUppercase(string.charAt(i)));
                    // and put flag down
                    firstLetter = false;
                }
                // if flag is not rised simply print che character
                else {
                    System.out.print(string.charAt(i));
                }
            }
            
            // if current character is not a letter
            else {
                
                // print the character
                System.out.print(string.charAt(i));
                
                // and rise the flag
                firstLetter = true;
            }
        }
        System.out.println();
    }
}
