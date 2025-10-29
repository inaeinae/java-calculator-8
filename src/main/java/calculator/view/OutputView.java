package calculator.view;

import calculator.domain.Numbers;

public class OutputView {

    public static void outputSum(Numbers numbers) {
        StringBuilder builder = new StringBuilder();
        builder.append(numbers.getNumbers().toString());
        builder.append(" => ");
        builder.append(numbers.getSum());
        System.out.println(builder.toString());
    }
}
