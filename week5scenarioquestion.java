import java.util.Scanner;

public class week5scenarioquestion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Nepal Investment Bank Fixed Deposit Calculator ===");

        boolean continueFD = true;

        while (continueFD) {

            System.out.print("\nEnter deposit amount (Rs): ");
            double P = sc.nextDouble();

            if (P < 1000) {
                System.out.println("❌ Minimum deposit is Rs. 1000");
                continue;
            }

            System.out.print("Enter annual interest rate (8 to 12%): ");
            double annualRate = sc.nextDouble();

            if (annualRate < 8 || annualRate > 12) {
                System.out.println("❌ Interest rate must be between 8% and 12%");
                continue;
            }

            System.out.print("Enter duration in years (max 5 years): ");
            int years = sc.nextInt();

            if (years < 1 || years > 5) {
                System.out.println("❌ Duration must be between 1 to 5 years.");
                continue;
            }

            // Calculations
            double monthlyRate = annualRate / 12 / 100;  
            int months = years * 12;

            double A = P * Math.pow((1 + monthlyRate), months);

           
            double feeRate = 0.005;
            double fee = A * feeRate;

            double finalAmount = A - fee;

           
            System.out.println("\n------ FD DETAILS ------");
            System.out.println("Principal (P): Rs. " + P);
            System.out.println("Annual Rate: " + annualRate + "%");
            System.out.println("Monthly Rate: " + monthlyRate);
            System.out.println("Duration: " + years + " years (" + months + " months)");
            System.out.println("Maturity Amount (A): Rs. " + String.format("%.2f", A));
            System.out.println("Processing Fee (0.5%): Rs. " + String.format("%.2f", fee));
            System.out.println("Final Amount Received: Rs. " + String.format("%.2f", finalAmount));


            System.out.print("\nDo you want to calculate another FD? (yes/no): ");
            String choice = sc.next();

            if (!choice.equalsIgnoreCase("yes")) {
                continueFD = false;
            }
        }

        System.out.println("\nThank you for using NIB FD Calculator!");
        sc.close();
    }
}
