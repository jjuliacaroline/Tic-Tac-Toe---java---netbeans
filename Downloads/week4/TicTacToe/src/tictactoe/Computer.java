package tictactoe;

import java.util.Random;

public class Computer extends AbstractPlayer {
    
    BoardFunctions board = new BoardFunctions();
    
        Random rand = new Random();
        String[] arr = {"A1", "A2", "A3", "B1", "B2", "B3", "C1", "C2", "C3"};

    // private String mark;
    public Computer(String mark) {
        super(mark);
    }

    
    @Override
    public String play() {

        
        return arr[rand.nextInt(arr.length)];
    }

}
