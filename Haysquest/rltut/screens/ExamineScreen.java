package rltut.screens;

import rltut.Creature;
import rltut.Item;
import rltut.Rock;
import rltut.Player;

public class ExamineScreen extends InventoryBasedScreen {

    public ExamineScreen(Creature player) {
        super(player);
    }

    protected String getVerb() {
        return "examine";
    }

    protected boolean isAcceptable(Item item) {
        return true;
    }

    protected Screen use(Item item) {
        String article = "aeiou".contains(item.name().subSequence(0, 1)) ? "an " : "a ";
        if (item instanceof Rock) {
           if (Math.random() < .1) {
               ( (Player) player).win();
            }

            player.getFactory().addMessage("You sniff the rock. It smells like the earth" + 
                " and has a musty smell.");
        }
        player.getFactory().addMessage("It's " + article + item.name() + "." + item.details());
        return null;

    }

}
