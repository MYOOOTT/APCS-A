package rltut.screens;

import asciiPanel.AsciiPanel;
import java.awt.event.KeyEvent;

public class StoryScreen implements Screen
{
    String[] story = {
        "Legend tells of a great adventurer known as Hays.",
        "It is said long ago he had left a magnificent    ",
        "treasure under the protection of a great beast.  ",
        "No one has been able to enter the dungeon and    ",
        "live to tell the tale. Will you?"};
        
    public void displayOutput(AsciiPanel terminal) {
        for (int i = 0; i < story.length; i++) {
            terminal.writeCenter(story[i], i + 5);
            terminal.writeCenter("-- press [enter] to start --", 22);
        }
    }
    
        @Override
    public Screen respondToUserInput(KeyEvent key) {
        return key.getKeyCode() == KeyEvent.VK_ENTER ? new CharSelectBerserker() : this;
    }
}
