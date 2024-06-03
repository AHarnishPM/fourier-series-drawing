import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import javax.swing.JPanel;

public class drawingInputPanel extends JPanel implements MouseMotionListener {

    /**
     * Curve storing points user dragged over
     */
    private Curve curve;
    public drawingInputPanel() {
        this.addMouseMotionListener(this);
        this.curve = new Curve();
        this.setPreferredSize(new Dimension(1000, 1000));
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.curve.drawLine(g);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Point point = new Point(e.getX(), e.getY());
        curve.addPoint(point);
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) { }

    /**
     * Represents an x and y coordinate for a point.
     * TODO: Test using java.awt.Point
     */
    private class Point {
        public final int x, y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "x=" + x + "y=" + y;
        }
    }

    /**
     * Represents a set of points to be drawn on a panel or used for calculations.
     */
    private class Curve {

        // TODO: Switch to more efficient datastructure for this use case
        /**
         * Stores all points in a curve. Initial capacity should be adjusted after testing.
         */
        private ArrayList<Point> points = new ArrayList<>(100);

        /**
         * Add new point to curve
         * @param point new point to be added
         */
        public void addPoint(Point point) {
            points.add(point);
            // System.out.println(points);
        }

        /**
         * Draws a line between two most recent points
         * @param g Graphics object to be painted on
         */
        public void drawLine(Graphics g) {
            int end = points.size()-1;

            while (end > 0) {
                Point lastPoint = points.get(end);
                Point secondLastPoint = points.get(end - 1);
                g.drawLine(lastPoint.x, lastPoint.y, secondLastPoint.x, secondLastPoint.y);
                end--;
            }
            }
    }
}
