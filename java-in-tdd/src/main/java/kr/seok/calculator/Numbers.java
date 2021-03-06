package kr.seok.calculator;

import kr.seok.calculator.pattern.CustomPattern;
import kr.seok.calculator.pattern.DefaultPattern;
import kr.seok.calculator.pattern.PatternSeparator;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * 숫자를 관리 할 일급 컬렉션
 */
public class Numbers {

    private final List<Number> numbers;

    private Numbers(String text) {
        this(text, new DefaultPattern());
    }

    protected Numbers(String text, PatternSeparator patternSeparator) {
        numbers = getExtractNumbers(text, patternSeparator);
    }

    public static Numbers of(String text) {
        if (isContainsCustomPatternText(text)) {
            return new Numbers(text, new CustomPattern());
        }
        return new Numbers(text);
    }

    private static boolean isContainsCustomPatternText(String text) {
        return text.startsWith(Validator.PREFIX_STRATEGY_CONDITION);
    }

    protected List<Number> getExtractNumbers(String text, PatternSeparator patternSeparator) {
        String[] stringsSeparatedBySeparator = patternSeparator.matches(text);

        return Arrays.stream(stringsSeparatedBySeparator)
                .map(Number::of)
                .collect(toList());
    }

    public int sumNumbers() {
        return numbers.stream()
                .mapToInt(Number::getNumber)
                .sum();
    }
}
