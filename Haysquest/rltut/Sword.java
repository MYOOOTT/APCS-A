package rltut;


import asciiPanel.AsciiPanel;
public class Sword extends Weapon
{
   public Sword() {
       super('|', AsciiPanel.brightWhite, "sword");
       modifyAttackValue(10);
   }
}
