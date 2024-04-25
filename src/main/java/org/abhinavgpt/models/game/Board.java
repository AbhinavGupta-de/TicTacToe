package org.abhinavgpt.models.game;

import org.abhinavgpt.models.cell.Cell;

import java.util.ArrayList;
import java.util.List;

public final class Board {
    private int size;
    private List<List<Cell>> board;

    public Board(int size) {
        board = new ArrayList<>();
        this.size = size;
        for (int i = 0; i < size; i++) {
            List<Cell> row = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                row.add(new Cell(i, j));
            }
            board.add(row);
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<List<Cell>> getBoard() {
        return board;
    }

    public void setBoard(List<List<Cell>> board) {
        this.board = board;
    }
}