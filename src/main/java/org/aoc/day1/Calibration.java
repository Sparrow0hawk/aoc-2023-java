package org.aoc.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Calibration {

    private List<CalibrationLine> lineArr;

    public Calibration() {
        lineArr = new ArrayList<>();
    }

    public void add_line(String line) {
        lineArr.add(new CalibrationLine(line));
    }

    public List<Integer> values() {
        return lineArr.stream().map(CalibrationLine::value).collect(Collectors.toList());
    }

}
