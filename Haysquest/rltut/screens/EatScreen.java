package rltut.screens;

import rltut.Creature;
import rltut.Item;
import rltut.Food;

public class EatScreen extends InventoryBasedScreen {

    public EatScreen(Creature player) {
        super(player);
    }

    protected String getVerb() {
        return "eat";
    }

    protected boolean isAcceptable(Item item) {
        return item instanceof Food;
    }

    protected Screen use(Item item) {
        player.eat((Food) item);
        return null;
    }
}
