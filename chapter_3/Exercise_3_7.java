/*
 * This project is a study purpose project.
 * Everyone can use the project at his/her own reason.
 * The project has got no warranties.
 */

/*
Exercise 3.7:
An example in Subsection 3.8.3 tried to answer the question, 
How many random people do you have to select before you find a duplicate birthday? 
The source code for that program can be found in the file BirthdayProblem.java. 
Here are some related questions:

How many random people do you have to select before you find three people 
who share the same birthday? 
(That is, all three people were born on the same day in the same month, 
but not necessarily in the same year.)
Suppose you choose 365 people at random. 
How many different birthdays will they have? 
(The number could theoretically be anywhere from 1 to 365).
How many different people do you have to check before you've found at least one person 
with a birthday on each of the 365 days of the year?
Write three programs to answer these questions. 
Each of your programs should simulate choosing people at random and checking their birthdays. 
(In each case, ignore the possibility of leap years.)
*/

/**
 *
 * @author ahrytsenko
 */
public class Exercise_3_7 {
    
    public static void main(String[] args) {
        
        System.out.printf("I've to select %d random people before I find three people who share the same birthday.\n", task1());
        System.out.printf("I've found %d different birthdays among 365 random selected people.\n", task2());
        System.out.printf("I've checked %d random people before I find 365 different birthdays.\n", task3());
    }
    
    public static int task1() {
        boolean[][] bdArray = new boolean[2][365];
        int attempts = 0;
        
        while (true) {
            attempts++;
            
            int randomBirthday = (int)(Math.random()*365);
            if (!bdArray[0][randomBirthday]) {
                bdArray[0][randomBirthday] = true;
            }
            else if (!bdArray[1][randomBirthday]) {
                bdArray[1][randomBirthday] = true;
            }
            else break;
        }
        
        return attempts;
    }
    
    public static int task2() {
        boolean[] bdArray = new boolean[365];
        int differentDates = 0;
        
        for (int i = 0; i < 365; i++) {
            bdArray[(int)(Math.random()*365)] = true;
        }
        
        for (int i = 0; i < 365; i++) {
            if (bdArray[i]) differentDates++;
        }
        
        return differentDates;
    }
    
    public static int task3() {
        boolean[] bdArray = new boolean[365];
        int untakenDates = 365;
        int attempts = 0;
        
        while (untakenDates > 0) {
            int randomBirthday = (int)(Math.random()*365);
            if (!bdArray[randomBirthday]) {
                bdArray[randomBirthday] = true;
                untakenDates--;
            }
            attempts++;
        }
        
        return attempts;
    }
}
