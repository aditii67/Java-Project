import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nWeight Converter Menu:");
            System.out.println("1. Kilograms to Pounds");
            System.out.println("2. Kilograms to Ounces");
            System.out.println("3. Grams to Pounds");
            System.out.println("4. Grams to Ounces");
            System.out.println("5. Pounds to Kilograms");
            System.out.println("6. Pounds to Grams");
            System.out.println("7. Ounces to Kilograms");
            System.out.println("8. Ounces to Grams");
            System.out.println("9. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            if (choice == 9) {
                System.out.println("Goodbye!");
                break;
            }

            System.out.print("Enter weight: ");
            double weight = scanner.nextDouble();
            double convertedWeight = 0;

            switch (choice) {
                case 1:
                    convertedWeight = weight * 2.20462; // kg to lb
                    System.out.println(weight + " kg = " + convertedWeight + " lb");
                    break;
                case 2:
                    convertedWeight = weight * 35.274; // kg to oz
                    System.out.println(weight + " kg = " + convertedWeight + " oz");
                    break;
                case 3:
                    convertedWeight = weight * 0.00220462; // g to lb
                    System.out.println(weight + " g = " + convertedWeight + " lb");
                    break;
                case 4:
                    convertedWeight = weight * 0.035274; // g to oz
                    System.out.println(weight + " g = " + convertedWeight + " oz");
                    break;
                case 5:
                    convertedWeight = weight * 0.453592; // lb to kg
                    System.out.println(weight + " lb = " + convertedWeight + " kg");
                    break;
                case 6:
                    convertedWeight = weight * 453.592; // lb to g
                    System.out.println(weight + " lb = " + convertedWeight + " g");
                    break;
                case 7:
                    convertedWeight = weight * 0.0283495; // oz to kg
                    System.out.println(weight + " oz = " + convertedWeight + " kg");
                    break;
                case 8:
                    convertedWeight = weight * 28.3495; // oz to g
                    System.out.println(weight + " oz = " + convertedWeight + " g");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }

        scanner.close();
    }
}
