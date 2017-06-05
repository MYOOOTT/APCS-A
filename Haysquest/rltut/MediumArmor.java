package rltut;


import asciiPanel.AsciiPanel;
public class MediumArmor extends Armor
{
   public MediumArmor() {
       super('[', AsciiPanel.white, "chainmail");
       modifyDefenseValue(4);
   }
}
