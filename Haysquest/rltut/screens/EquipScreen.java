package rltut.screens;

import rltut.Creature;
import rltut.Item;
import rltut.Weapon;
import rltut.Armor;

public class EquipScreen extends InventoryBasedScreen {

  public EquipScreen(Creature player) {
    super(player);
  }

  protected String getVerb() {
    return "wear or wield";
  }

  protected boolean isAcceptable(Item item) {
    return item instanceof Weapon || item instanceof Armor;
  }

  protected Screen use(Item item) {
    player.equip(item);
    return null;
  }
}