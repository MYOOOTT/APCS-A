package rltut.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;
public class CharSelectBerserker implements CharSelect 
{
    @Override
    public void displayOutput(AsciiPanel terminal) {
        terminal.write("> Berserker", 1, 1);
        terminal.write("  Warrior", 1, 2);
        terminal.write("  Rogue", 1, 3);
        terminal.write("_______________", 1,4);
        terminal.write(" - increased damage as health decreases", 1,5);
        terminal.write(" - increased damage using axes", 1,6);
        terminal.write(" - decreased defenses", 1,7);
        terminal.writeCenter("-- press [enter] to select class --", 22);
    }
    
    
    @Override
    public Screen respondToUserInput(KeyEvent key) {
        if(key.getKeyCode() == KeyEvent.VK_DOWN) 
            return new CharSelectWarrior();

        if(key.getKeyCode() == KeyEvent.VK_ENTER)
            return new PlayScreen(1);

        return this;
    }
}

