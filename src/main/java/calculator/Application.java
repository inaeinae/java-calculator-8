package calculator;

import calculator.controller.CalculatorController;
import calculator.service.CalculatorService;

public class Application {
    public static void main(String[] args) {
        CalculatorController calculatorController = new CalculatorController(new CalculatorService());
        calculatorController.start();
    }
}
