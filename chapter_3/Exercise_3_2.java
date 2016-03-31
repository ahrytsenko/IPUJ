/*
 * This project is a study purpose project.
 * Everyone can use the project at his/her own reason.
 * The project has got no warranties.
 */
 
 /*
Exercise 3.2:
Which integer between 1 and 10000 has the largest number of divisors, and how many divisors does it have? 
Write a program to find the answers and print out the results. 
It is possible that several integers in this range have the same, maximum number of divisors. 
Your program only has to print out one of them. An example in Subsection 3.4.2 discussed divisors. 
The source code for that example is CountDivisors.java.
You might need some hints about how to find a maximum value. 
The basic idea is to go through all the integers, keeping track of the largest number of divisors that you've seen so far. 
Also, keep track of the integer that had that number of divisors.
*/

/**
 *
 * @author ahrytsenko
 */
class Exercise_3_2 {
    
    public static final int START_INT = 1;
    public static final int STOP_INT = 10000;

    public static void main(String[] args) {
        
        int maxDivisorsPossessor = 0;
        int divisorsCount = 0;
        
        for (int i = START_INT; i <= STOP_INT; i++) {
            int divisors = countDivisors(i);
            if (divisors > divisorsCount) {
                divisorsCount = divisors;
                maxDivisorsPossessor = i;
            }
        }
        
        System.out.printf("In the range between %d and %d the smallest integer which has maximum number of divisors is: %d\n", START_INT, STOP_INT, maxDivisorsPossessor);
        System.out.printf("The maximum number of divisors for that integer is: %d\n", divisorsCount);
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
