/*
 * This project is a study purpose project.
 * Everyone can use the project at his/her own reason.
 * The project has got no warranties.
 */

/**
 *
 * @author ahrytsenko
 */
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
            
            if (firstLetter)
                System.out.print(Character.toUpperCase(string.charAt(i)));
            else
                System.out.print(string.charAt(i));
            
            firstLetter = !Character.isLetter(string.charAt(i));
        }
        System.out.println();
    }
}
