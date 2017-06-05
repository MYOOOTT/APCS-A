package rltut.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class WinScreen implements Screen {
    private int winCondition;
    public WinScreen(int i) {
        winCondition = i;
    }
    @Override
    public void displayOutput(AsciiPanel terminal) {
        
                if (winCondition == 1) { // killing boss
            terminal.writeCenter("You beat the boss! Congratulations!", 1);
            terminal.writeCenter("-- press [enter] to restart --", 22);
        }
        if (winCondition == 2) { // sniffing the rock
            terminal.write("Hello! This is the secret ending to the game.", 1, 1);
            terminal.write("Here are some of our favorite quotes by you, Mr. Hays.", 1,2);
            terminal.write("\"If you played all of Call of Duty with a chair, that'd be", 1,4);
            terminal.write(" pretty hard. Because all the people have guns, and when go", 1,5);
            terminal.write(" into a room you'd have to get into melee range to kill them.\"", 1,6);
            terminal.write("\"Wow! I'm smart. Computer scientists are well known for making", 1,8);
            terminal.write("super long words. Po-ly-mor-ph-sm. 5 syllables!\"",1,9);
            terminal.write("\"Hercules, for all intensive purposes, is dead. He's garbage.\"",1,11);
            terminal.write("\"There's no other champions. Only Galfdan the Weak.\"", 1,13);
            terminal.write("\"Let's take this endangered species and throw it in with this", 1,15);
            terminal.write(" other endangered species and watch them fight it out.\"", 1,16);
            terminal.write("\"There's Mario. All he's ever been is a two-dimensional array.\"", 1,18);
            terminal.write("\"That's something all dogs do. Eat homework. Maybe fetch. I've", 1, 20);
            terminal.write(" seen some dogs though. I don't think they know how to fetch.\"", 1,21);
            terminal.writeCenter("-- press [enter] to continue --", 22);
        }
        
        if (winCondition == 3) {
            terminal.write("\"If you played all of Call of Duty with a chair, that'd be", 1,1);
            terminal.write("\"Bing is a search engine. I always have to delete it. It shows", 1,1);
            terminal.write(" up in the toolbar and you have to delete it. It's like Internet",1,2);
            terminal.write(" Explorer. Really, I can't delete my own software off my own", 1,3);
            terminal.write(" computer?\", through gritted teeth", 1,4);
            terminal.write("\"Hey ball! Move yourself!", 1,6);
            terminal.write("\"I dreamed of being a phsyics teacher for one day.\"", 1,8);
            terminal.write("\"I'm noticing acceleration and velocity as I walk around during lunch.\"", 1,10);
            terminal.write("\"Oh, do you feel that. That acceleration. That force", 1,12);
            terminal.write("\"of gravity pulling us down to the ground.\"", 1,13);
            terminal.write("\"Hercules is dead. All we have is Spongebob.\"", 1,15);
            terminal.write("\"Instead of going to Vegas and playing some stupid game", 1,17);
            terminal.write(" I can just throw my dollar away and now I have all this free",1,18);
            terminal.write(" time to read a book or write a program.\"", 1,19);
            terminal.writeCenter("-- press [enter] to restart --", 22);
        }
       
    }

    @Override
    public Screen respondToUserInput(KeyEvent key) {
        if (winCondition == 1 || winCondition == 3)
        return key.getKeyCode() == KeyEvent.VK_ENTER ? new CharSelectBerserker() : this;
        if (winCondition == 2)
        return key.getKeyCode() == KeyEvent.VK_ENTER ? new WinScreen(3) : this;
        return null;
    }
}
