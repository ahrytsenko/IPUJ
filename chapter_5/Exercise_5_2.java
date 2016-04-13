/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agrytsenko
 */
public class Exercise_5_2 extends StatCalc {
    
    private double min = Double.POSITIVE_INFINITY; // Contain min among entered values
    private double max = Double.NEGATIVE_INFINITY; // Contain max among entered values
    
    /**
     * Returns min among entered values.
     * If there was nothing entered it equals zero
     * @return double - min entered value
     */
    public double getMin() {
        return min;
    }
    
    /**
     * Returns max among entered values.
     * If there was nothing entered it equals zero
     * @return double - max entered value
     */
    public double getMax() {
        return max;
    }
    
    @Override
    public void enter(double num) {
        super.enter(num);
        if (num < min) min = num;
        if (num > max) max = num;
    }
    
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("StatCalc statictics:\n");
        str.append("Entered "); str.append(Integer.toString(getCount())); str.append(" values\n");
        str.append("Min value is "); str.append(Double.toString(getMin())); str.append("\n");
        str.append("Max value is "); str.append(Double.toString(getMax())); str.append("\n");
        str.append("Total sum of entered values is "); str.append(Double.toString(getSum())); str.append("\n");
        str.append("Meam of entered values is "); str.append(Double.toString(getMean())); str.append("\n");
        str.append("Standard deviation of entered values is "); str.append(Double.toString(getStandardDeviation())); str.append("\n");
        return str.toString();
    }
    
    public static void main(String[] args) {
        Exercise_5_2 calc = new Exercise_5_2();
        
        for (int i = 1; i <= 100; i++) calc.enter(i);
        
        System.out.println(calc);
    }
}
