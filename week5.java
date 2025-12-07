 
/**
 * Write a description of class week5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week5
{
    public static void main(String[] args)
    {
        int sum=0;
         for(int i=1; i<=10; i++)
         {
             sum= sum + i ; 
         }
         System.out.println("The sum of 10 natural numbers: " + sum);
         
         
         int i =1;
         
         while(i<=3)
         {
             System.out.println("while loop:");
             i++;
         }
         
         int o=1;
         
         do{
             System.out.println(o);
             o++;
             
         }while (o<1);
         
         for(int u =1; u<=10; u++)
         if(u==4)
         {
            
             System.out.println(u);
            }
    }
}