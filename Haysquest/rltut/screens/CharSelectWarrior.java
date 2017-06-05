package rltut.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;
public class CharSelectWarrior implements CharSelect
{

    @Override
    public void displayOutput(AsciiPanel terminal) {
        terminal.write("  Berserker", 1, 1);
        terminal.write("> Warrior", 1, 2);
        terminal.write("  Rogue", 1, 3);
        terminal.write("_______________", 1,4);
        terminal.write(" - increased health and defense", 1,5);
        terminal.write(" - increased damage using swords", 1,6);
        terminal.write(" - passively regenerates health", 1,7);
        terminal.writeCenter("-- press [enter] to select class --", 22);
    }

    @Override
    public Screen respondToUserInput(KeyEvent key) {
        if(key.getKeyCode() == KeyEvent.VK_DOWN) 
            return new CharSelectRogue();

        if(key.getKeyCode() == KeyEvent.VK_UP) 
            return new CharSelectBerserker();

        if(key.getKeyCode() == KeyEvent.VK_ENTER)
            return new PlayScreen(2);

        return this;
    }
}

