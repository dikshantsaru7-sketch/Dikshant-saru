
/**
 * Write a description of class question1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class question1
{
    public static void main(String[] args) {

        // 1. Arithmetic Operators
        int a = 10;
        int b = 5;
        System.out.println("a + b = " + (a + b)); 
        System.out.println("a - b = " + (a - b)); 
        System.out.println("a * b = " + (a * b)); 
        System.out.println("a / b = " + (a / b)); 
        System.out.println("a % b = " + (a % b)); 

        // 2. Unary Operators 
        int c = 7;
        System.out.println("\n--- Unary Operators ---");
        System.out.println("Original c: " + c);
        System.out.println("Post-increment c++: " + (c++)); 
        System.out.println("c after post-increment: " + c);
        int d = 7;
        System.out.println("Original d: " + d);
        System.out.println("Pre-increment ++d: " + (++d)); 
        System.out.println("d after pre-increment: " + d);

        // 3. Assignment Operators
        int x = 20;
        System.out.println("Initial x: " + x);
        x += 5; 
        System.out.println("x after x += 5: " + x);
        x -= 2; 
        System.out.println("x after x -= 2: " + x);
        x *= 3; 
        System.out.println("x after x *= 3: " + x);
        x /= 4; 
        System.out.println("x after x /= 4: " + x);
        x %= 2; 
        System.out.println("x after x %= 2: " + x);

        // 4. Relational Operators
        int p = 15;
        int q = 10;
        System.out.println("p == q: " + (p == q)); 
        System.out.println("p != q: " + (p != q)); 
        System.out.println("p > q: " + (p > q));   
        System.out.println("p < q: " + (p < q));   
        System.out.println("p >= q: " + (p >= q)); 
        System.out.println("p <= q: " + (p <= q)); 

        boolean condition1 = true;
        boolean condition2 = false;
        //logical operators
        System.out.println("condition1 && condition2: " + (condition1 && condition2)); 
        System.out.println("condition1 || condition2: " + (condition1 || condition2)); 
        System.out.println("!condition1: " + (!condition1)); 

        int age = 18;
        String status = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Status based on age " + age + ": " + status);

    }
}

        
    
