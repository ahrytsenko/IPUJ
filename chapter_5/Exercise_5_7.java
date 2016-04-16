/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agrytsenko
 */
public class Exercise_5_7 {
    
    public static final int QUIZ_SIZE = 10;
    public static final int MAX_INT_VAL = 20;
    public static final int QUIZ_VALIE = 10;
    public static IntQuestion[] quiz = new IntQuestion[QUIZ_SIZE];
    public static int quizGrade;
    
    public static void main(String[] args) {
        System.out.println("Basic addition QUIZ");
        System.out.printf("Please give answers for %d addition questions.\n", QUIZ_SIZE);
        createQuiz();
        administerQuiz();
        gradeQuiz();
    }
    
    public static void createQuiz() {
        for (int i = 0; i < QUIZ_SIZE/2; i++) quiz[i] = new AdditionQuestion();
        for (int i = QUIZ_SIZE/2; i < QUIZ_SIZE; i++) quiz[i] = new SubstructionQuestion();
    }
    
    public static void administerQuiz() {
        for (int i = 0; i < QUIZ_SIZE; i++) {
            System.out.print("Q" + (i+1) + "> ");
            System.out.print(quiz[i].getQuestion());
            int quizResult = Integer.parseInt(TextIO.getln());
            if (quizResult == quiz[i].getCorrectAnswer()) {
                System.out.println("Correct.");
                quizGrade += QUIZ_VALIE;
            }
            else {
                System.out.println("You are wrong! The right answer is " + quiz[i].getCorrectAnswer());
            }
        }
    }
    
    public static void gradeQuiz() {
        System.out.printf("\nYour total score is %d of %d\n", quizGrade, QUIZ_SIZE*QUIZ_VALIE);
    }
    
}
