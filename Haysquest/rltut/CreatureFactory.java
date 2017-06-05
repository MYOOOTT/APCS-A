package rltut;

import asciiPanel.AsciiPanel;
import java.util.ArrayList;
import rltut.FieldOfView;

public class CreatureFactory {
    private World world;
    private ArrayList<String> messages;
    private FieldOfView fov;
    protected Player player;
    public CreatureFactory(World world, FieldOfView pov){
        this.world = world;
        fov = pov;
        messages = new ArrayList<String>();
    }
    
    public Player newBerserker() {
        player = new Berserker(world, this, fov);
        world.addAtEmptyLocation(player);
        return player;
    }
    
    public Player newWarrior() {
        player = new Warrior(world, this, fov);
        world.addAtEmptyLocation(player);
        return player;
    }
    
    public Player newRogue() {
        player = new Rogue(world, this, fov);
        world.addAtEmptyLocation(player);
        return player;
    }
    
    public Creature newBoss() {
        Creature boss = new BossMonster(world, this, player);
        world.addAtEmptyLocation(boss);
        return boss;
    }
    
    public Creature newGoblin() {
        Creature goblin = new Goblin(world, this, player);
        goblin.equip(randomWeapon());
        goblin.equip(randomArmor());
        world.addAtEmptyLocation(goblin);
        return goblin;
    }

    public Creature newFungus(){
        Creature fungus = new Fungus(world, this);
        world.addAtEmptyLocation(fungus);
        return fungus;
    }

    public Creature newBat() {
        Creature bat = new Bat(world, this);
        world.addAtEmptyLocation(bat);
        return bat;

    }

    public Item newRock() {
        Rock rock = new Rock();
        world.addAtEmptyLocation(rock);
        return rock;

    }

    public Item newDagger() {
        Dagger dagger = new Dagger();
        world.addAtEmptyLocation(dagger);
        return dagger;

    }

    public Item newSword() {
        Sword sword = new Sword();
        world.addAtEmptyLocation(sword);
        return sword;

    }
    
    public Item newAxe() {
        Axe axe = new Axe();
        world.addAtEmptyLocation(axe);
        return axe;
    }

    public Item newLightArmor() {
        LightArmor cloth = new LightArmor();
        world.addAtEmptyLocation(cloth);
        return cloth;

    }

    public Item newMediumArmor() {
        MediumArmor med = new MediumArmor();
        world.addAtEmptyLocation(med);
        return med;

    }

    public Item newHeavyArmor() {
        HeavyArmor hea = new HeavyArmor();
        world.addAtEmptyLocation(hea);
        return hea;

    }

    public Item randomWeapon() {
        switch ((int)(Math.random() * 3)){
            case 0: return newSword();
            case 1: return newAxe();
            default: return newDagger();
        }
        
    }

    public Item randomArmor() {
        switch ((int)(Math.random() * 3)){
            case 0: return newLightArmor();
            case 1: return newMediumArmor();
            default: return newHeavyArmor();
        }

    }

    public void addMessage(String message, Object ... params){
        messages.add((String.format(message, params)));
    }

    public ArrayList<String> getMessages() {
        return messages;
    }
}
