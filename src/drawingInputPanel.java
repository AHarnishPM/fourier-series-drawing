import java.lang.reflect.Array;
import java.util.ArrayList;
import javax.swing.JPanel;

public class drawingInputPanel extends JPanel {

    /**
     * Represents an x and y coordinate for a point.
     */
    private class point {
        public final int x, y;
        public point(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }

    /**
     * Represents a set of points to be drawn on a panel or used for calculations.
     */
    private class curve {

        // TODO: Switch to more efficient datastructure for this use case
        /**
         * Stores all points in drawn curve. Initial capacity should be adjusted after testing.
         */
        ArrayList<point> points = new ArrayList<>(100);
    }
}
