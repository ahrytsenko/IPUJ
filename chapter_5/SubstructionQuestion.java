/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agrytsenko
 */
public class SubstructionQuestion implements IntQuestion {

    private int a, b;  // The numbers in the problem.

    public SubstructionQuestion() { // constructor
        int var1, var2;
        var1 = (int)(Math.random() * 50 + 1);
        var2 = (int)(Math.random() * 50);
        if (var1>var2) {
            a = var1;
            b = var2;
        }
        else {
            a = var2;
            b = var1;
        }
    }

    public String getQuestion() {
        return "What is " + a + " - " + b + " ?";
    }

    public int getCorrectAnswer() {
        return a - b;
    }

}