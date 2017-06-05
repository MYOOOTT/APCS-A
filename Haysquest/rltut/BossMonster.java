package rltut;

import java.awt.Color;
import asciiPanel.AsciiPanel;
import java.util.List;
public class BossMonster extends Creature
{
    private Player player;
    public BossMonster(World world, CreatureFactory maker, Player p){
        super(world, 'Z', AsciiPanel.brightWhite, maker, 300, 40, 20);
        player = p;
        name = "boss";
    }

    public void update(){
        if (Math.random() < 0.2)
            return;

        if (canSee(player.x, player.y) && player.level() > 1)
            hunt(player);
        else
            wander();
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

    public void hunt(Creature target){
        List<Point> points = new Path(this, target.x, target.y).points();

        int mx = points.get(0).x - x;
        int my = points.get(0).y - y;

        moveBy(mx, my);
    }
    
        public void onGainLevel() {
    }
}
