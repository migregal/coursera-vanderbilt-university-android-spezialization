package mooc.vandy.java4android.buildings.logic;

import java.io.FileNotFoundException;

import mooc.vandy.java4android.buildings.ui.OutputInterface;

/**
 * This Neighborhood utility class provides static helper methods the
 * print a Building List and calculate the area of a Building list.
 * A utility class in Java should always be final and have a private
 * constructor.
 */
public final class Neighborhood {

    private Neighborhood() { }

    static void  print(Building[] buildings, String header, OutputInterface out) {
        out.println(header);

        for (Building building : buildings) out.println(building.toString());
    }

    static int calcArea(Building[] buildings) {
        int res = 0;

        for (Building building : buildings) res += building.calcLotArea();

        return res;
    }
}
