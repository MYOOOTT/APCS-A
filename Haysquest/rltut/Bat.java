package rltut;

import asciiPanel.AsciiPanel;
public class Bat extends Creature
{
    public Bat(World world, CreatureFactory maker){
        super(world, 'b', AsciiPanel.yellow, maker, 15, 5, 0);
        name = "bat";
    }

    public void wander(){
        int mx = (int) (Math.random() * 3) - 1;
        int my = (int) (Math.random() * 3) - 1;
        Creature other = world.creatureAt(x + mx, y + my);
        if (other != null && other.glyph() == glyph())
            return;
        else
            moveBy(mx,my);
    }

    public void update() {
        wander();
    }
}
