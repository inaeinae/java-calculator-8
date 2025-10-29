package calculator.view;


import calculator.domain.Numbers;
import calculator.domain.StringParser;
import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class InputView {

    private static final String CUSTOM_SEPARATOR_PREFIX = "//";
    private static final List<String> NUMBER_SEPARATORS = new ArrayList<>(List.of(",", ":"));

    public static Numbers inputString() {
        System.out.println("덧셈할 문자열을 입력해 주세요.");

        String input = Console.readLine();
        input = addCustomSeparators(input);

        return Numbers.from(StringParser.parseToNumbers(input, NUMBER_SEPARATORS));
    }

    private static String addCustomSeparators(String input) {
        if (!input.startsWith(CUSTOM_SEPARATOR_PREFIX)) {
            return input;
        }

        String custom = input.replace(CUSTOM_SEPARATOR_PREFIX, "");
        NUMBER_SEPARATORS.add(custom);

        return Console.readLine();
    }
}
