package rltut;
import java.awt.Color;
import rltut.FieldOfView;
public class Player extends Creature {
    private FieldOfView fov;
    private boolean supersecretwincondition;
    public Player(World world, char glyph, Color color, CreatureFactory maker,
    FieldOfView pov, int maxHp, int attack, int defense)  {
        super(world, glyph, color, maker, maxHp, attack, defense);
        fov = pov;
        name = "player";
        supersecretwincondition = false;
    }

    public void pickup(){
        Item item = world.item(x, y);

        if (inventory.isFull() || item == null){
            factory.addMessage("You grab at the ground");
        } else {
            factory.addMessage("You pickup a %s", item.name());
            world.remove(x, y);
            inventory.add(item);
        }
    }

    public void drop(Item item){
        factory.addMessage("You drop a " + item.name());
        inventory.remove(item);
        world.addAtEmptySpace(item, x, y);
    }

    public void moveBy(int x, int y) {
        int futureX = this.x + x;
        int futureY = this.y + y;

        if (world.tile(futureX,futureY).isDiggable()) {
            dig(futureX, futureY);
        } else {
            if (world.tile(futureX,futureY).isGround())  {
                Item item = world.item(futureX, futureY);
                if (item != null)
                    factory.addMessage("There's a " + item.name() + " here.");
            }
            super.moveBy(x,y);
        } 
    }

    public void attack(Creature other) {
        super.attack(other);
        other.attack(this);
    }

    public boolean canSee(int wx, int wy) {
        return fov.isVisible(wx, wy);
    }
    
    public void win() {
        supersecretwincondition = true;
    }
    
    public boolean winnerwinnerchickendinner() {
        return supersecretwincondition;
    }
    
    public void onGainLevel() {
    }
}
