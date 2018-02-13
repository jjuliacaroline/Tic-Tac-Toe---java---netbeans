package tictactoe;

import java.util.Scanner;

public class Human extends AbstractPlayer {

    Scanner sc = new Scanner(System.in);
    public String mark;

    Human(String mark) {
        super(mark);
    }

    @Override
    public String play() {
        return sc.nextLine();
    }

}
