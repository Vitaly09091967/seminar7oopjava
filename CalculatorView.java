import java.util.Scanner;

public class CalculatorView {
    private Scanner scanner;

    public CalculatorView() {
        this.scanner = new Scanner(System.in);
    }

    public void displayWelcomeMessage() {
        System.out.println("Добро пожаловать в калькулятор комплексных чисел!");
    }

    public void displayGoodbyeMessage() {
        System.out.println("До свидания!");
    }

    public void displayErrorMessage() {
        System.out.println("Неверный выбор. Пожалуйста, попробуйте ещё раз.");
    }

    public String getOperationChoice() {
        System.out.println("\nПожалуйста, выберите операцию:");
        System.out.println("1. Сложение");
        System.out.println("2. Умножение");
        System.out.println("3. Деление");
        System.out.println("0. Выход");

        return scanner.nextLine();
    }

    public ComplexNumber[] getOperands() {
        ComplexNumber[] operands = new ComplexNumber[2];

        for (int i = 0; i < 2; i++) {
            System.out.println("\nВведите комплексное число " + (i + 1) + " (format: real imaginary):");
            double real = scanner.nextDouble();
            double imaginary = scanner.nextDouble();
            scanner.nextLine(); 
            operands[i] = new ComplexNumber(real, imaginary);
        }

        return operands;
    }

    public void displayResult(ComplexNumber result) {
        System.out.println("\nРезультат: " + result);
    }
}
