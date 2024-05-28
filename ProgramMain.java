import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;

/**
 * Main class for Fourier Series Drawing program. Creates initial GUI with start button.
 */
public class ProgramMain {

    // static final int width = 1000;
    // static final int height = 1000;
    public static void main(String[] args){
        SwingUtilities.invokeLater(ProgramMain::buildStartScreen);
    }

    /**
     * Creates program window, adds start button
     */
    private static void buildStartScreen() {
        System.out.println("GUI");

        JFrame frame = new JFrame("Fourier Series Drawing");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // TODO: Make this adjust to user screen size
        // frame.setSize(ProgramMain.FRAME_WIDTH, ProgramMain.FRAME_HEIGHT);

        // Start button which lets user begin drawing
        JButton button = new JButton("Begin Drawing");
        frame.add(button, BorderLayout.SOUTH);

        // Displays frame
        frame.pack();
        frame.setVisible(true);
    }
}
