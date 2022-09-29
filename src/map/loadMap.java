package map;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class loadMap {
    private static FileReader file;
    private static BufferedReader br;
    private static String path;

    protected static List<String> load(int level) {
        List<String> map = new ArrayList<>();
        try {
            path = "res\\map\\Level" + level + ".txt";
            file = new FileReader(path);
            br = new BufferedReader(file);
            String line = br.readLine();
            while (!line.equals("")) {
                map.add(line);
                line = br.readLine();
                // doc file txt luu vao list
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return (map);
    }
}
