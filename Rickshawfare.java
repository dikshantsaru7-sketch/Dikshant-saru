import java.util.Scanner;

/**
 * Write a description of class Rickshawfare here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rickshawfare
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter distance (in km): ");
        double distance = sc.nextDouble();

        System.out.print("Enter time (in minutes): ");
        int time = sc.nextInt();

        System.out.print("Is the customer local? (yes/no): ");
        String localInput = sc.next();
        boolean isLocal = localInput.equalsIgnoreCase("yes");

        System.out.print("Is the travel during night? (yes/no): ");
        String nightInput = sc.next();
        boolean isNight = nightInput.equalsIgnoreCase("yes");

        double fare = (distance * 20) + (time * 2);

        fare = isLocal ? fare * 0.9 : fare;

        fare = isNight ? fare * 1.2 : fare;

        System.out.println("Final Fare: Rs. " + Math.round(fare));

        sc.close();
    }
}
