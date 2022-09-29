import entities.bomber;
import map.Map;

public class launch {
    public static void main(String[] args) {
        int level = 1;
        Map map = new Map(level);
        bomber player = new bomber();
        player.setPosition(map.bomberPos(player.getKey()));
        while (true) {

        }
    }
}
