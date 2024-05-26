package Backend.Board;

public class Tile {
    private int position;

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public class START extends Tile {
            public START(){
                this.setPosition(0);
            }
    }

    public class COMMUNITY_CHEST_TILE extends Tile {
            public COMMUNITY_CHEST_TILE(int position){
                try {
                    if(position ==2 || position ==17 || position==33){
                        this.setPosition(position);
                    }
                    else {
                        throw new IllegalAccessException("Wrong position for a community chest tile!");
                    }
                } catch (IllegalAccessException e){
                    e.printStackTrace();
                }
            }
    }

    public class INCOME_TAX extends Tile {
            public INCOME_TAX(){
                this.setPosition(4);
            }
    }

    public class CHANCE_TILE extends Tile {
        public CHANCE_TILE(int position){
            try {
                if(position ==7 || position ==22 || position==36){
                    this.setPosition(position);
                }
                else {
                    throw new IllegalAccessException("Wrong position for a chance tile!");
                }
            } catch (IllegalAccessException e){
                e.printStackTrace();
            }
        }
    }

    public class JAIL extends Tile {
        public JAIL(){
            this.setPosition(10);
        }
    }

    public class PARKING extends Tile {
        public PARKING(){
            this.setPosition(20);
        }
    }

    public class GO_TO_JAIL extends Tile {
        public GO_TO_JAIL(){
            this.setPosition(30);
        }
    }

    public class LUXURY_TAX extends Tile {
        public LUXURY_TAX() {
            this.setPosition(38);
        }
    }
}


