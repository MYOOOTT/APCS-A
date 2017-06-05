package rltut;

import asciiPanel.AsciiPanel;
public class Fungus extends Creature
{
    private static int spreadcount;
    public Fungus(World world, CreatureFactory maker)
    {
        super(world, 'f', AsciiPanel.green, maker, 10, 0, 0);
        name = "fungus";
    }

    public void update(){
        if (spreadcount < world.width() * world.height() * .1 && Math.random() < .02)
            spread();
    }

    private void spread(){
        int x = this.x + (int)(Math.random() * 11) - 5;
        int y = this.y + (int)(Math.random() * 11) - 5;

        if (!this.canEnter(x, y))
            return;
        Creature child = factory.newFungus();
        child.x = x;
        child.y = y;
        spreadcount++;
        if (canSee(factory.player.x, factory.player.y)) {
            factory.addMessage("A fungus is spawned");
        }
    }
    
    public void modifyHP(int amount) {
        hp += amount;
        if(hp < 1) {
            world.remove(this);
            super.leaveCorpse();
            spreadcount--;
            if (canSee(factory.player.x, factory.player.y)) 
            factory.addMessage("The " + name + " dies.");
        }
    }
}

