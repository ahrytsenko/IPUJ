
import java.io.IOException;
import java.nio.file.FileSystems;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahryts1
 */
public class Exercise_7_7 {
    
    private WordList wordList = new WordList();
    
    private class Words {
        private String word;
        private int count;
        
        public Words(String word) {
            setWord(word);
            count = 1;
        }
        
        public int getCount() { return count; }
        public void setCount(int value) { count = value; }
        public String getWord() { return word; }
        public void setWord(String word) { this.word = word; }
    }
    
    private class WordList {
        private ArrayList<Words> wordList;
        
        public WordList() { wordList = new ArrayList<>(); }
        
        public void addWord(String word) {
            word = word.toLowerCase().trim();
            int index = getIndexOfWord(word);
            if (index == -1) {
                wordList.add(new Words(word));
            }
            else {
                wordList.get(index).setCount(wordList.get(index).getCount()+1);
            }
        }
        
        public int getIndexOfWord(String word) {
            int index = -1;
            for (int i = 0; i < wordList.size(); i++) {
                if (wordList.get(i).getWord().equals(word)) {
                    index = i;
                    break;
                }
            }
            return index;
        }
        
        public boolean isExists(String word) {
            boolean exists = false;
            for (Words items : wordList) {
                if (items.getWord().equals(word)) {
                    exists = true;
                    break;
                }
            }
            return exists;
        }
        
        public int size() { return wordList.size(); }
        public Words get(int index) { return wordList.get(index); }
    }
    
    public static void main(String[] args) throws IOException {

        Exercise_7_7 exercise = new Exercise_7_7();
        
        TextIO.readFile(FileSystems.getDefault().getPath(System.getProperty("user.dir"), "exercise_7_7_in.txt").toString());
        System.out.println(TextIO.getInputFileName());
        TextIO.writeFile(FileSystems.getDefault().getPath(System.getProperty("user.dir"), "exercise_7_7_out.txt").toString());
        System.out.println(TextIO.getOutputFileName());
        
        String nextWord = readNextWord();
        
        while (nextWord != null) {
            exercise.wordList.addWord(nextWord);
            nextWord = readNextWord();
        }

        for (int i = 0; i < exercise.wordList.size(); i++) {
            System.out.print(exercise.wordList.get(i).getWord());
            System.out.print(" : ");
            System.out.println(exercise.wordList.get(i).getCount());
        }
        
    }
    
    /**
    * Read the next word from TextIO, if there is one.  First, skip past
    * any non-letters in the input.  If an end-of-file is encountered before 
    * a word is found, return null.  Otherwise, read and return the word.
    * A word is defined as a sequence of letters.  Also, a word can include
    * an apostrophe if the apostrophe is surrounded by letters on each side.
    * @return the next word from TextIO, or null if an end-of-file is 
    *     encountered
    */
    private static String readNextWord() {
        char ch = TextIO.peek(); // Look at next character in input.
        while (ch != TextIO.EOF && ! Character.isLetter(ch)) {
               // Skip past non-letters.
            TextIO.getAnyChar();  // Read the character.
            ch = TextIO.peek();   // Look at the next character.
        }
        if (ch == TextIO.EOF) // Encountered end-of-file
            return null;
        // At this point, we know the next character is a letter, so read a word.
        String word = "";  // This will be the word that is read.
        while (true) {
            word += TextIO.getAnyChar();  // Append the letter onto word.
            ch = TextIO.peek();  // Look at next character.
            if ( ch == '\'' ) {
                // The next character is an apostrophe.  Read it, and
                // if the following character is a letter, add both the
                // apostrophe and the letter onto the word and continue
                // reading the word.  If the character after the apostrophe
                // is not a letter, the word is done, so break out of the loop.
                TextIO.getAnyChar();   // Read the apostrophe.
                ch = TextIO.peek();    // Look at char that follows apostrophe.
                if (Character.isLetter(ch)) {
                    word += "\'" + TextIO.getAnyChar();
                    ch = TextIO.peek();  // Look at next char.
                }
                else
                    break;
            }
            if ( ! Character.isLetter(ch) ) {
                // If the next character is not a letter, the word is
                // finished, so break out of the loop.
                 break;
            }
            // If we haven't broken out of the loop, next char is a letter.
        }
        return word;  // Return the word that has been read.
    }
}
