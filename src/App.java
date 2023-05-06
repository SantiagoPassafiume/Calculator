import java.util.Scanner;

public class App {

    public static void main(String[] args) {

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
        return n1 / n2;
    }

    public static float getUserInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        float input = scanner.nextFloat();
        scanner.close();
        return input;
    }

}
