package org.aoc.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CalibrationLine {

    private List<String> tokens;

    public CalibrationLine(String line) {
        tokens = Arrays.stream(line.split("\\D+")).filter(s -> !s.isEmpty()).collect(Collectors.toList());
    }


    public Integer value() {
        return Integer.parseInt(tokens.getFirst().concat(tokens.getLast()));
    }
}
