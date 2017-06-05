package rltut;


import asciiPanel.AsciiPanel;
public class Axe extends Weapon
{
   public Axe() {
       super('>', AsciiPanel.white, "axe");
       modifyAttackValue(10);
   }
}
