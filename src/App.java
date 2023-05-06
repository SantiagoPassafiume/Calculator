import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        float n1;
        float n2;
        try {
            n1 = getUserInputFloat("Please enter your first number: ");
            n2 = getUserInputFloat("Please enter your second number: ");

            System.out.println();

            System.out.println("Sum: " + sum(n1, n2));
            System.out.println("Subtraction: " + subtract(n1, n2));
            System.out.println("Multiplication: " + multiply(n1, n2));
            System.out.println("Division: " + divide(n1, n2));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        }

    }

    public static float sum(float n1, float n2) {
        return n1 + n2;
    }

    public static float subtract(float n1, float n2) {
        return n1 - n2;
    }

    public static float multiply(float n1, float n2) {
        return n1 * n2;
    }

    public static float divide(float n1, float n2) {
        if (n2 == 0) {
            ArithmeticException exception = new ArithmeticException("Division by zero is not allowed.");
            exception.setStackTrace(new StackTraceElement[0]);
            throw exception;
        }
        return n1 / n2;
    }

    public static float getUserInputFloat(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        float input = scanner.nextFloat();
        return input;
    }

    public static char getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String input = scanner.nextLine();

        char userInput = input.charAt(0);

        scanner.close();
        return userInput;
    }

}
