import java.util.Scanner;

public class DivisibilityCheckbynestedif{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        
        if (number % 3 != 0) {
            
            if (number % 5 != 0) {
                System.out.println("The number is neither divisible by 3 nor by 5.");
            } else {
                System.out.println("The number is divisible by 5 but not by 3.");
            }
        } else { 
           
            if (number % 5 == 0) {
                System.out.println("The number is divisible by both 3 and 5.");
            } else {
                System.out.println("The number is divisible by 3 but not by 5.");
            }
        }

        scanner.close();
    }
}