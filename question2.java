import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the numeric grade: ");
        int grade = scanner.nextInt();

        String result = (grade >= 40) ? "Pass" : "Fail";

        System.out.println("The student's result is: " + result);

        scanner.close();
    }
}