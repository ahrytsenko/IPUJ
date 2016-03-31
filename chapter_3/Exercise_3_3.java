/*
 * This project is a study purpose project.
 * Everyone can use the project at his/her own reason.
 * The project has got no warranties.
 */
 
 /*
Exercise 3.3:
Write a program that will evaluate simple expressions such as 17 + 3 and 3.14159 * 4.7. 
The expressions are to be typed in by the user. 
The input always consists of a number, followed by an operator, followed by another number. 
The operators that are allowed are +, -, *, and /. 
You can read the numbers with TextIO.getDouble() and the operator with TextIO.getChar(). 
Your program should read an expression, print its value, read another expression, print its value, and so on. 
The program should end when the user enters 0 as the first number on the line.
*/

/**
 *
 * @author ahrytsenko
 */
class Exercise_3_3 {
    
    public static void main(String[] args) {
        
        int maxDivisorsPossessor = 0;
        int divisorsCount = 0;
        
        for (int i = START_INT; i <= STOP_INT; i++) {
            int divisors = countDivisors(i);
            if (divisors > divisorsCount) {
                divisorsCount++;
                maxDivisorsPossessor = i;
            }
        }
        
        System.out.printf("In the range between %d and %d the largest integer which has maximum number of divisors is: ", START_INT, STOP_INT, maxDivisorsPossessor);
        System.out.printf("The maximum number of divisors for that integer is: ", maxDivisors);
    }
    
    public static int countDivisors(int number) {
        
        // Proceed only positive numbers
        if (number <= 0)
            return 0;
            
        int result = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                result++;
        }
        return result;
    }
}
