import java.io.PrintStream;

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

/**
 *
 * @author ahrytsenko
 */
public class Exercise_2_5 {
    
    public static void main(String[] args) {

        int grosses;
        int dozens;
        int eggs;
        
        System.out.print("Hi! Tell me how many eggs do you have: ");
        eggs = TextIO.getlnInt();
        
        grosses = (eggs / 144);
        eggs %= 144;
        
        dozens = (eggs / 12);
        eggs %= 12;

        System.out.printf("Grate! Your number of eggs is %d gross, %d dozen, and %d\n", grosses, dozens, eggs);
        
    }
}
