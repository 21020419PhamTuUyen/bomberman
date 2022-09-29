package map;

import java.util.ArrayList;
import java.util.List;

import java.awt.*;
import entities.bomber;

public class Map extends loadMap {
    protected int Level;
    protected static List<String> map = new ArrayList<>();
    protected Point p;

    public Map() {
    }

    public Map(int level) {
        this.Level = level;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int level) {
        Level = level;
        map = load(level);
    }

    public void setMap(List<String> map) {
        this.map = map;
    }

    public List<String> getMap() {
        return map;
    }

    public void printMap() {
        map = Map.load(Level);
        for (int i = 0; i < map.size(); i++) {
            System.out.println(map.get(i));
        }
    }

    public Point bomberPos(char c) {
        for (int i = 0; i < map.size(); i++) {
            if (map.get(i).indexOf(c) != -1) {
                p.x = map.get(i).indexOf("p");
                p.y = i;
                break;
            }
        }
        return p;
    }

    public void Update(Point p) {

    }
}
