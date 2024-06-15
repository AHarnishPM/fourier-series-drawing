package fsd;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;


public class drawingInputPanel extends JPanel implements MouseMotionListener {

    /**
     * fsd.Curve storing points user dragged over
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
        curve.addPoint(point, false);
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) { }


    public void printCurve() {
        System.out.println(this.curve.drawString());
    }

    public void restart() {
        this.curve = new Curve();
        repaint();
    }
}
