
/**
 * Write a description of class question4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class question4 {

    
    byte defaultByte;
    short defaultShort;
    int defaultInt;
    long defaultLong;
    float defaultFloat;
    double defaultDouble;
    boolean defaultBoolean;
    char defaultChar;

    public static void main(String[] args) {
        
        question4 defaultsInstance = new question4 ();

        
        System.out.println("Default byte: " + defaultsInstance.defaultByte);
        System.out.println("Default short: " + defaultsInstance.defaultShort);
        System.out.println("Default int: " + defaultsInstance.defaultInt);
        System.out.println("Default long: " + defaultsInstance.defaultLong);
        System.out.println("Default float: " + defaultsInstance.defaultFloat);
        System.out.println("Default double: " + defaultsInstance.defaultDouble);
        System.out.println("Default boolean: " + defaultsInstance.defaultBoolean);
        System.out.println("Default char: " + (int) defaultsInstance.defaultChar); 
        System.out.println("Default char (literal): " + defaultsInstance.defaultChar);

       
    }
}
