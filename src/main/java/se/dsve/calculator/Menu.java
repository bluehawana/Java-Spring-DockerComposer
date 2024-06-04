package se.dsve.calculator;

import se.dsve.calculator.calculatosService.CalculatorService;

import java.util.Scanner;

public class Menu {

    private CalculatorService calculatorService;

    public Menu(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    public void displayMenu() {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("\nWelcome to the Calculator");
                System.out.println("Choose an operation:");
                System.out.println("1 - Add");
                System.out.println("2 - Subtract");
                System.out.println("3 - Multiply");
                System.out.println("4 - Divide");
                System.out.println("5 - Exit");

                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                if (choice == 5) {
                    System.out.println("Exiting program.");
                    break;
                }

                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();

                double result = 0;
                boolean hasDecimal = (num1 != Math.floor(num1)) || (num2 != Math.floor(num2));

                try {
                    switch (choice) {
                        case 1:
                            result = calculatorService.add(num1, num2);
                            break;
                        case 2:
                            result = calculatorService.subtract(num1, num2);
                            break;
                        case 3:
                            result = calculatorService.multiply(num1, num2);
                            break;
                        case 4:
                            if (num2 == 0) {
                                System.out.println("Error: Division by zero is not allowed.");
                                continue;
                            }
                            result = calculatorService.divide(num1, num2);
                            break;
                        default:
                            System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                            continue;
                    }
                    if (hasDecimal) {
                        System.out.printf("Result: %.2f\n", result);
                    } else {
                        System.out.printf("Result: %.0f\n", result);
                    }
                } catch (Exception e) {
                    System.out.println("Error occurred: " + e.getMessage());
                }
            }
        }
    }
}
