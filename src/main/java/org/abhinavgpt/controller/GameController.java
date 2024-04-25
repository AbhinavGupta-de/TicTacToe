package org.abhinavgpt.controller;

import org.abhinavgpt.models.game.Game;
import org.abhinavgpt.models.player.Player;

import java.util.List;

public class GameController {
    public Game startGame(int dimension, List<Player> players) {
        return new Game(dimension, players);
    }


}
