/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;

/**
 *
 * @author ahryts1
 */
public class Exercise_7_5 {
    
    private ArrayList<Double> dblList = new ArrayList<>();
    
    public void fillArray() {
        Scanner scanner = new Scanner(System.in);
        double dbl = Double.POSITIVE_INFINITY;
        dblList.clear();
        do {
            try {
                dbl = scanner.nextDouble();
                if (dbl != 0)
                    dblList.add(dbl);
            }
            finally {}
        } while (dbl != 0);
    }
    
    public void sortArray() {
        boolean sorted = false;
        
        do {
            sorted = true;
            for (int i = 1; i < dblList.size(); i++)
                if (dblList.get(i) < dblList.get(i-1)) {
                    double tmp = dblList.get(i);
                    dblList.set(i, dblList.get(i-1));
                    dblList.set(i-1, tmp);
                    sorted = false;
                }
            for (int i = dblList.size()-2; i > 0; i--)
                if (dblList.get(i) > dblList.get(i+1)) {
                    double tmp = dblList.get(i);
                    dblList.set(i, dblList.get(i+1));
                    dblList.set(i+1, tmp);
                    sorted = false;
                }
        } while (!sorted);
    }
    
    public void printArray() {
        System.out.printf("List contains %d elements.\n", dblList.size());
        if (dblList.size() > 0) {
            System.out.println("Elements are:");
            for (double dbl : dblList)
                System.out.println(dbl);
        }
        else {
            System.out.println("Nothing to print.");
        }
    }
    
    public static void main(String[] args) {
        Exercise_7_5 aList = new Exercise_7_5();
        
        System.out.println("Enter a sequense of double values.");
        System.out.println("To stop enter 0 please.");
        
        aList.fillArray();
        aList.sortArray();
        
        System.out.println("\nSorted list of doubles:");
        aList.printArray();
    }
}
