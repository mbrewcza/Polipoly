package Backend.Board;


import Backend.Game.Player;

public abstract class Property extends Tile{
    private Player owner = null;
    private boolean isMortgaged = false;

    public void setOwner(Player owner) {
        this.owner = owner;
    }

    public void setMortgaged(boolean mortgaged) {
        isMortgaged = mortgaged;
    }

    public Player getOwner() {
        return owner;
    }
    public boolean isMortgaged() {
        return isMortgaged;
    }
}
