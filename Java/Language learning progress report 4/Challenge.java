/* Challenge: Write a Java program that takes two integer inputs from the user and checks if the first integer is a multiple of the second integer. If it is a multiple, print "num1 is a multiple of num2", otherwise print "num1 is not a multiple of num2".

Requirements:

Use keywords and expressions to define integer variables for the two inputs and the result of the modulo operation.
Use if-else control statements to check if the first integer is a multiple of the second integer.
Use print statements to output the result of the check. */


import java.util.Scanner;

public class CheckMultiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, result;

        System.out.print("Enter the first integer: ");
        num1 = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        num2 = scanner.nextInt();

        result = num1 % num2;

        if (result == 0) {
            System.out.println(num1 + " is a multiple of " + num2);
        } else {
            System.out.println(num1 + " is not a multiple of " + num2);
        }

        scanner.close();
    }
}

