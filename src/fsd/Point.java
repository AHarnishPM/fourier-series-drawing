package fsd;

import java.awt.Graphics;
import java.util.ArrayList;

/**
 * Represents an x and y coordinate for a point.
 * TODO: Test using java.awt.fsd.Point
 */
public class Point {
    public final int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x=" + x + "y=" + y;
    }

    @Override
    public boolean equals(Object o) {
        if (o.getClass() != this.getClass()){
            return false;
        }
        p = Point(o)
        if (this.x == o.x && this.y == o.y)
    }
}

