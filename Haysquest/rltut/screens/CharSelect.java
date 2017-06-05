package rltut.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;
public interface CharSelect extends Screen
{
    public abstract void displayOutput(AsciiPanel terminal);

    public abstract Screen respondToUserInput(KeyEvent key);
    
}

