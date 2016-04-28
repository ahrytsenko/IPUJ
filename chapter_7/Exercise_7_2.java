/*
 * Exercise 7.2:
 * 
 * Suppose that M is a two-dimensional array that has R rows and C columns. 
 * The transpose of M is defined to be an array T that has C rows and R columns 
 * such that T[i][j] = M[j][i] for each i and j. 
 * Write a function that takes an array of type int[][] as a parameter, 
 * and returns the transpose of that array. 
 * (Assume that the parameter is a typical 2D array in which all the rows 
 * have the same length.) 
 * Also write a subroutine to print a 2D array of integers in neat rows and columns, 
 * and include a main() routine to test your work.
 */

/**
 *
 * @author ahryts1
 */
public class Exercise_7_2 {
    
    /**
     * Transposes an 2D array of integer from [M x N] matrix to [N x M} matrix
     * @param srcArray - 2D array of integer
     * @return transposed array of integer
     * @throw IllegalArgumentException in case if given array is not a 2D array
     */
    public static int[][] transpose(int[][] srcArray) {
        if (srcArray.length < 1) throw new IllegalArgumentException("Number of rows should be at least 1.");
        if (srcArray[0].length < 1) throw new IllegalArgumentException("Number of columns should be at least 1.");
        
        int[][] dstArray = new int[srcArray[0].length][srcArray.length];
        
        for (int i = 0; i < srcArray.length; i++)
            for (int j = 0; j < srcArray[0].length; j ++)
                dstArray[j][i] = srcArray[i][j];
        
        return dstArray;
    }

    public static void printArray(int[][] srcArray) {
        if (srcArray.length < 1) throw new IllegalArgumentException("Number of rows should be at least 1.");
        if (srcArray[0].length < 1) throw new IllegalArgumentException("Number of columns should be at least 1.");

        System.out.println("Matrix [" + srcArray.length +
                " x " + srcArray[0].length + "] :");
        for (int[] row : srcArray) {
            for (int cel : row)
                System.out.printf("%3d", cel);
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        int[][] firstArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}, {13, 14, 15}};
        int[][] secondArray = transpose(firstArray);
        
        printArray(firstArray);
        printArray(secondArray);
    }
    
}
