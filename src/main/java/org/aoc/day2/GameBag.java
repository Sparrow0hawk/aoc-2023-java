package org.aoc.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.aoc.day2.Game;

public class GameBag {
    private List<Game> games;
    private Integer red;
    private Integer blue;
    private Integer green;

    public GameBag() {
        this.games = new ArrayList<>();
    }

    public void set_colour(Integer red, Integer blue, Integer green) {
        this.red = red;
        this.blue = blue;
        this.green = green;
    }

    public void add_game(String line) {
        Game game = new Game(line);
        games.add(game);
    }

    public List<Game> valid_games() {
        return games.stream().filter(game -> game.is_valid(red, blue, green)).collect(Collectors.toList());
    }

}
