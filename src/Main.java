package src;


import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello welcome to tic tac toe game!");
        System.out.println("Please enter the number of rows & columns!");

        int rows = scanner.nextInt();
        Random random = new Random(1000);
        int gameId = random.nextInt();
        Game tictactoe = new Game(gameId, "test", "KAJ", rows);
        int result = 3;
        int curPlayer = 0;
        while(result != 1 || result != 0){
            System.out.println("Please enter the move ! row and column");
           int rowIn =  scanner.nextInt();
           int colIn = scanner.nextInt();
           tictactoe.move(curPlayer,rowIn,colIn,tictactoe.board.board);
           if(curPlayer == 0){
               curPlayer = 1;
           }
           else{
               curPlayer = 0;
           }

           tictactoe.moves.add(tictactoe.board);
            System.out.println(tictactoe.board.board[1][1]);
           tictactoe.board.printCurrentState(tictactoe.board);
        }


    }
}