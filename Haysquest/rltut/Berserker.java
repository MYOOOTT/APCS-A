package rltut;

import asciiPanel.AsciiPanel;
public class Berserker extends Player
{
    private int AXE_BONUS = 5;
    private int rageBonus;
    public Berserker(World world, CreatureFactory factory, FieldOfView pov) {
        super(world, '@', AsciiPanel.brightRed, factory, pov, 100, 20, 2);
        name = "Berserker";
        rageBonus = 0;
    }

    public void equip(Item item) {
        super.equip(item);
        if (item instanceof Axe) {
            atkValue += AXE_BONUS;
        }
    }

    public void modifyHP(int amount) {
        super.modifyHP(amount);
        if (hp() < maxHP() * .1) {
            rageBonus = 50;
            factory.addMessage("You succumb to your rage.");
        } else if (hp() < maxHP() * .25) {
            rageBonus = 30;
            factory.addMessage("Your blood boils in your veins.");
        } else if (hp() < maxHP() * .5) {
            rageBonus = 15;
            factory.addMessage("You feel slightly irritated.");
        }else if (hp() < maxHP() * .75) {
            rageBonus = 5;
            factory.addMessage("You feel annoyed.");
        }
    }

    public void attack(Creature other){
        int amount = Math.max(0,(atkValue() - other.defValue() + rageBonus));
        amount = (int) (Math.random() * amount) + 1;
        other.modifyHP(-amount);
        if (canSee(factory.player.x, factory.player.y))
            factory.addMessage("The " + name + " attacks the " + other.name + " for %d damage.", 
                amount);
        if (other.hp < 1)
        gainXP(other);
    }

    public void unequip(Item item) {
        super.unequip(item);
        if (item instanceof Axe) {
            atkValue -= AXE_BONUS;
        }
    }
}
