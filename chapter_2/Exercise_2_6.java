/*
 * This project is a study purpose project.
 * Everyone can use the project at his/her own reason.
 * The project has got no warranties.
 */

/*
Exercise 2.5:
If you have N eggs, then you have N/12 dozen eggs, with N%12 eggs left over. 
(This is essentially the definition of the / and % operators for integers.) 
Write a program that asks the user how many eggs she has and then tells the user how many dozen eggs she has 
and how many extra eggs are left over.
A gross of eggs is equal to 144 eggs. Extend your program so that it will tell the user how many gross, 
how many dozen, and how many left over eggs she has. 
For example, if the user says that she has 1342 eggs, then your program would respond with
Your number of eggs is 9 gross, 3 dozen, and 10
since 1342 is equal to 9*144 + 3*12 + 10.
*/

import java.io.PrintStream;

/**
 *
 * @author ahrytsenko
 */
public class Exercise_2_6 {
    
    public static void main(String[] args) {

        String fullName, firstName, lastName;

        System.out.println("Please enter your first name and last name, separated by a space.");
        fullName = TextIO.getln();
        
        System.out.printf("Your first name is %s, which has %d characters\n", firstName, len(firstName));
        System.out.printf("Your last name is %s, which has %d characters\n", lastName, len(lastName));
        System.out.printf("Your initials are %s\n", firstName.charAt(0).toUpperCase()+lastName.charAt(0).toUpperCase());
        
        /**
         * Please enter your first name and last name, separated by a space.
         * ? Mary Smith
         * Your first name is Mary, which has 4 characters
         * Your last name is Smith, which has 5 characters
         * Your initials are MS
        */
        
    }
}
