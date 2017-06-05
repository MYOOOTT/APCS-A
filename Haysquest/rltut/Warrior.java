package rltut;

import asciiPanel.AsciiPanel;
public class Warrior extends Player
{
    private int SWORD_BONUS = 10;
    private int regenRate;
    public Warrior(World world, CreatureFactory factory, FieldOfView pov) {
        super(world, '@', AsciiPanel.brightBlue, factory, pov, 150, 20, 5);
        name = "Warrior";
        regenRate = 1;
    }

    public void equip(Item item) {
        super.equip(item);
        if (item instanceof Sword) {
            atkValue += SWORD_BONUS;
        }
    }
    
    public void update() {
        modifyHP(regenRate);
    }

    public void unequip(Item item) {
        super.unequip(item);
        if (item instanceof Sword) {
            atkValue += SWORD_BONUS;
        }
    }
    
    public void gainRegen() {
        regenRate++;
    }
    
    public int regenRate() {
        return regenRate;
    }
}
