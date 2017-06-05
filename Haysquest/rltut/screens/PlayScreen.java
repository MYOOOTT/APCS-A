package rltut.screens;

import java.awt.event.KeyEvent;
import asciiPanel.AsciiPanel;
import rltut.Creature;
import rltut.CreatureFactory;
import rltut.World;
import rltut.WorldBuilder;
import rltut.FieldOfView;
import rltut.Player;
import rltut.BossMonster;
import java.util.ArrayList;
import javax.swing.JFrame;
import java.awt.Color;

public class PlayScreen implements Screen {
    private World world;
    private int centerX;
    private int centerY;
    private int screenWidth;
    private int screenHeight;
    private Player player;
    private CreatureFactory creatureFactory;
    private FieldOfView fov;
    private Screen subscreen;
    private BossMonster boss;
    public PlayScreen(int i){
        screenWidth = 80;
        screenHeight = 21;
        createWorld();
        fov = new FieldOfView(world);
        creatureFactory = new CreatureFactory(world, fov);
        createCreatures(creatureFactory, i);
        createItems(creatureFactory);

    }

    private void createCreatures(CreatureFactory creatureFactory, int i){
        if (i == 1) {
            player = creatureFactory.newBerserker();
        } else if (i == 2) {
            player = creatureFactory.newWarrior();
        } else {
            player = creatureFactory.newRogue();
        }
        for (int j = 0; j < 8; j++){
            creatureFactory.newFungus();
        }
        
        for (int j = 0; j < 10; j++) {
            creatureFactory.newGoblin();
        }
        
        for (int j = 0; j < 20; j++) {
            creatureFactory.newBat();
        }
        
        boss = (BossMonster) creatureFactory.newBoss();
    }

    private void createWorld(){
        world = new WorldBuilder(90, 50)
        .makeCaves()
        .build();
    }

    public int getScrollX() {
        return Math.max(0, Math.min(player.x - screenWidth / 2, world.width() - screenWidth));
    }

    public int getScrollY() {
        return Math.max(0, Math.min(player.y - screenHeight / 2, world.height() - screenHeight));
    }

    public void displayOutput(AsciiPanel terminal) {

        int left = getScrollX();
        int top = getScrollY();

        displayTiles(terminal, left, top);

        terminal.write(player.glyph(), player.x - left, player.y - top, player.color());
        String stats = String.format(" %3d/%3d hp  level: %d", player.hp(), player.maxHP(), player.level());
        terminal.write(stats, 1, 23);
        displayMessages(terminal, creatureFactory.getMessages());
        if (subscreen != null)
            subscreen.displayOutput(terminal);
    }

    private void createItems(CreatureFactory factory) {
        for (int i = 0; i < world.width() * world.height() / 20; i++){
            factory.newRock();
        }
        
        for (int i = 0; i < 10; i++) {
            factory.randomWeapon();
            factory.randomArmor();
        }
    }

    private void displayMessages(AsciiPanel terminal, ArrayList<String> messages) {
        int top = screenHeight - messages.size() + 2;
        for (int i = 0; i < messages.size(); i++){
            terminal.writeCenter(messages.get(i), top + i);
        }
        messages.clear();
    }

    private void displayTiles(AsciiPanel terminal, int left, int top) {
        fov.update(player.x, player.y, player.visionRadius());
        for (int x = 0; x < screenWidth; x++){
            for (int y = 0; y < screenHeight; y++){
                int wx = x + left;
                int wy = y + top;
                if (player.canSee(wx, wy)) {
                    terminal.write(world.glyph(wx, wy), x, y, world.color(wx, wy));
                } else {
                    terminal.write(fov.tile(wx, wy).glyph(), x, y, Color.darkGray);
                }
            }

        }

    }

    public Screen respondToUserInput(KeyEvent key) {
        int level = player.level();
        if(subscreen != null) {
            subscreen = subscreen.respondToUserInput(key);
        }else { 
            switch (key.getKeyCode()){
                case KeyEvent.VK_W: subscreen = new EquipScreen(player); break;
                case KeyEvent.VK_LEFT: player.moveBy(-1, 0); break;
                case KeyEvent.VK_RIGHT: player.moveBy( 1, 0); break;
                case KeyEvent.VK_UP:player.moveBy( 0,-1); break;
                case KeyEvent.VK_DOWN: player.moveBy( 0, 1); break;
                case KeyEvent.VK_D: subscreen = new DropScreen(player); break;
                case KeyEvent.VK_X: subscreen = new ExamineScreen(player); break;
                case KeyEvent.VK_E: subscreen = new EatScreen(player); break;
                case KeyEvent.VK_S: subscreen = new StatsScreen(player); break;
            }
            switch (key.getKeyChar()){
                case 'g': player.pickup(); break;
            }
        }
        
        if (player.level() > level) {
            subscreen = new LevelUpScreen(player, player.level() - level);
        }
        
        if (subscreen == null) 
            world.update();
        
        if (boss.hp() < 1 )
            return new WinScreen(1);
            
        if ( player.winnerwinnerchickendinner()) {
            return new WinScreen(2);
        }
            
        if (player.hp() < 1) 
            return new LoseScreen();
            
        return this;    

    }
}
