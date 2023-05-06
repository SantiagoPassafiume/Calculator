import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        float firstNumber;
        float secondNumber;
        char operation;
        Scanner scanner = new Scanner(System.in);

        try {
            firstNumber = getUserInputFloat("Enter your first number: ", scanner);
            secondNumber = getUserInputFloat("Enter your second number: ", scanner);
            scanner.nextLine(); // Consume the newline character
            operation = getUserInput("Enter the operation you want to perform: ", scanner);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid numbers.");
            return;
        }

        performOperation(firstNumber, secondNumber, operation);

        scanner.close();

    }

    public static float sum(float firstNumber, float secondNumber) {
        return firstNumber + secondNumber;
    }

    public static float subtract(float firstNumber, float secondNumber) {
        return firstNumber - secondNumber;
    }

    public static float multiply(float firstNumber, float secondNumber) {
        return firstNumber * secondNumber;
    }

    public static float divide(float firstNumber, float secondNumber) {
        if (secondNumber == 0) {
            ArithmeticException exception = new ArithmeticException("Division by zero is not allowed.");
            exception.setStackTrace(new StackTraceElement[0]);
            throw exception;
        }
        return firstNumber / secondNumber;
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

    public static void performOperation(float firstNumber, float secondNumber, char operation) {
        switch (operation) {
            case '+':
                System.out.println("Sum: " + sum(firstNumber, secondNumber));
                break;
            case '-':
                System.out.println("Subtraction: " + subtract(firstNumber, secondNumber));
                break;
            case '*':
                System.out.println("Multiplication: " + multiply(firstNumber, secondNumber));
                break;
            case '/':
                System.out.println("Division: " + divide(firstNumber, secondNumber));
                break;
            default:
                System.out.printf("%c is not a valid operator.\n", operation);
                break;
        }
    }

}
