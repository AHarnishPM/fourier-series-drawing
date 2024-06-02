import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JButton;
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
        System.out.println("GUI");

        JFrame frame = new JFrame("Fourier Series Drawing");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Start button which lets user begin drawing
        JButton button = new JButton("Begin Drawing");
        frame.add(button, BorderLayout.NORTH);

        // Displays frame
        frame.setPreferredSize(new Dimension(1000, 1000));
        frame.pack();
        frame.setVisible(true);
    }
}
