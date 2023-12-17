package org.aoc;

import org.aoc.day1.Calibration;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDay1 {

    @Test
    void testPart1() {

        String test = """
                1abc2
                pqr3stu8vwx
                a1b2c3d4e5f
                treb7uchet
                10000000001""";

        Calibration calibration = new Calibration();

        test.lines().forEach(calibration::add_line);

        calibration.parse_numbers();

        assertEquals(calibration.values().stream().mapToInt(Integer::intValue).sum(), 153);
    }

    @Test
    void testPart2() {
        String test = """
                two1nine
                eightwothree
                abcone2threexyz
                xtwone3four
                4nineeightseven2
                zoneight234
                7pqrstsixteen""";

        Calibration calibration = new Calibration();

        test.lines().forEach(calibration::add_line);

        calibration.parse_number_words();

        assertEquals(calibration.values().stream().mapToInt(Integer::intValue).sum(), 281);

    }

}

