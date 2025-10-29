package calculator.domain;

import java.util.List;

public class Numbers {
    private final List<Integer> numbers;

    private Numbers(final List<Integer> numbers) {
        this.numbers = numbers;
    }

    public static Numbers from(final List<Integer> numbers) {
        return new Numbers(numbers);
    }

    public Integer getSum() {
        return numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
