package Backend.Board;

import java.util.Arrays;

public class Utility extends Property {
    private String name;
    private String type;
    private int price;
    private int mortgage;
    private int[] rent = new int[6];

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setMortgage(int mortgage) {
        this.mortgage = mortgage;
    }

    public void setRent(int[] rent) {
        this.rent = rent;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public int getMortgage() {
        return mortgage;
    }

    public int[] getRent() {
        return rent;
    }

    @Override
    public String toString() {
        return "Utility{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", mortgage=" + mortgage +
                ", rent=" + Arrays.toString(rent) +
                '}';
    }
}
