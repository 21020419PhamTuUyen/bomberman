package move;

import java.awt.*;

public class Move extends Point {

    public void MoveUp(Point p) {
        p.x--;
    }

    public void MoveDown(Point p) {
        p.x++;
    }

    public void MoveLeft(Point p) {
        p.y--;
    }

    public void MoveRight(Point p) {
        p.y++;
    }
}
