import java.util.Scanner;

/**
 * A system that accepts a paper size (A0 to A5) and displays its dimensions
 * in both millimeters and inches using a switch case statement.
 */
public class Paperssize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a paper size (A0, A1, A2, A3, A4, or A5):");
        String inputSize = scanner.nextLine().toUpperCase(); 

        String dimensionsMm = "";
        String dimensionsIn = "";

        switch (inputSize) {
            case "A0":
                dimensionsMm = "841 x 1189 mm";
                dimensionsIn = "33.1 x 46.8 inches";
                break;
            case "A1":
                dimensionsMm = "594 x 841 mm";
                dimensionsIn = "23.4 x 33.1 inches";
                break;
            case "A2":
                dimensionsMm = "420 x 594 mm";
                dimensionsIn = "16.5 x 23.4 inches";
                break;
            case "A3":
                dimensionsMm = "297 x 420 mm";
                dimensionsIn = "11.7 x 16.5 inches";
                break;
            case "A4":
                dimensionsMm = "210 x 297 mm";
                dimensionsIn = "8.3 x 11.7 inches";
                break;
            case "A5":
                dimensionsMm = "148 x 210 mm";
                dimensionsIn = "5.8 x 8.3 inches";
                break;
            default:
                System.out.println("Invalid input. Please enter a valid paper size between A0 and A5.");
                
                scanner.close();
                return;
        }

        
        System.out.println("Dimensions for paper size " + inputSize + ":");
        System.out.println("Millimeters (mm): " + dimensionsMm);
        System.out.println("Inches (in): " + dimensionsIn);

        scanner.close();
    }
}
