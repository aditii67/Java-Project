import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to Simple Calculator!");
        
        // Input first number
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();
        
        // Input second number
        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();
        
        // Choose operation
        System.out.println("Choose operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        
        int choice = sc.nextInt();
        double result = 0;
        
        switch(choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero.");
                    return; // Exit if there's an error
                }
                break;
            default:
                System.out.println("Invalid choice!");
                return; // Exit if invalid choice
        }
        
        // Output the result
        System.out.println("Result: " + result);
    }
}
