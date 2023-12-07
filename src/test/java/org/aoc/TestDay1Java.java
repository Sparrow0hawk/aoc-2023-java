package org.aoc;

import org.aoc.day1.Calibration;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDay1Java {

    @Test
    void testPart1() {

        String test = """
                1abc2
                pqr3stu8vwx
                a1b2c3d4e5f
                treb7uchet""";

        Calibration calibration = new Calibration();

        test.lines().forEach(calibration::add_line);

        assertEquals(calibration.values().stream().mapToInt(Integer::intValue).sum(), 142);
    }


}
