package org.aoc.day2;

import java.util.ArrayList;
import java.util.List;
public class Game {
    public Integer id;
    private List<Play> plays;


    public Game(String line) {
        this.id = this.get_id(line);
        this.plays = new ArrayList<>();
        for(String play_string: line.split(":")[1].split(";")) {
            Play play = new Play(play_string);
            this.plays.add(play);
        }
    }

    public Integer get_id(String line) {
        return Integer.parseInt(line.split(":")[0].split(" ")[1]);
    }

    public boolean is_valid(Integer red, Integer blue, Integer green) {
        return plays.stream().allMatch(play -> play.red <= red & play.blue <= blue & play.green <= green);
    }
}
