package rltut;

import java.awt.Color;
public abstract class Armor extends Item
{
    public Armor(char glyph, Color color, String name) {
        super(glyph, color, name);
    }
    private int defenseValue;
    public int defenseValue() { return defenseValue; }

    public void modifyDefenseValue(int amount) { defenseValue += amount; }
    
    
    public String details() {
        return "     defense:" + defenseValue;
    }
    
}
