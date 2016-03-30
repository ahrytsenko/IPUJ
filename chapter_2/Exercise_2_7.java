/*
 * This project is a study purpose project.
 * Everyone can use the project at his/her own reason.
 * The project has got no warranties.
 */
 
 /* Exercise 2.7:
  Suppose that a file named "testdata.txt" contains the following information: 
  The first line of the file is the name of a student. Each of the next three lines contains an integer. 
  The integers are the student's scores on three exams. 
  Write a program that will read the information in the file 
  and display (on standard output) a message that contains the name of the student 
  and the student's average grade on the three exams. 
  The average is obtained by adding up the individual exam grades and then dividing by the number of exams.
 */

import java.io.PrintStream;

/**
 *
 * @author ahrytsenko
 */
public class Exercise_2_7 {
    
    public static void main(String[] args) {

        String fileName = "testdata.txt";
        String studentName;
        int grade = 0;
        
        TextIO.readFile("d:\\testdata.txt");
        studentName = TextIO.getlnString();
        
        for (int i=0; i<3; i++) {
            grade += TextIO.getInt();
        }

        System.out.printf("The average grade of %s is %1.2f", studentName, (grade*1.0/3));
    }
}
