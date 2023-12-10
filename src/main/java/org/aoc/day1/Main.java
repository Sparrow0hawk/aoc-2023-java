package org.aoc.day1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void solve() throws FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/day1.txt"));

        Calibration calibration = new Calibration();

        reader.lines().forEach(calibration::add_line);

        int total_calibration_values = calibration.values().stream().mapToInt(Integer::intValue).sum();

        System.out.println("Solution for day 1 is: " + total_calibration_values);
    }
}
