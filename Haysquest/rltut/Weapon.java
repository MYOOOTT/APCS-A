package rltut;

import java.awt.Color;
public abstract class Weapon extends Item
{
    public Weapon(char glyph, Color color, String name) {
        super(glyph, color, name);
    }
    private int attackValue;
    public int attackValue() { return attackValue;}

    public void modifyAttackValue(int amount) { attackValue += amount; }
    
    public String details() {
        return "     attack:" + attackValue;
    }

}
