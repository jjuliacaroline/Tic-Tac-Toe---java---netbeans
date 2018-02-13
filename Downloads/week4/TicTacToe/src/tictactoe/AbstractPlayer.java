package tictactoe;

abstract class AbstractPlayer implements Player {

    public String mark;
    
    AbstractPlayer(String mark) {
        this.mark = mark;
    }

    @Override
    public String getMark() {
        return this.mark;        
    }

}
