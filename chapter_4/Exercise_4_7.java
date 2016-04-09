/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agrytsenko
 */
public class Exercise_4_7 {
    
    public static final int QUIZ_SIZE = 10;
    public static final int MAX_INT_VAL = 20;
    public static final int QUIZ_VALIE = 10;
    public static int[][] quiz = new int[QUIZ_SIZE][3];
    public static int quizGrade;
    
    public static void main(String[] args) {
        System.out.println("Basic addition QUIZ");
        System.out.printf("Please give answers for %d addition questions.\n", QUIZ_SIZE);
        createQuiz();
        administerQuiz();
        gradeQuiz();
    }
    
    public static void createQuiz() {
        for (int i = 0; i < QUIZ_SIZE; i++) {
            quiz[i][0] = (int)(MAX_INT_VAL*Math.random());
            quiz[i][1] = (int)(MAX_INT_VAL*Math.random());
        }
    }
    
    public static void administerQuiz() {
        for (int i = 0; i < QUIZ_SIZE; i++) {
            System.out.printf("%2d + %2d = ", quiz[i][0], quiz[i][1]);
            quiz[i][2] = Integer.parseInt(TextIO.getln());
        }
    }
    
    public static void gradeQuiz() {
        System.out.println("\nQUIZ result:");
        quizGrade = 0;
        for (int i = 0; i < QUIZ_SIZE; i++) {
            System.out.printf("%2d + %2d = %2d ", quiz[i][0], quiz[i][1], quiz[i][2]);
            if (quiz[i][0] + quiz[i][1] == quiz[i][2]) {
                System.out.println("Right!");
                quizGrade += QUIZ_VALIE;
            }
            else {
                System.out.printf("Wrong! The right answer is %d\n", (quiz[i][0] + quiz[i][1]));
            }
        }
        System.out.printf("Your total score is %d of %d\n", quizGrade, QUIZ_SIZE*QUIZ_VALIE);
    }
    
}
