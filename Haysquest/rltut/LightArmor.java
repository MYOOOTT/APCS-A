package rltut;


import asciiPanel.AsciiPanel;
public class LightArmor extends Armor
{
   public LightArmor() {
       super('[', AsciiPanel.green, "cloth armor");
       modifyDefenseValue(2);
   }
}
