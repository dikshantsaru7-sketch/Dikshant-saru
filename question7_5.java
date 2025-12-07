import java.util.Scanner;

/**
 * Write a description of class question7_5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class question7_5
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        boolean running = true;
        
        while(running)
        System.out.println("simple calculator" );
        
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();
        
            System.out.println("Choose an operation:");
            System.out.println("1. + (Addition)");
            System.out.println("2. - (Subtraction)");
            System.out.println("3. * (Multiplication)");
            System.out.println("4. / (Division)");
            System.out.print("Enter your choice (1/2/3/4): ");}
            int choice =input.nextint();
            
            switch (choice)
            {
                
                case 1 :
                    System.out.print("Result:"+ (num1+num2));
                    break;
                    case 2:
                        System.out.print("result:"+(num1-num2));
                        break;
                        case 3 : 
                            System.out.print("result:"+(num1*num2));
                            break;
                           case 4:
                    if (num2 != 0) {
                        System.out.println("Result: " + (num1 / num2));
                    } else {
                        System.out.println("Error: Cannot divide by zero.");
                    }
                    break;
                    
                    default:
                        System.out.print("Invalid choice");
              
                  {  System.out.print( " Do you want to perform another calculation? (yes/no):");
                    String again =input.nextint.toLowerCase();
                    
                    
                    if(!again.equals("yes"));
                    running = false ;
                    System.out.print("exiting program");
                }
            } 

                
                input.close();
                
            }                
            }
            
    
}