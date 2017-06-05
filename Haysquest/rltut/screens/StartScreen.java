package rltut.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class StartScreen implements Screen {

    private String[] welcome = {
            "_   _                                       _",
            "| | | |                                     | |",  
            "| |_| | __ _ _   _ ___  __ _ _   _  ___  ___| |_", 
            " |  _  |/ _` | | | / __|/ _` | | | |/ _ \\/ __| __|",
            "| | | | (_| | |_| \\__ \\ (_| | |_| |  __/\\__\\ |_ ",
            " \\_| |_/\\__,_|\\__, |___/\\__, |\\__,_|\\___||___/\\__|",
            "              __/ |        | |                    ",
            "             |___/         |_|                    "};
    @Override
    public void displayOutput(AsciiPanel terminal) {
        printArray(terminal, welcome);
        terminal.writeCenter("arrow keys to move", 10);
        terminal.writeCenter("[w] to equip weapons/armor", 11);
        terminal.writeCenter("[e] to eat food", 12);
        terminal.writeCenter("[x] to examine items", 13);
        terminal.writeCenter("[g] to pick up items", 14);
        terminal.writeCenter("[s] to see stats", 15);
        terminal.writeCenter("[ESC] to exit menus", 16);
        terminal.writeCenter("-- press [enter] to continue --", 22);
    }

    private void printArray(AsciiPanel terminal, String[] array) {
        for (int i = 0; i < array.length; i++) {
            terminal.writeCenter(array[i], i);
        }
    }
    @Override
    public Screen respondToUserInput(KeyEvent key) {
        return key.getKeyCode() == KeyEvent.VK_ENTER ? new StoryScreen() : this;
    }
}
