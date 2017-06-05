package rltut;

import java.awt.Color;
public class Food extends Item
{
    public Food(Color color, String name) {
        super('%', color, name);
    }
    private int foodValue;
    public int foodValue() {return foodValue; }
    public void modifyFoodValue(int amount) { foodValue += amount; }
    
}
