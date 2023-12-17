package org.aoc;

import org.aoc.day2.GameBag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDay2 {
    @Test
    void part1() {
        String test = """
                Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green
                Game 2: 1 blue, 2 green; 3 green, 4 blue, 1 red; 1 green, 1 blue
                Game 3: 8 green, 6 blue, 20 red; 5 blue, 4 red, 13 green; 5 green, 1 red
                Game 4: 1 green, 3 red, 6 blue; 3 green, 6 red; 3 green, 15 blue, 14 red
                Game 5: 6 red, 1 blue, 3 green; 2 blue, 1 red, 2 green""";

        int red = 12;
        int green = 13;
        int blue = 14;

        GameBag game_bag = new GameBag(red, blue, green);

        test.lines().forEach(game_bag::add_game);

        assertEquals(game_bag.valid_games().stream().mapToInt(game -> game.id).sum(), 8);
    }
}
