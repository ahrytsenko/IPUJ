/*
 * This project is a study purpose project.
 * Everyone can use the project at his/her own reason.
 * The project has got no warranties.
 */

/*
Exercise 2.6:
This exercise asks you to write a program that tests some of the built-in subroutines for working with Strings. 
The program should ask the user to enter their first name and their last name, separated by a space. 
Read the user's response using TextIO.getln(). Break the input string up into two strings, 
one containing the first name and one containing the last name. 
You can do that by using the indexOf() subroutine to find the position of the space, 
and then using substring() to extract each of the two names. 
Also output the number of characters in each name, and output the user's initials. 
(The initials are the first letter of the first name together with the first letter of the last name.) 
A sample run of the program should look something like this:
Please enter your first name and last name, separated by a space.
? Mary Smith
Your first name is Mary, which has 4 characters
Your last name is Smith, which has 5 characters
Your initials are MS
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
        
        if (fullName.indexOf(" ") != -1) {
            firstName = fullName.substring(0, fullName.indexOf(" ")).trim();
            lastName = fullName.substring(fullName.indexOf(" "), fullName.length()).trim();
        }
        else {
            firstName = fullName.trim();
            lastName = "";
        }
        
        System.out.printf("Your first name is %s, which has %d characters\n", firstName, firstName.length());
        System.out.printf("Your last name is %s, which has %d characters\n", lastName, lastName.length());
        if (lastName.length() != 0) {
            System.out.printf("Your initials are %s%s\n", firstName.charAt(0), lastName.charAt(0));
        }
        else {
            System.out.printf("Your initials are %s\n", firstName.charAt(0));
        }

    }
}
