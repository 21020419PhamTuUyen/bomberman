package entities;

import java.awt.*;

public abstract class character {
    private Point position;
    private static char key;

    public void setPosition(Point point) {
        this.position = point;
    }

    public Point getPosition() {
        return position;
    }

    public char getKey() {
        return key;
    }

    public boolean CanGetThrough() {
        return true;
    }

    public boolean CanBreak() {
        return true;
    }

}
