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
class Exercise_3_3_2 {
    
    public static void main(String[] args) {

        double firstNum, secondNum;
        char operator;
        
        System.out.println("I can compute a simple math expression like \"firstNum (operator) secondNum\"");
        System.out.println("Here operator can be + - / or *");

        while (true) {
            System.out.println("\nIf you whant to stop just enter 0 as first number");
            System.out.print("Enter the expression: ");
            firstNum = TextIO.getDouble();
            if (firstNum == 0) break;
            operator = TextIO.getChar();
            secondNum = TextIO.getDouble();
            
            switch (operator) {
                case '+': {
                    System.out.printf("%f + %f = %f", firstNum, secondNum, (firstNum + secondNum));
                    break;
                }
                case '-': System.out.printf("%f - %f = %f", firstNum, secondNum, (firstNum - secondNum));
                     break;
                case '*': System.out.printf("%f * %f = %f", firstNum, secondNum, (firstNum * secondNum));
                     break;
                case '/': if (secondNum != 0) {
                        System.out.printf("%f / %f = %f", firstNum, secondNum, (firstNum / secondNum));
                     }
                     else {
                        System.out.println("Division by zero is impossible.");
                     }
                     break;
                default: System.out.println("Unknown operator. Calculation is impossible.");
            }
            
        }
        
    }
    
}
