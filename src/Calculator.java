import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        float n1;
        float n2;
        char operation;
        Scanner scanner = new Scanner(System.in);

        try {
            n1 = getUserInputFloat("Enter your first number: ", scanner);
            n2 = getUserInputFloat("Enter your second number: ", scanner);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid numbers.");
            return;
        }

        scanner.nextLine(); // Consume the newline character

        operation = getUserInput("Enter the operation you want to perform: ", scanner);

        performOperation(n1, n2, operation);

        scanner.close();

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

    public static float getUserInputFloat(String prompt, Scanner scanner) {
        System.out.print(prompt);
        float input = scanner.nextFloat();
        return input;
    }

    public static char getUserInput(String prompt, Scanner scanner) {
        System.out.print(prompt);
        String input = scanner.nextLine();

        char userInput = input.charAt(0);

        return userInput;
    }

    public static void performOperation(float n1, float n2, char operation) {
        switch (operation) {
            case '+':
                System.out.println("Sum: " + sum(n1, n2));
                break;
            case '-':
                System.out.println("Subtraction: " + subtract(n1, n2));
                break;
            case '*':
                System.out.println("Multiplication: " + multiply(n1, n2));
                break;
            case '/':
                System.out.println("Division: " + divide(n1, n2));
                break;
            default:
                System.out.printf("%c is not a valid operator.\n", operation);
                break;
        }
    }

}
