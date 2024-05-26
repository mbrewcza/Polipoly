package Backend.Game;

import Backend.Board.Board;

import java.util.ArrayList;
import java.util.Random;

public class Game implements Runnable{
    private Board board;
    private ArrayList<Player> players;
    public Game(){
        board = new Board();
        players = new ArrayList<>();
    }

    @Override
    public void run() {

    }

    public int rollDices(){
        Random random = new Random();
        int randomNumber = random.nextInt(36)+1;
        if (randomNumber == 1) {return 2;}
        else if (randomNumber <= 3) {return 3;}
        else if (randomNumber <= 6) {return 4;}
        else if (randomNumber <= 10) {return 5;}
        else if (randomNumber <= 15) {return 6;}
        else if (randomNumber <= 21) {return 7;}
        else if (randomNumber <= 26) {return 8;}
        else if (randomNumber <= 30) {return 9;}
        else if (randomNumber <= 33) {return 10;}
        else if (randomNumber <= 35) {return 11;}
        else {return 12;}
    }
}
