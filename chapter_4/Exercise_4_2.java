/**
 *
 * @author agrytsenko
 */
public class Exercise_4_2 {
    
    public static final String TITLE = "Exercise 4.2";
    
    public static void main(String[] args) {
        
        HexadecimalConvertion hc = new HexadecimalConvertion();
        String str;
        
        System.out.println(TITLE);
        System.out.print("Enter Hexadecimal integer: ");
        str = TextIO.getln();
        System.out.printf("Hexadecimal '%s' is equal to '%d' in decimal.\n", str, hc.strHexValue(str));
        
    }
    
    // Pravate inner class
    
}
