import java.util.InputMismatchException;
import java.util.Scanner;

public class GPAGrader {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gpa = -1.0; 
        while (true) {
            System.out.print("Enter GPA (0.0 to 4.0): ");
            try {
                gpa = scanner.nextDouble();

             
                if (gpa >= 0.0 && gpa <= 4.0) {
                    break;
                } else {
                    System.out.println("Error: GPA must be between 0.0 and 4.0.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input. Please enter a numerical value for GPA.");
                scanner.next();
            }
        }

        String grade = convertGpaToGrade(gpa);
        System.out.println("GPA: " + gpa + " corresponds to grade: " + grade);

        scanner.close();
    }
    public static String convertGpaToGrade(double gpa) {
        if (gpa >= 3.7) {
            return "A";
        } else if (gpa >= 3.3) {
            return "A-";
        } else if (gpa >= 3.0) {
            return "B+";
        } else if (gpa >= 2.7) {
            return "B";
        } else if (gpa >= 2.3) {
            return "B-";
        } else if (gpa >= 2.0) {
            return "C+";
        } else if (gpa >= 1.7) {
            return "C";
        } else if (gpa >= 1.3) {
            return "C-";
        } else if (gpa >= 1.0) {
            return "D+";
        } else if (gpa >= 0.7) {
            return "D";
        } else {
            return "F";
        }
    }
}