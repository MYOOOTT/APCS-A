package rltut;

import asciiPanel.AsciiPanel;
public class Rogue extends Player
{
    public Rogue(World world, CreatureFactory factory, FieldOfView pov) {
        super(world, '@', AsciiPanel.brightGreen, factory, pov, 80, 20, 2);
        name = "Rogue";
        visionRadius = 11;
    }

    public void attack(Creature other) {
        int amount = Math.max(0,atkValue() - other.defValue());
        amount = (int) (Math.random() * amount) + 1;
        other.modifyHP(-amount);
        if (canSee(factory.player.x, factory.player.y)) {
            if (weapon instanceof Dagger) {
                factory.addMessage("The " + name + " attacks the " + other.name + " twice for %d damage!", 
                    amount * 2);
                modifyHP(-amount);
            } else {
                factory.addMessage("The " + name + " attacks the " + other.name + " for %d damage.", 
                    amount);
            }
        }
        if (other.hp < 1)
            gainXP(other);
    }
}
