import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        float n1 = 0;
        float n2 = 0;
        char operation;

        try {
            n1 = getUserInputFloat("Enter your first number: ");
            n2 = getUserInputFloat("Enter your second number: ");

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        }

        operation = getUserInput();

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
                // code to be executed when expression doesn't match any case
                break;
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
        System.out.print("Enter the operation you want to perform: ");
        String input = scanner.nextLine();

        char userInput = input.charAt(0);

        return userInput;
    }

}
