package org.aoc.day2;

public class Play {
    public Integer red = 0;
    public Integer blue = 0;
    public Integer green = 0;
    public Play(String play_line) {
        for(String cube: play_line.split(",")) {
            String cube_count = cube.strip().split(" ")[0];
            String cube_colour = cube.strip().split(" ")[1];
            switch (cube_colour) {
                case "red" -> this.red = Integer.parseInt(cube_count);
                case "blue" -> this.blue = Integer.parseInt(cube_count);
                case "green" -> this.green = Integer.parseInt(cube_count);
                default -> throw new RuntimeException("Unexpected cube colour");
            }
        }
    }


}
