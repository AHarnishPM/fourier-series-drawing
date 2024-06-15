package fsd;

import java.awt.Graphics;
import java.util.ArrayList;

/**
 * Represents a set of points to be drawn on a panel or used for calculations.
 */
public class Curve {

    // TODO: Switch to more efficient datastructure for this use case
    /**
     * Stores all points in a curve. Initial capacity should be adjusted after testing.
     */
    private ArrayList<Point> points = new ArrayList<>(100);

    /**
     * Add new point to curve
     *
     * @param point new point to be added
     */
    public void addPoint(Point point, boolean keepDuplicates) {
        if (points.isEmpty()) {points.add(point);}

        Point last = points.get(points.size() - 1);

        if (keepDuplicates || !last.equals(point)) {
            points.add(point);
        }
    }

    public String drawString() {
        return this.points.toString();
    }


    /**
     * Draws a line between all successive points in curve
     *
     * @param g Graphics object to be painted on
     */
    public void drawLine(Graphics g) {
        int end = points.size() - 1;

        // Draws all points in curve, could be a more efficient method
        while (end > 0) {
            Point lastPoint = points.get(end);
            Point secondLastPoint = points.get(end - 1);
            g.drawLine(lastPoint.x, lastPoint.y, secondLastPoint.x, secondLastPoint.y);
            end--;
        }
    }
}
