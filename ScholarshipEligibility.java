import java.util.Scanner;

public class ScholarshipEligibility {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter GPA: ");
        double gpa = scanner.nextDouble();

       
        System.out.print("Enter attendance percentage ( 90 for 90%): ");
        int attendance = scanner.nextInt();

        
        System.out.print("Enter attitude score (1-10): ");
        int attitude = scanner.nextInt();

        
        if (gpa >= 3.2) {
            if (attendance > 80) {
                if (attitude < 5) {
                    System.out.println("The student is eligible for the scholarship.");
                } else {
                    System.out.println("The student is not eligible (attitude score too high).");
                }
            } else {
                System.out.println("The student is not eligible (attendance too low).");
            }
        } else {
            System.out.println("The student is not eligible (GPA too low).");
        }


        scanner.close();
    }
}
