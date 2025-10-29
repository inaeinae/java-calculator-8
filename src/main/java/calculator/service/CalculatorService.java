package calculator.service;

import calculator.domain.Numbers;
import calculator.view.InputView;
import calculator.view.OutputView;

public class CalculatorService {
    public Numbers getAddendString() {
        return InputView.inputString();
    }

    public void calculateNumber(Numbers numbers) {
        OutputView.outputSum(numbers);
    }
}
