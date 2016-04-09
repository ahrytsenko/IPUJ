/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agrytsenko
 */
public class Exercise_4_2 {
    
    public static final String TITLE = "Exercise 4.2";
    
    public static void main(String[] args) {
        
        System.out.println(TITLE);
        
        System.out.print("Enter Hexadecimal integer: ");
        String str = TextIO.getln();
        
        long value = 0;
        for (int i = 0; i < str.length(); i++) {
            if (hexValue(str.charAt(i)) != -1) {
                value = value*16 + hexValue( str.charAt(i) );
            }
            else {
                System.out.println("Error was found in the given string!");
            }
        }
        
        System.out.printf("Hexadecimal '%s' is equal to '%d' in decimal.", str, value);
        
    }
    
    public static int hexValue(Character character) {
        
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
            default: value =-10;
        }
        return value;
    }
}
