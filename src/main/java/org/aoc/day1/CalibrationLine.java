package org.aoc.day1;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CalibrationLine {

    private final Map<String, String> numbers = Map.of(
            "one","one1one",
            "two","two2two",
            "three","three3three",
            "four","four4four",
            "five", "five5five",
            "six","six6six",
            "seven","seven7seven",
            "eight","eight8eight",
            "nine","nine9nine"
    );

    private List<Character> tokens;
    private String line;

    public CalibrationLine(String line) {
        this.line = line;
    }

    public void parse_numbers() {
        tokens = line.chars().mapToObj(c -> (char) c).filter(Character::isDigit).collect(Collectors.toList());
    }

    public void parse_number_words() {
        for (String key: numbers.keySet()) {
            if (this.line.contains(key)) {
                this.line = this.line.replaceAll(key, numbers.get(key));
            }
        }
        tokens = line.chars().mapToObj(c -> (char) c).filter(Character::isDigit).collect(Collectors.toList());
    }


    public Integer value() {
        return Integer.parseInt(String.valueOf(tokens.getFirst()) + tokens.getLast());
    }
}
