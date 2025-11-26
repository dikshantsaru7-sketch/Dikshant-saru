import java.util.Scanner;

public class usingswitchstatement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        float markedPrice;
        char category;
        float discountPercent = 0.0f;
        float sellingPrice;

       
        System.out.print("Enter the marked price of the item: ");
        markedPrice = scanner.nextFloat();

        
        System.out.print("Enter the category of the item (A, B, C, etc.): ");
        category = scanner.next().charAt(0); 
        switch (Character.toUpperCase(category)) { 
            case 'A':
                discountPercent = 10.0f; 
                break;
            case 'B':
                discountPercent = 15.0f; 
                break;
            case 'C':
                discountPercent = 20.0f; 
                break;
            default:
                System.out.println("Invalid category entered. No discount applied.");
                discountPercent = 0.0f; 
                break;
        }

        
        sellingPrice = markedPrice - (markedPrice * (discountPercent / 100.0f));

        
        System.out.println("Marked Price: " + markedPrice);
        System.out.println("Category: " + category);
        System.out.println("Discount Percentage: " + discountPercent + "%");
        System.out.println("Selling Price: " + sellingPrice);

        scanner.close();
    }
}