package rltut.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;
public class CharSelectRogue implements CharSelect
{
    @Override
    public void displayOutput(AsciiPanel terminal) {
        terminal.write("  Berserker", 1, 1);
        terminal.write("  Warrior", 1, 2);
        terminal.write("> Rogue", 1, 3);
        terminal.write("_______________", 1,4);
        terminal.write(" - less defense and health", 1,5);
        terminal.write(" - has the ability to attack twice in one turn", 1,6);
        terminal.write("   when a dagger is equipped", 1,7);
        terminal.write(" - increased vision", 1,8);
        terminal.writeCenter("-- press [enter] to select class --", 22);
    }

    @Override
    public Screen respondToUserInput(KeyEvent key) {
        if(key.getKeyCode() == KeyEvent.VK_UP) 
            return new CharSelectWarrior();

        if(key.getKeyCode() == KeyEvent.VK_ENTER)
            return new PlayScreen(3);
        return this;
    }
}

