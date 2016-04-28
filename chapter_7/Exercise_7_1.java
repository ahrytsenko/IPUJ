
import java.util.ArrayList;

/*
 * Exercise 7.1:
 * Write a subroutine that creates an ArrayList 
 * containing several different random integers in the range 
 * from 1 up to some specified maximum. 
 * The number of integers and the maximum allowed value for the integers 
 * should be parameters to the subroutine. 
 * Write a main() routine to test your subroutine.
 */

/**
 *
 * @author ahryts1
 */
public class Exercise_7_1 {
    
    private final ArrayList<Integer> arrayList;
    
    public Exercise_7_1() { arrayList = new ArrayList<>(); }
         
    /**
     * Generates a random integer value in a range from 1 to max inclusive
     * @param max - integer from 1 to Integer.MAX_INTEGER
     * @return - generated random integer
     * @throws IllegalArgumentException in case if max less then 1
     */
    public int getRandomInt(int max) {
        if (max < 1 || max > Integer.MAX_VALUE) 
            throw new IllegalArgumentException("Upper bound of a range should be positive");
        
        return (int)(Math.random()*max + 1);
    }
    
    /**
     * Checks ArrayList if it contains a given integer value
     * @param value - integer value for check
     * @return - true if given value exists in a list, false otherwise
     */
    public boolean isExists(int value) {
        boolean result = false;
        for (int item : arrayList) {
            if (item == value) {
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Adds a new random integer value to the list
     * Added value is guaranteed different from existed values
     * @param max - integer from 1 to Integer.MAX_INTEGER
     * @throws IllegalArgumentException in case if max less ten or equal to the length of arrayList
     */
    public void addDifferentRandomValue(int max) {
        if (max <= arrayList.size())
            throw new IllegalArgumentException("Upper bound of a range should be greater then " + arrayList.size());

        int randomValue;
        do {
            randomValue = getRandomInt(max);
        } while (isExists(randomValue));
        
        arrayList.add(randomValue);
    }
    
    public String toString() {
        StringBuilder strBuilder = new StringBuilder();
        for (int i : arrayList) {
            strBuilder.append(Integer.toString(i));
            strBuilder.append(" ");
        }
        return strBuilder.toString();
    }
    
    public static void main(String[] args) {
        
        Exercise_7_1 test = new Exercise_7_1();
        
        test.arrayList.add(1);
        System.out.println(test.isExists(0));
        System.out.println(test.isExists(1));
        
        for (int i = 0; i < 100; i++) 
            test.addDifferentRandomValue(110);
        
        System.out.println(test);
    }
    
}
