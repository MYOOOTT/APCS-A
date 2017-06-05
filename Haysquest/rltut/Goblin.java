package rltut;
import asciiPanel.AsciiPanel;
import java.util.List;
public class Goblin extends Creature
{
    private Player player;
    public Goblin(World world, CreatureFactory maker, Player p) {
        super(world, 'g', AsciiPanel.brightGreen, maker, 66, 15, 0);
        player = p;
        name = "goblin";
        visionRadius = 5;
    }

    public void leaveCorpse(){
        super.leaveCorpse();
        for (Item item : inventory.getItems()){
            if (item != null)
                drop(item);
        }
    }

    public void update() {
        if (canSee(player.x, player.y) && player.level() > 1)
            hunt(player);
        else
            wander();
    }

    public void wander(){
        int mx = (int) (Math.random() * 5) - 1;
        int my = (int) (Math.random() * 5) - 1;
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
}