import java.util.Scanner;

public class CinemaTicket {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to XFX Cinema Ticket Booking System!");

        System.out.println("Enter your age group (Child/Adult/Senior): ");
        String ageGroup = sc.nextLine().trim().toLowerCase();

        System.out.println("Enter movie language (Nepali/Hindi/English): ");
        String language = sc.nextLine().trim().toLowerCase();

        System.out.println("Are you a student? (yes/no): ");
        String studentInput = sc.nextLine().trim().toLowerCase();
        boolean isStudent = studentInput.equals("yes");

        System.out.println("Is it a festival day? (yes/no): ");
        String festivalInput = sc.nextLine().trim().toLowerCase();
        boolean isFestival = festivalInput.equals("yes");

       
        double basePrice = 0;
        switch (ageGroup) {
            case "child":
                basePrice = 150;
                break;
            case "adult":
                basePrice = 250;
                break;
            case "senior":
                basePrice = 200;
                break;
            default:
                System.out.println("Invalid age group entered. Exiting.");
                sc.close();
                return;
        }

        switch (language) {
            case "hindi":
                basePrice += 50;
                break;
            case "english":
                basePrice += 100;
                break;
            case "nepali":
                break;
            default:
                System.out.println("Invalid movie language entered. Exiting.");
                sc.close();
                return;
        }

        if (isStudent) {
            basePrice = basePrice * 0.8; 
        }
        if (isFestival) {
            basePrice = basePrice * 0.85; 
        }

        System.out.printf("The final ticket price is: Rs. %.2f%n", basePrice);

        sc.close();
    }
}
