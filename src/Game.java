package src;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Game {
    int gameId;
    String userIdOne;
    String userIdTwo;
    List<Board> moves;
    Board board;

    public Game(int gameId, String userIdOne, String userIdTwo, int row_column) {
        this.gameId = gameId;
        this.userIdOne = userIdOne;
        this.userIdTwo = userIdTwo;
        this.moves = new ArrayList<>();
        this.board = new Board(row_column, row_column);
    }

    public int move(int player, int row, int column, int[][] board) {
        if (row < 0 || column < 0 || row > board.length || column > board.length) {
            new TicTacToeException("Out of bound input");
        } else if (board[row][column] != 0) {
            new TicTacToeException("Entry already exists");
        } else if (player != 0 || player != 1) {
            new TicTacToeException("Invalid player");
        } else {
            player = player == 0 ? -1 : 1;
            board[row][column] = player;
            boolean winRow = true;
            boolean winCol = true;
            boolean winDia1 = true;
            boolean winDia2 = true;
            for (int i = 0; i < board.length; i++) {
                if (board[row][i] != player) {
                    winRow = false;
                }
                if (board[i][column] != player) {
                    winCol = false;
                }
                if (board[i][i] != player) {
                    winDia1 = false;
                }
                if (board[i][board.length - 1 - i] != player) {
                    winDia2 = false;
                }

            }
            if (winRow || winCol || winDia1 || winDia2) {
                return player;
            }
        }
        return 0;
    }

}
