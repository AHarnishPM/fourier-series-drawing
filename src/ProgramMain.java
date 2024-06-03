import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;

/**
 * Main class for Fourier Series Drawing program. Creates initial GUI with start button.
 */
public class ProgramMain {

    public static void main(String[] args){
        SwingUtilities.invokeLater(ProgramMain::buildStartScreen);
    }

    /**
     * Creates program window, adds start button
     */
    private static void buildStartScreen() {

        JFrame frame = new JFrame("Fourier Series Drawing");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Start button which lets user begin drawing
        JButton button = new JButton("Begin Drawing");
        frame.add(button, BorderLayout.NORTH);

        // Builds drawing panel
        drawingInputPanel drawPanel = new drawingInputPanel();
        frame.add(drawPanel);

        // Displays frame
        frame.pack();
        frame.setVisible(true);
    }
}
