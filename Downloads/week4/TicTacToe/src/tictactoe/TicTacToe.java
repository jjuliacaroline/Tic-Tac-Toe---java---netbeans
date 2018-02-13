package tictactoe;

import java.util.Scanner;

public class TicTacToe {

    public static boolean stillPlaying = true;
    public static boolean win = false;
    public int count;
    public String player;
    public static String currentPlayer;
    public String computer;

    public static void main(String[] args) {

        Player p1 = new Human("X");
        Player p2 = new Computer("O");
        Player currPlayer = p1;
        BoardFunctions board = new BoardFunctions();

        board.initializeBoard();

        while (stillPlaying) {
                String coord = currPlayer.play();
                
                //sets the mark
                if (board.checkIfValid(coord, currPlayer.getMark())) {
                    board.setMark(coord, currPlayer.getMark());
                
                    if (currPlayer == p1) {
                        currPlayer = p2;
                    } else {
                        currPlayer = p1;
                    }
                }
                board.printCurrentBoard();
             
            if (board.checkForWin()) {
                break;
            }

        }
    }
}
