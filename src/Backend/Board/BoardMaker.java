package Backend.Board;

import java.util.ArrayList;

public class BoardMaker {
    private ArrayList<Chance> chanceCards;
    private ArrayList<CommunityChest> communityChestCards;
    public void placeTiles(Board board){
        JSONPropertiesImporter jsonPropertiesImporter = new JSONPropertiesImporter();
        jsonPropertiesImporter.importProperties();
        setPositionsJSON(jsonPropertiesImporter);
        board.getTiles().add(new Tile().new START());
        board.getTiles().add(jsonPropertiesImporter.getAllProperties().get(0));
        board.getTiles().add(new Tile().new COMMUNITY_CHEST_TILE(2));
        board.getTiles().add(jsonPropertiesImporter.getAllProperties().get(1));
        board.getTiles().add(new Tile().new INCOME_TAX());
        board.getTiles().add(jsonPropertiesImporter.getAllProperties().get(22));
        board.getTiles().add(jsonPropertiesImporter.getAllProperties().get(2));
        board.getTiles().add(new Tile().new CHANCE_TILE(7));
        board.getTiles().add(jsonPropertiesImporter.getAllProperties().get(3));
        board.getTiles().add(jsonPropertiesImporter.getAllProperties().get(4));
        board.getTiles().add(new Tile().new JAIL());
        board.getTiles().add(jsonPropertiesImporter.getAllProperties().get(5));
        board.getTiles().add(jsonPropertiesImporter.getAllProperties().get(26));
        board.getTiles().add(jsonPropertiesImporter.getAllProperties().get(6));
        board.getTiles().add(jsonPropertiesImporter.getAllProperties().get(7));
        board.getTiles().add(jsonPropertiesImporter.getAllProperties().get(23));
        board.getTiles().add(jsonPropertiesImporter.getAllProperties().get(8));
        board.getTiles().add(new Tile().new COMMUNITY_CHEST_TILE(17));
        board.getTiles().add(jsonPropertiesImporter.getAllProperties().get(9));
        board.getTiles().add(jsonPropertiesImporter.getAllProperties().get(10));
        board.getTiles().add(new Tile().new PARKING());
        board.getTiles().add(jsonPropertiesImporter.getAllProperties().get(11));
        board.getTiles().add(new Tile().new CHANCE_TILE(22));
        board.getTiles().add(jsonPropertiesImporter.getAllProperties().get(12));
        board.getTiles().add(jsonPropertiesImporter.getAllProperties().get(13));
        board.getTiles().add(jsonPropertiesImporter.getAllProperties().get(24));
        board.getTiles().add(jsonPropertiesImporter.getAllProperties().get(14));
        board.getTiles().add(jsonPropertiesImporter.getAllProperties().get(15));
        board.getTiles().add(jsonPropertiesImporter.getAllProperties().get(27));
        board.getTiles().add(jsonPropertiesImporter.getAllProperties().get(16));
        board.getTiles().add(new Tile().new GO_TO_JAIL());
        board.getTiles().add(jsonPropertiesImporter.getAllProperties().get(17));
        board.getTiles().add(jsonPropertiesImporter.getAllProperties().get(18));
        board.getTiles().add(new Tile().new COMMUNITY_CHEST_TILE(33));
        board.getTiles().add(jsonPropertiesImporter.getAllProperties().get(19));
        board.getTiles().add(jsonPropertiesImporter.getAllProperties().get(25));
        board.getTiles().add(new Tile().new CHANCE_TILE(36));
        board.getTiles().add(jsonPropertiesImporter.getAllProperties().get(20));
        board.getTiles().add(new Tile().new LUXURY_TAX());
        board.getTiles().add(jsonPropertiesImporter.getAllProperties().get(21));
        setChanceCards();
        setCommunityChestCards();
    }
    public void setPositionsJSON(JSONPropertiesImporter jsonPropertiesImporter){
        jsonPropertiesImporter.getAllProperties().get(0).setPosition(1);
        jsonPropertiesImporter.getAllProperties().get(1).setPosition(3);
        jsonPropertiesImporter.getAllProperties().get(2).setPosition(6);
        jsonPropertiesImporter.getAllProperties().get(3).setPosition(8);
        jsonPropertiesImporter.getAllProperties().get(4).setPosition(9);
        jsonPropertiesImporter.getAllProperties().get(5).setPosition(11);
        jsonPropertiesImporter.getAllProperties().get(6).setPosition(13);
        jsonPropertiesImporter.getAllProperties().get(7).setPosition(14);
        jsonPropertiesImporter.getAllProperties().get(8).setPosition(16);
        jsonPropertiesImporter.getAllProperties().get(9).setPosition(18);
        jsonPropertiesImporter.getAllProperties().get(10).setPosition(19);
        jsonPropertiesImporter.getAllProperties().get(11).setPosition(21);
        jsonPropertiesImporter.getAllProperties().get(12).setPosition(23);
        jsonPropertiesImporter.getAllProperties().get(13).setPosition(24);
        jsonPropertiesImporter.getAllProperties().get(14).setPosition(26);
        jsonPropertiesImporter.getAllProperties().get(15).setPosition(27);
        jsonPropertiesImporter.getAllProperties().get(16).setPosition(29);
        jsonPropertiesImporter.getAllProperties().get(17).setPosition(31);
        jsonPropertiesImporter.getAllProperties().get(18).setPosition(32);
        jsonPropertiesImporter.getAllProperties().get(19).setPosition(34);
        jsonPropertiesImporter.getAllProperties().get(20).setPosition(37);
        jsonPropertiesImporter.getAllProperties().get(21).setPosition(39);
        jsonPropertiesImporter.getAllProperties().get(22).setPosition(5);
        jsonPropertiesImporter.getAllProperties().get(23).setPosition(12);
        jsonPropertiesImporter.getAllProperties().get(24).setPosition(15);
        jsonPropertiesImporter.getAllProperties().get(25).setPosition(25);
        jsonPropertiesImporter.getAllProperties().get(26).setPosition(28);
        jsonPropertiesImporter.getAllProperties().get(27).setPosition(35);
    }
    public void setChanceCards(){
    }
    public void setCommunityChestCards(){
    }
}
