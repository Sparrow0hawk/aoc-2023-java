package org.aoc.day2;

import org.aoc.day1.Calibration;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void solve() throws FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/day2.txt"));

        int red = 12;
        int blue = 14;
        int green = 13;

        GameBag game_bag = new GameBag(red, blue, green);

        reader.lines().forEach(game_bag::add_game);

        int total_valid_game_ids = game_bag.valid_games().stream().mapToInt(game -> game.id).sum();

        System.out.println("Solution for day 2 part 1 is: " + total_valid_game_ids);
    }

}
