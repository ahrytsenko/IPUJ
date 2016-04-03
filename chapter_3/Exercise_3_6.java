/*
Exercise 3.6:
Exercise 3.2 asked you to find the number in the range 1 to 10000 
that has the largest number of divisors. 
You only had to print out one such number. 
Revise the program so that it will print out all numbers that have the maximum number of divisors. 
Use an array as follows: As you count the divisors for each number, store each count in an array. 
Then at the end of the program, you can go through the array and print out all the numbers 
that have the maximum count. The output from the program should look something like this:

Among integers between 1 and 10000,
The maximum number of divisors was 64
Numbers with that many divisors include:
   7560
   9240

*/

class Exercise_3_6 {
    
    public static final int START_INT = 1;
    public static final int STOP_INT = 10000;

    public static void main(String[] args) {
        
        int maxDivisorsPossessor = 0;
        int divisorsCount = 0;
        
        int[] intArray = new int[STOP_INT+1];
        
        for (int i = START_INT; i <= STOP_INT; i++) {
            intArray[i] = countDivisors(i);
            if (intArray[i] > divisorsCount) {
                divisorsCount = intArray[i];
                maxDivisorsPossessor = i;
            }
        }
        
        System.out.printf("Among integers between %d and %d,\n", START_INT, STOP_INT);
        System.out.printf("The maximum number of divisors was %d\n", divisorsCount);
        System.out.println("Numbers with that many divisors include:");
        for (int i = START_INT; i <= STOP_INT; i++) {
            if (intArray[i] == divisorsCount) {
                System.out.println(i);
            }
        }
    }
    
    public static int countDivisors(int number) {
        
        // Proceed only positive numbers
        if (number <= 0)
            return 0;
            
        int result = 0;
        for (int i = 1; i <= number; i++) {
            if (0 == (number % i))
                result++;
        }
        return result;
    }
}
