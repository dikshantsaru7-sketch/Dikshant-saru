import java.util.Scanner;

public class PassFailChecker {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter the student's score: ");
        int score = inputScanner.nextInt();

        int passingScore = 40; 
        if (score >= passingScore) {
            System.out.println("The student has PASSED the examination.");
        } else {
            System.out.println("The student has FAILED the examination.");
        }

        inputScanner.close();
    }
}