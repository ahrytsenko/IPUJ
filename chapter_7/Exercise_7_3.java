
import java.util.ArrayList;

/*
 * Exercise 7.3:
 * 
 * In Subsection 7.4.4, it is mentioned 
 * that the standard sorting method Arrays.sort() is much faster and efficient 
 * than selection sort. 
 * Write a program to test this claim. 
 * To be specific, your program should create a large array 
 * filled with random real numbers. 
 * It should use both Arrays.sort() and selectionSort() to sort the array, 
 * and it should time how long it takes to perform each sort. 
 * Furthermore, it should do the same thing for a large array of random Strings. 
 * To find the times, you can use System.currentTimeMillis()
 */

/**
 *
 * @author ahryts1
 */
public class Exercise_7_3 {
    
    private int[] intArray;
    private int lastElement;
    
    public Exercise_7_3(int arraySize) { 
        intArray = new int[arraySize];
        lastElement = 0;
    }
         
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
     * Checks intArray if it contains a given integer value
     * @param value - integer value for check
     * @return - true if given value exists in a list, false otherwise
     */
    public boolean isExists(int value) {
        boolean result = false;
        for (int i = 0; i < lastElement; i++) {
            if (intArray[i] == value) {
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
     * @throws IllegalArgumentException in case if max less ten or equal to the length of intArray
     */
    public void addDifferentRandomValue(int max) {
        if (max <= intArray.length)
            throw new IllegalArgumentException("Upper bound of a range should be greater then " + intArray.length);

        int randomValue;
        do {
            randomValue = getRandomInt(max);
        } while (isExists(randomValue));
        
        intArray[lastElement++] = randomValue;
    }
    
    public String toString() {
        StringBuilder strBuilder = new StringBuilder();
        for (int i : intArray) {
            strBuilder.append(Integer.toString(i));
            strBuilder.append(" ");
        }
        return strBuilder.toString();
    }
    
    
    
    public void fillList(int elements, int max) {
        for (int i = 0; i < elements; i++)
            addDifferentRandomValue(max);
    }
    
    public void builtinSort() { java.util.Arrays.sort(intArray); }
    
    public void selectionSort() {
    // Sort A into increasing order, using selection sort
      
        for (int lastPlace = intArray.length-1; lastPlace > 0; lastPlace--) {
              // Find the largest item among A[0], A[1], ...,
              // A[lastPlace], and move it into position lastPlace 
              // by swapping it with the number that is currently 
              // in position lastPlace.

            int maxLoc = 0;  // Location of largest item seen so far.

            for (int j = 1; j <= lastPlace; j++) {
                if (intArray[j] > intArray[maxLoc]) {
                      // Since A[j] is bigger than the maximum we've seen
                      // so far, j is the new location of the maximum value
                      // we've seen so far.
                   maxLoc = j;  
                }
            }

           int temp = intArray[maxLoc];  // Swap largest item with A[lastPlace].
           intArray[maxLoc] = intArray[lastPlace];
           intArray[lastPlace] = temp;
      
        }
    }
    
    public int[] getElements() { return intArray; }
    
    public void copyElements(int[] A) { intArray = A.clone(); }
    
    public static void main(String[] args) {
        
        int TEST_SIZE = 100000;
        
        Exercise_7_3 ar1 = new Exercise_7_3(TEST_SIZE);
        Exercise_7_3 ar2 = new Exercise_7_3(TEST_SIZE);
        
        System.out.print("Creating first array...");
        ar1.fillList(TEST_SIZE, TEST_SIZE*2);
        System.out.println("finished.");
        System.out.print("Creating second array...");
        ar2.copyElements(ar1.getElements());
        System.out.println("finished.");
        
        long times[][] = new long[2][2];
        
        System.out.print("Sorting first array by built-in algorythm...");
        times[0][0] = System.currentTimeMillis();
        ar1.builtinSort();
        times[0][1] = System.currentTimeMillis();
        System.out.println("finished.");
        
        System.out.print("Sorting second array by selection sort algorythm...");
        times[1][0] = System.currentTimeMillis();
        ar1.selectionSort();
        times[1][1] = System.currentTimeMillis();
        System.out.println("finished.");
     
        System.out.printf("Built-in sort algorythm takes %d miliseconds.\n", (times[0][1]-times[0][0]));
        System.out.printf("Selection sort algorythm takes %d miliseconds.\n", (times[1][1]-times[1][0]));
    }
    
}
