import java.util.Scanner;

public class DiscountCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        float markedPrice;
        char category;
        float discountPercent = 0.0f; 
        float sellingPrice;

        
        System.out.print("Enter the marked price of the item: ");
        markedPrice = input.nextFloat();

        System.out.print("Enter the category of the item (A, B, C, etc.): ");
        category = input.next().charAt(0); 

        
        if (category == 'A' || category == 'a') {
            discountPercent = 10.0f; 
        } else if (category == 'B' || category == 'b') {
            discountPercent = 15.0f; 
        } else if (category == 'C' || category == 'c') {
            discountPercent = 20.0f; 
        } else {
            System.out.println("Invalid category entered. No discount applied.");
            discountPercent = 0.0f; 
        }
        
        sellingPrice = markedPrice - (markedPrice * (discountPercent / 100.0f));
        
        System.out.println("Marked Price: " + markedPrice);
        System.out.println("Category: " + category);
        System.out.println("Discount Applied: " + discountPercent + "%");
        System.out.println("Selling Price: " + sellingPrice);

        input.close();
    }
}