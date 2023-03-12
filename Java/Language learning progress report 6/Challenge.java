import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueProgram = true;

        System.out.println("Welcome to the simple calculator!");

        do {
            System.out.print("\nPlease enter the first number: ");
            double num1 = input.nextDouble();

            System.out.print("\nPlease enter the second number: ");
            double num2 = input.nextDouble();

            System.out.print("\nPlease enter the operation (add, subtract, multiply, divide): ");
            String operation = input.next();

            double result = 0;

            switch (operation) {
                case "add":
                    result = add(num1, num2);
                    break;
                case "subtract":
                    result = subtract(num1, num2);
                    break;
                case "multiply":
                    result = multiply(num1, num2);
                    break;
                case "divide":
                    if (num2 == 0) {
                        System.out.println("\nCannot divide by zero. Please try again.");
                        continue;
                    }
                    result = divide(num1, num2);
                    break;
                default:
                    System.out.println("\nInvalid operation. Please try again.");
                    continue;
            }

            System.out.println("\nThe result is: " + result);

            System.out.print("\nDo you want to perform another operation? (y/n): ");
            char choice = input.next().charAt(0);

            if (choice == 'n' || choice == 'N') {
                continueProgram = false;
            }
        } while (continueProgram);

        System.out.println("\nThank you for using the simple calculator!");
    }

    private static double add(double num1, double num2) {
        return num1 + num2;
    }

    private static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    private static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    private static double divide(double num1, double num2) {
        return num1 / num2;
    }
}
