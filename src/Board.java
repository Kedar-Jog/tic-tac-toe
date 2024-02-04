package src;

public class Board {
    int row;
    int column;
    int board[][];

    public Board(int row, int column) {
        this.row = row;
        this.column = column;
        this.board = new int[row][column];
    }

    public Board initialize() {
        return new Board(3, 3);
    }

    public int[][] getBoard() {
        return board;
    }

    public void printCurrentState(Board board) {
        for (int i = 0; i < board.row; i++) {
            for (int j = 0; j < board.row; j++) {
                System.out.print(board.getBoard()[i][j] + "|");
            }
            System.out.println();
            for (int k = 0; k < board.row * 2; k++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }


    public int getWinner() {
        //TODO: yet to be implemented
        return 1;
    }

    public int getCurrentPlayer() {
        //TODO: yet to be implemented
        return 0;
    }


}
