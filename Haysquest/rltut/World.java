package rltut;

import java.awt.Color;
import java.util.List;
import java.util.ArrayList;

public class World {
    private Tile[][] tiles;
    private Item[][] items;
    private int width;
    private List<Creature> creatures = new ArrayList<Creature>();
    public int width() { return width; }

    private int height;
    public int height() { return height; }

    public World(Tile[][] tiles){
        this.tiles = tiles;
        this.width = tiles.length;
        this.height = tiles[0].length;
        this.items = new Item[width][height];
    }

    public Tile tile(int x, int y){
        if (x < 0 || x >= width || y < 0 || y >= height)
            return Tile.BOUNDS;
        else
            return tiles[x][y];
    }

    public char glyph(int x, int y){
        Creature creature = creatureAt(x, y);

        if (creature != null)
            return creature.glyph();

        if (item(x,y) != null)
            return item(x,y).glyph();

        return tile(x, y).glyph();
    }

    public Color color(int x, int y){
        Creature creature = creatureAt(x, y);
        if (creature != null)
            return creature.color();

        if (item(x,y) != null)
            return item(x,y).color();

        return tile(x, y).color();
    }

    public void dig(int x, int y) {
        if (tile(x,y).isDiggable())
            tiles[x][y] = Tile.FLOOR;
    }

    public Item item(int x, int y) {
        return items[x][y];
    }

    public void addAtEmptyLocation(Creature creature){
        int x;
        int y;

        do {
            x = (int)(Math.random() * width);
            y = (int)(Math.random() * height);
        } 
        while (!tile(x,y).isGround() || creatureAt(x,y) != null);

        creature.x = x;
        creature.y = y;
        creatures.add(creature);
    }

    public void addAtEmptyLocation(Item item) {
        int x;
        int y;

        do {
            x = (int)(Math.random() * width);
            y = (int)(Math.random() * height);
        }
        while (!tile(x,y).isGround() || item(x,y) != null);

        items[x][y] = item;
    }

    public void add(Creature other) {
        creatures.add(other);
    }

    public void remove(Creature other) {
        creatures.remove(other);
    }

    public void remove(int x, int y) {
        items[x][y]= null;
    }

    public Creature creatureAt(int x, int y){
        for (Creature c: creatures) {
            if (c.x == x && c.y == y)
                return c;

        }
        return null;
    }

    public boolean addAtEmptySpace(Item item, int x, int y){
        if (item == null)
            return false;

        List<Point> points = new ArrayList<Point>();
        List<Point> checked = new ArrayList<Point>();

        points.add(new Point(x, y));

        while (!points.isEmpty()){
            Point p = points.remove(0);
            checked.add(p);

            if (!tile(p.x, p.y).isGround())
                continue;

            if (items[p.x][p.y]== null){
                items[p.x][p.y] = item;
                Creature c = this.creatureAt(p.x, p.y);
                if (c != null)
                    c.factory.addMessage("A %s lands between your feet.", item.name());
                return true;
            } else {
                List<Point> neighbors = p.neighbors8();
                neighbors.removeAll(checked);
                points.addAll(neighbors);
            }
        }
        
        return false;
    }

    public void update(){
        List<Creature> toUpdate = new ArrayList<Creature>(creatures);
        for (Creature creature : toUpdate){
            creature.update();
        }
    }   
}
