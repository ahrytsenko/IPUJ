class N3plus1 {

    public static void main(String[] args) {
        
        int intValue;
        int startValue;
        int sequenceLength = 1;

        System.out.println("Enter the start integer of the sequence: ");
        intValue = TextIO.getInt()
        startValue = intValue;
        
        // Stop execution if entered value less or equal to zero
        if (intValue <= 0) System.exit(1);
        
        System.out.println("\nSequence is:");
        
        while (intValue != 1) {
        
            System.out.printf("%d ", intValue);
            
            if (intValue % 2 == 0) {
                intValue /= 2;
            }
            else {
                intValue = intValue*3 + 1;
            }
            sequenceLength++;
            
        }
        System.out.println(intValue);
        
        System.out.printf("Start int in the sequence: %d\n", startValue);
        System.out.printf("The length of the sequence is: %d\n", sequenceLength);
        
}
