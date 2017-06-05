package rltut;


import asciiPanel.AsciiPanel;
public class Dagger extends Weapon
{
   public Dagger() {
       super(';', AsciiPanel.white, "dagger");
       modifyAttackValue(10);
   }
}
