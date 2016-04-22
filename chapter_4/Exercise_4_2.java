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
        System.out.printf("Hexadecimal '%s' is equal to '%d' in decimal.", str, hc.strHexValue(str));
        
    }
    
    // Pravate inner class
    private class HexadecimalConvertion {
        
        public int strHexValue(String string) {
            long value = 0;
            for (int i = 0; i < string.length(); i++) {
                if (charHexValue(string.charAt(i)) != -1) {
                    value = value*16 + charHexValue( string.charAt(i) );
                }
                else {
                    throw new IllegalArgumentException(string.charAt(i) + " is not a valid hexadecimal character.");
                } // if
            } // for
            return value;
        } // strHexValue
        
        public int charHexValue(Character character) {
            int value;
            
            switch (Character.toUpperCase(character)) {
                case '0': value = 0; break;
                case '1': value = 1; break;
                case '2': value = 2; break;
                case '3': value = 3; break;
                case '4': value = 4; break;
                case '5': value = 5; break;
                case '6': value = 6; break;
                case '7': value = 7; break;
                case '8': value = 8; break;
                case '9': value = 9; break;
                case 'A': value = 10; break;
                case 'B': value = 11; break;
                case 'C': value = 12; break;
                case 'D': value = 13; break;
                case 'E': value = 14; break;
                case 'F': value = 15; break;
                default: value =-1;
            } // switch
            return value;
        } // charHexValue
    }
    
}
