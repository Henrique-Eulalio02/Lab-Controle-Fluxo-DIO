import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number1, number2;

        System.out.println("Enter your first number: ");
        number1 = s.nextInt();

        System.out.println("Enter your second number: ");
        number2 = s.nextInt();

        try {
            counter(number1, number2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("The second number must be greater than the first one");
        }
    }

    static void counter(int number1, int number2) throws ParametrosInvalidosException {
        if (number1 > number2) {
            throw new ParametrosInvalidosException();
        }

        int counter = number2 - number1;

        for (int i = 1; i <= counter; i++) {
            System.out.println("Printing number: " + i);
        }
    }
}
