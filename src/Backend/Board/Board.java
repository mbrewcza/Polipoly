package Backend.Board;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private ArrayList<Tile> tiles;
    private ArrayList<Chance> chanceCards;
    private ArrayList<CommunityChest> communityChestCards;
    public Board(){
        this.tiles = new ArrayList<>();
        this.chanceCards = new ArrayList<>();
        this.communityChestCards = new ArrayList<>();
        BoardMaker boardMaker = new BoardMaker();
        boardMaker.placeTiles(this);
    }

    public ArrayList<Tile> getTiles() {
        return tiles;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Board:").append("\n");
        for(Tile t : tiles){
           if(t instanceof Street s){
               sb.append(s.getName()).append("\n");
           }
           else if(t instanceof Utility u) {
               sb.append(u.getName()).append("\n");
           }
           else sb.append(t.toString()).append("\n");
        }
        return sb.toString();
    }
}
