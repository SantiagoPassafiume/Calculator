import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        float n1 = getUserInputFloat("Please enter your first number: ");
        float n2 = getUserInputFloat("Please enter your second number: ");

    }

    public static float sum(float n1, float n2) {
        return n1 + n2;
    }

    public static float substract(float n1, float n2) {
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
