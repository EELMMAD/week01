package se.lexicon.elmira;

import java.util.Scanner;

public class MainCalculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter two numbers: ");

        double firstNumber = reader.nextDouble();
        double secondNumber = reader.nextDouble();

        System.out.println("Enter an operator (+, -, *, /): ");
        char operator = reader.next().charAt(0);

        Calculator calculator = new Calculator();
        double result;

        switch (operator)
        {
            case '+':
                result = calculator.add(firstNumber, secondNumber);
                break;
            case '-':
               result =  calculator.Subtract(firstNumber, secondNumber);
                break;
            case '*':
               result = calculator.multiply(firstNumber, secondNumber);
                break;
            case '%':
               result =  calculator.division(firstNumber, secondNumber);
                break;

            // operator doesn't match any case constant (+, -, *, /)
            default:
                System.out.print("Error! operator is not correct");
                return;
        }
        System.out.printf("%.1f %c %.1f = %.1f", firstNumber, operator, secondNumber, result);
    }
}
