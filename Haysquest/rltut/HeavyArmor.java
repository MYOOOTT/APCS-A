package rltut;


import asciiPanel.AsciiPanel;
public class HeavyArmor extends Armor{
   public HeavyArmor() {
       super('[', AsciiPanel.brightYellow, "golden armor");
       modifyDefenseValue(6);
   }
}
