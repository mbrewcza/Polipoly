package Backend.Game;

import Backend.Board.Board;
import Backend.Board.JSONPropertiesImporter;
import Backend.Board.Property;

public class Main {
    public static void main (String[] args){
        JSONPropertiesImporter jp = new JSONPropertiesImporter();
        jp.importProperties();
        for(Property p : jp.getAllProperties()){
            System.out.println(p.toString());
        }

        Board board = new Board();
        System.out.println(board.toString());
    }
}
