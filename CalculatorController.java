public class CalculatorController {
    private Calculator calculator;
    private CalculatorView view;
    private Logger logger;

    public CalculatorController(Calculator calculator, CalculatorView view, Logger logger) {
        this.calculator = calculator;
        this.view = view;
        this.logger = logger;
    }

    public void start() {
        view.displayWelcomeMessage();

        while (true) {
            String choice = view.getOperationChoice();
            ComplexNumber result = null;

            switch (choice) {
                case "1":
                    ComplexNumber[] numbersToAdd = view.getOperands();
                    result = calculator.add(numbersToAdd[0], numbersToAdd[1]);
                    break;
                case "2":
                    ComplexNumber[] numbersToMultiply = view.getOperands();
                    result = calculator.multiply(numbersToMultiply[0], numbersToMultiply[1]);
                    break;
                case "3":
                    ComplexNumber[] numbersToDivide = view.getOperands();
                    result = calculator.divide(numbersToDivide[0], numbersToDivide[1]);
                    break;
                case "0":
                    view.displayGoodbyeMessage();
                    return;
                default:
                    view.displayErrorMessage();
                    continue;
            }

            view.displayResult(result);
            logger.log("Выполнена операция: " + choice);
        }
    }
}
