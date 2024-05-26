package Backend.Board;

import java.util.Arrays;

public class Street extends Property{
    private String name;
    private String colour;
    private int price;
    private int mortgage = price/2;
    private int housePrice;
    private int[] rent = new int[6];
    private int housesAmount = 0;
    private boolean hasHotel = false;
    public Street(){}

    public void addHouse(){
        housesAmount++;
    }

    public void removeHouse(){
        housesAmount--;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHasHotel(boolean b){
        this.hasHotel = b;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setMortgage(int mortgage) {
        this.mortgage = mortgage;
    }

    public void setHousePrice(int housePrice) {
        this.housePrice = housePrice;
    }

    public void setRent(int[] rent) {
        this.rent = rent;
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public int getPrice() {
        return price;
    }

    public int getMortgage() {
        return mortgage;
    }

    public int getHousePrice() {
        return housePrice;
    }

    public int[] getRent() {
        return rent;
    }

    @Override
    public String toString() {
        return "Street{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", price=" + price +
                ", mortgage=" + mortgage +
                ", housePrice=" + housePrice +
                ", rent=" + Arrays.toString(rent) +
                '}';
    }
}
