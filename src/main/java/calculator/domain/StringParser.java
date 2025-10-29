package calculator.domain;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StringParser {
    public static List<Integer> parseToNumbers(String input, List<String> separators) {
        String regex = String.join("|", separators.stream()
                .map(Pattern::quote)
                .toList());

        return Arrays.stream(input.split(regex))
                .map(StringParser::convertEmptyToZero)
                .map(StringParser::parseIntOrThrow)
                .collect(Collectors.toList());
    }

    private static String convertEmptyToZero(String s) {
        if (s.isEmpty()) {
            return "0";
        }
        return s;
    }

    private static int parseIntOrThrow(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("잘못된 입력값: " + s);
        }
    }
}
