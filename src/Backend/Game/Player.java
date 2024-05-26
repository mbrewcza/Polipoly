package Backend.Game;

import Backend.Board.Card;
import Backend.Board.Property;

import java.util.ArrayList;

public class Player {
    private final String name;
    private final Figure figure;
    private int money = 0;
    private ArrayList<Property> properties;
    private ArrayList<Card> cards;
    private boolean isPlaying = true;
    private int position = 0;
    public Player(String name, Figure figure){
        this.name = name;
        this.figure = figure;
        properties = new ArrayList<>();
        cards = new ArrayList<>();
        money = 1500;
    }

    public void addProperty(Property property){
        properties.add(property);
    }

    public void removeProperty(Property property){
        try{
            if(!properties.contains(property)){
                throw new IllegalArgumentException("Player "+name+" doesn't own this property!");
            }
            properties.remove(property);
        } catch (IllegalArgumentException e){
            e.printStackTrace();
        }
    }

    public void setProperties(ArrayList<Property> properties) {
        this.properties = properties;
    }

    public void addCard(Card card){
        cards.add(card);
    }

    public void removeCard(Card card){
        try{
            if(!cards.contains(card)){
                throw new IllegalArgumentException("Player "+name+" doesn't own such card!");
            }
            cards.remove(card);
        } catch (IllegalArgumentException e){
            e.printStackTrace();
        }
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public void addMoney(int addedMoney){
        money = money + addedMoney;
    }

    public void subtractMoney(int subtractedMoney){
        try{
            if(money < subtractedMoney){
                throw new IllegalArgumentException("Player "+name+" doesn't have enough money!");
            }
            money = money - subtractedMoney;
        } catch (IllegalArgumentException e){
            e.printStackTrace();
        }
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setPlaying(boolean playing) {
        isPlaying = playing;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
