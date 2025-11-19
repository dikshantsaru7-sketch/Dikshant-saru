
/**
 * Write a description of class question3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DataTypeInspector
 {
    public static void main(String[] args) {
       
        byte myByte = 127; 
        short myShort = 32767;
        int myInt = 2147483647; 
        long myLong = 9223372036854775807L;

        // Floating-point types
        float myFloat = 3.14f; 
        double myDouble = 2.71828; 

        // Character type
        char myChar = 'A';

        // Boolean type
        boolean myBoolean = true; 
        System.out.println("Byte value: " + myByte);
        System.out.println("Short value: " + myShort);
        System.out.println("Int value: " + myInt);
        System.out.println("Long value: " + myLong);
        System.out.println("Float value: " + myFloat);
        System.out.println("Double value: " + myDouble);
        System.out.println("Char value: " + myChar);
        System.out.println("Boolean value: " + myBoolean);
    }
}
