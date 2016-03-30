/*
 * This project is a study purpose project.
 * Everyone can use the project at his/her own reason.
 * The project has got no warranties.
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
