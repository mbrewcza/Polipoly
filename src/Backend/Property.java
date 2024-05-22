package Backend;


public abstract class Property extends Tile{
    private Player owner = null;

    public void setOwner(Player owner) {
        this.owner = owner;
    }
    public Player getOwner() {
        return owner;
    }
}
