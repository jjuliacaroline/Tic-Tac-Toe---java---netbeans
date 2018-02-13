package tictactoe;

import java.util.Scanner;

public class BoardFunctions  {

    String board[][] = new String[3][3];

    String player;
    String computer;
    String currentPlayer;
    int turn;
    int count;
    public String mark;

    public BoardFunctions() {

    }

    public void initializeBoard() {

        board[0][0] = "";
        board[0][1] = "";
        board[0][2] = "";

        board[1][0] = "";
        board[1][1] = "";
        board[1][2] = "";

        board[2][0] = "";
        board[2][1] = "";
        board[2][2] = "";

        printCurrentBoard();

    }

    public void printCurrentBoard() {
        int rows = 3;
        int columns = 3;
        int i, j;

        String letter = "";
        for (i = 0; i < rows; i++) {
            if (i == 0) {
                letter = "A";
            } else if (i == 1) {
                letter = "B";
            } else if (i == 2) {
                letter = "C";
            }
            for (j = 0; j < columns; j++) {
                if (board[i][j] == "") {
                    System.out.print(letter + (j + 1) + " ");
                } else {
                    System.out.print(board[i][j] + " ");
                }
            }
            System.out.println();
        }
    }


    
    public void setMark(String coordinate, String mark) {
//katso onko lauta tyhjä vai onko sen paikalla jotain

        int value = 0;
        int value2 = 0;

        int i, j;
        for (i = 0; i < board.length; i++) {
            for (j = 0; j < board[i].length - 1; j++) {

            }

                if (coordinate.startsWith("A")) {
                    value = 0;
                } else if (coordinate.startsWith("B")) {
                    value = 1;
                } else if (coordinate.startsWith("C")) {
                    value = 2;
                }

                if (coordinate.endsWith("1")) {
                    value2 = 0;
                } else if (coordinate.endsWith("2")) {
                    value2 = 1;
                } else if (coordinate.endsWith("3")) {
                    value2 = 2;
                }

                if (board[value][value2].equals("")) {
                    board[value][value2] = mark;
                }              
        }
    }

    public boolean checkIfValid(String coordinate, String mark) {
        
        System.out.println("Player " + mark + " played " + coordinate);
       
        int value = 0;
        int value2 = 0;
        
        if (coordinate.startsWith("A")) {
            value = 0;
        } else if (coordinate.startsWith("B")) {
            value = 1;
            
        } else if (coordinate.startsWith("C")) {
            value = 2;
        }
        
        if (coordinate.endsWith("1")) {
            value2 = 0;
        } else if (coordinate.endsWith("2")) {
            value2 = 1;
        } else if (coordinate.endsWith("3")) {
            value2 = 2;
        }
        
        if (board[value][value2].equals("")) {
            return true;
        } else {
            return false;
        }
        
    }

    public boolean checkForWin() {

        //logic for win for rows 0, 1 and 2
        if (board[0][0].equals("X") && board[0][1].equals("X") && board[0][2].equals("X")) {
            System.out.println("Player won");
            return true;
        } else if (board[0][0].equals("O") && board[0][1].equals("O") && board[0][2].equals("O")) {
            System.out.println("Computer won");
            return true;
        } else if (board[1][0].equals("X") && board[1][1].equals("X") && board[1][2].equals("X")) {
            System.out.println("Player won");
            return true;
        } else if (board[1][0].equals("O") && board[1][1].equals("O") && board[1][2].equals("O")) {
            System.out.println("Computer won");
            return true;
        } else if (board[2][0].equals("X") && board[2][1].equals("X") && board[2][2].equals("X")) {
            System.out.println("Player won");
            return true;
        } else if (board[2][0].equals("O") && board[2][1].equals("O") && board[2][2].equals("O")) {
            System.out.println("Computer won");
            return true;
        } //logic for win for columns 0, 1, 2
        else if (board[0][0].equals("X") && board[1][0].equals("X") && board[2][0].equals("X")) {
            System.out.println("Player won");
            return true;

        } else if (board[0][0].equals("O") && board[1][0].equals("O") && board[2][0].equals("O")) {
            System.out.println("Computer won");
            return true;

        } else if (board[0][1].equals("O") && board[1][1].equals("O") && board[2][1].equals("O")) {
            System.out.println("Computer won");
            return true;

        } else if (board[0][1].equals("X") && board[1][1].equals("X") && board[2][1].equals("X")) {
            System.out.println("Player won");
            return true;

        } else if (board[0][2].equals("X") && board[1][2].equals("X") && board[2][2].equals("X")) {
            System.out.println("Player won");
            return true;

        } else if (board[0][2].equals("O") && board[1][2].equals("O") && board[2][2].equals("O")) {
            System.out.println("Computer won");
            return true;

            //logic for win for diagonal rows
        } else if (board[0][0].equals("O") && board[1][1].equals("O") && board[2][2].equals("O")) {
            System.out.println("Computer won");
            return true;

        } else if (board[0][0].equals("X") && board[1][1].equals("X") && board[2][2].equals("X")) {
            System.out.println("Player won");
            return true;

        } else if (board[0][2].equals("O") && board[1][1].equals("O") && board[2][0].equals("O")) {
            System.out.println("Computer won");
            return true;

        } else if (board[0][2].equals("X") && board[1][1].equals("X") && board[2][0].equals("X")) {
            System.out.println("Player won");
            return true;

        } else {
            return false;
        }
    }

}
