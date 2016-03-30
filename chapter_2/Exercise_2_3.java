/*
 * This project is a study purpose project.
 * Everyone can use the project at his/her own reason.
 * The project has got no warranties.
 */

/*
Exercise 2.3:
Write a program that asks the user's name, and then greets the user by name. 
Before outputting the user's name, convert it to upper case letters. 
For example, if the user's name is Fred, then the program should respond "Hello, FRED, nice to meet you!".
*/

/**
 *
 * @author ahrytsenko
 */
public class Exercise_2_3 {
    
    public static void main(String[] args) {
        
        String name;
        
        System.out.print("What is your name? ");
        name = TextIO.getWord();
        
        System.out.println("Hello, " + name.toUpperCase() + ", nice to meet you!");
    }
}
