package rltut;

import java.awt.Color;
public class Creature {
    protected World world;

    public int x;
    public int y;
    protected int maxHP;
    protected int hp;
    protected int atkValue;
    protected int defValue;
    protected Inventory inventory;
    protected CreatureFactory factory;
    protected String name;
    protected Weapon weapon;
    protected Armor armor;
    private int xp;
    private int level;

    public Creature(World world, char glyph, Color color, 
    CreatureFactory maker, int maxHP, int attackValue, int defValue){
        this.world = world;
        this.glyph = glyph;
        this.color = color;
        this.maxHP = maxHP;
        this.hp = maxHP;
        atkValue = attackValue;
        this.defValue = defValue;
        factory = maker;
        visionRadius = 9;
        inventory = new Inventory(20);
        level = 1;
    }

    public int xp() { return xp; }

    public void modifyXP(int amount) {
        xp += amount;

        factory.addMessage("The %s %s %d xp.", name, amount < 0 ? "lose" : "gain", amount);
        while (xp > (int)(Math.pow(level, 1.5) * 20)) {
            level++;
            onGainLevel();
            factory.addMessage("The " + name + " advanced to level %d", level);
        }
    }

    public void onGainLevel() {
        new LevelUpController().autoLevelUp(this);
    }

    public void gainXP(Creature other){
        int amount = other.maxHP
            + other.atkValue()
            + other.defValue();
        modifyXP(amount);
    }

    public void gainMaxHP() {
        maxHP += 10;
        hp += 10;
        factory.addMessage("The %s looks healthier", name);
    }

    public void gainAttackValue() {
        atkValue += 2;
        factory.addMessage("The %s looks stronger", name);
    }

    public void gainDefenseValue() {
        defValue += 2;
        factory.addMessage("The %s looks tougher", name);
    }

    public void gainVision() {
        visionRadius += 1;
        factory.addMessage("The %s looks more aware", name);
    }

    public int level() { return level; }

    public void attack(Creature other) {
        int amount = Math.max(0,atkValue() - other.defValue());
        amount = (int) (Math.random() * amount) + 1;
        other.modifyHP(-amount);
        if (canSee(factory.player.x, factory.player.y)) {
            factory.addMessage("The " + name + " attacks the " + other.name + " for %d damage.", 
                amount);
        }
        if (other.hp < 1)
            gainXP(other); 
    }

    public CreatureFactory getFactory() {
        return factory;
    }

    public Item getWeapon() {
        return weapon;
    }

    public Item getArmor() {
        return armor;
    }
    protected char glyph;
    public char glyph() { return glyph; }

    public Inventory inventory() { return inventory; }
    protected Color color;
    public Color color() { return color; }

    public void moveBy(int mx, int my){
        int futureX = this.x + mx;
        int futureY = this.y + my;
        if (mx==0 && my==0)
            return;
        Creature other = world.creatureAt(futureX, futureY);
        if (other == null){
            onEnter(futureX, futureY, world.tile(futureX, futureY));
        } else
            attack(other);
    }

    //checks if the tile at (x,y), is a ground tile. If so, it moves to
    //that spot
    public void onEnter(int x, int y, Tile tile) {
        if (tile.isGround()){
            this.x = x;
            this.y = y;
        }
    }

    public void modifyHP(int amount) {
        hp += amount;
        if (amount + hp > maxHP()) {
            hp = maxHP;
        }
        if(hp < 1) {
            world.remove(this);
            leaveCorpse();
            if (canSee(factory.player.x, factory.player.y)) 
                factory.addMessage("The " + name + " dies.");
        }
    }

    public void leaveCorpse() {
        Food corpse = new Food(color, name + " corpse");
        corpse.modifyFoodValue( (int)(maxHP * .25) );
        world.addAtEmptySpace(corpse, x, y);
    }

    public void eat(Food food) {
        modifyHP(food.foodValue());
        inventory.remove(food);
    }

    public int maxHP() {
        return maxHP;
    }

    public int hp() {
        return hp;
    }

    public int atkValue() {
        return atkValue + (weapon == null ? 0 : weapon.attackValue());
    }

    public int defValue() {
        return defValue + (armor == null ? 0 : armor.defenseValue());
    }

    public void dig(int wx, int wy) {
        world.dig(wx, wy);
    }

    public boolean canEnter(int wx, int wy) {
        return world.tile(wx, wy).isGround() && world.creatureAt(wx, wy) == null;
    }

    protected int visionRadius;
    public int visionRadius() { return visionRadius; }

    public boolean canSee(int wx, int wy){
        if ((x-wx)*(x-wx) + (y-wy)*(y-wy) 
        > visionRadius()*visionRadius())
            return false;

        for (Point p : new Line(x, y, wx, wy)){
            if (tile(p.x, p.y).isGround() || p.x == wx && p.y == wy)
                continue;

            return false;
        }

        return true;
    }

    public void drop(Item item){
        if (world.addAtEmptySpace(item, x, y)){
            factory.addMessage("drop a " + item.name());
            inventory.remove(item);
            unequip(item);
        } else {
            factory.addMessage("There's nowhere to drop the %s.", item.name());
        }
    }

    public Tile tile(int wx, int wy) {
        return world.tile(wx, wy);
    }

    public void unequip(Item item) {
        if (item == null) 
            return;

        if (item instanceof Armor) {
            armor = null;
            factory.addMessage("Took off the " + item.name());
        }

        if (item instanceof Weapon) {
            weapon = null;
            factory.addMessage("Put away the " + item.name());
        }
    }

    public void equip(Item item) {
        if (!(item instanceof Weapon) && !(item instanceof Armor)) 
            return;

        if (item instanceof Armor) {
            unequip(armor);
            if (canSee(factory.player.x, factory.player.y))
                factory.addMessage("Put on the " + item.name());
            armor = (Armor) item;
        }

        if (item instanceof Weapon) {
            unequip(weapon);
            if (canSee(factory.player.x, factory.player.y))
                factory.addMessage("Wielded the " + item.name());
            weapon = (Weapon) item;
        }
    }

    public void update(){
    }
}
