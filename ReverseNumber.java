import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        int reversed = 0;

    
        while (number > 0) {
            int digit = number % 10;        
            reversed = reversed * 10 + digit;
            number /= 10;                     
        }


        System.out.println("Reversed number: " + reversed);

        input.close();
    }
}
