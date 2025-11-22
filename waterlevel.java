
/**
 * Write a description of class waterlevel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class waterlevel

{
    public static void main(String[] args){
        int waterlevel =1200;
  
        String message = (waterlevel >=1200)?"WARNING!:WARTER LEVEL HAS REACHED 1200L or more!":"Normal";
        System.out.print(message);
    }
}
