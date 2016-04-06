class Exercise_4_1 {

    public static void main(String[] args) {
        System.out.println("Enter a string, please.");
        printCapitalized(TextIO.getln());
    }
    
    public static void printCapitalized(String string) {
        boolean firstLetter = true;
        
        if (string.length() == 0) return;
        
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i))) {
                if (firstLetter) {
                    System.out.print(Character.toUppercase(string.charAt(i)));
                    firstLetter = false;
                }
                else {
                    System.out.print(string.charAt(i));
                }
            }
            else {
                System.out.print(string.charAt(i));
                firstLetter = true;
            }
        }
        System.out.println();
    }
}
