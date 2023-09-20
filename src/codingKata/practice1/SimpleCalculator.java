package codingKata.practice1;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert operator:");
        String operator = scanner.next();

        System.out.println("Please insert first number:");
        double number1Value = scanner.nextDouble();

        System.out.println("Please insert second number:");
        double number2Value = scanner.nextDouble();
        if (operator.equals("/") && number2Value == 0) {
            System.out.println("Invalid input. Please enter again the second number:");
            number2Value = scanner.nextDouble();
        }
        scanner.close();

        calculate(number1Value, number2Value, operator);
    }

    private static void calculate(double number1, double number2, String operator) {
        switch (operator) {
            case "+" -> System.out.println("Sum: " + (int) (number1 + number2));
            case "-" -> System.out.println("Dif: " + (int) (number1 - number2));
            case "*" -> System.out.println("Multiply: " + (int) (number1 * number2));
            case "/" -> System.out.println("Division: " + (number1 / number2));
            default -> System.out.println("Invalid operator.");
        }
    }
}