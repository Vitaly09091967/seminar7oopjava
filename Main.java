public class Main {
    public static void main(String[] args) {
        Calculator calculator = new BasicCalculator();
        CalculatorView view = new CalculatorView();
        Logger logger = new ConsoleLogger();
        CalculatorController controller = new CalculatorController(calculator, view, logger);

        controller.start();
    }
}
