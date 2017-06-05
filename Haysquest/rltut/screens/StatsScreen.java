package rltut.screens;

import java.awt.event.KeyEvent;
import java.util.List;
import java.util.ArrayList;

import rltut.Creature;
import rltut.Player;
import rltut.Warrior;
import asciiPanel.AsciiPanel;

public class StatsScreen implements Screen {
    private Creature player;
    private List<String> statList;
    public StatsScreen(Creature p){
        player = p;
    }

    private ArrayList<String> createList() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Max HP: " + player.maxHP());
        list.add("Attack (with equipment): " + player.atkValue());
        list.add("Defense (with equipment): " + player.defValue());
        list.add("Vision: " + player.visionRadius());
        if (player instanceof Warrior) {
            list.add("Regen per Turn: " + ((Warrior) player).regenRate());
        }
        return list;
    }

    @Override
    public void displayOutput(AsciiPanel terminal) {
        statList = createList();
        int y = 5;
        terminal.clear(' ', 5, y, 30, statList.size() + 2);
        terminal.write("       Character Stats        ", 5, y++);
        terminal.write("------------------------------", 5, y++);
        for (int i = 0; i < statList.size(); i++){
            terminal.write(String.format("[%d] %s", i+1, statList.get(i)), 5, y++);
        }
        
    }

    @Override
    public Screen respondToUserInput(KeyEvent key) {
        if (key.getKeyCode() == KeyEvent.VK_ESCAPE)
            return null;
        else
            return this;
    }
}
