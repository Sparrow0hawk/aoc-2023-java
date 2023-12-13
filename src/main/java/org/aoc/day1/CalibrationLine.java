package org.aoc.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CalibrationLine {

    private List<Character> tokens;
    private final String line;

    public CalibrationLine(String line) {
        this.line = line;
    }

    public void parse_numbers() {
        tokens = line.chars().mapToObj(c -> (char) c).filter(Character::isDigit).collect(Collectors.toList());
    }


    public Integer value() {
        return Integer.parseInt(String.valueOf(tokens.getFirst()) + tokens.getLast());
    }
}
