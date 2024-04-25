package org.abhinavgpt.models.game;

import org.abhinavgpt.models.move.Move;
import org.abhinavgpt.models.player.Player;

import java.util.List;

public final class Game {
    private Board board;
    private List<Player> players;
    private List<Move> moves;
    private int currentPlayerIndex;
    private Player winner;
    private GameState state;

    public Game(int dimension, List<Player> players) {
        this.board = new Board(dimension);
        this.players = players;
        this.currentPlayerIndex = 0;
        this.state = GameState.IN_PROGRESS;
        this.moves = List.of();
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public int getCurrentPlayerIndex() {
        return currentPlayerIndex;
    }

    public void setCurrentPlayerIndex(int currentPlayerIndex) {
        this.currentPlayerIndex = currentPlayerIndex;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public GameState getState() {
        return state;
    }

    public void setState(GameState state) {
        this.state = state;
    }
}
