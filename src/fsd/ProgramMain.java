package fsd;

import java.awt.BorderLayout;
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

        // Print button which lets user print line data to System.out
        JButton printButton = new JButton("Print drawing string");
        frame.add(printButton, BorderLayout.NORTH);

        // Reset button which lets user restart the program and draw a new shape
        JButton resetButton = new JButton("Reset drawing");
        frame.add(resetButton, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(printButton, BorderLayout.WEST);
        buttonPanel.add(resetButton, BorderLayout.EAST);
        frame.add(buttonPanel, BorderLayout.NORTH);


        // Builds drawing panel
        drawingInputPanel drawPanel = new drawingInputPanel();
        frame.add(drawPanel);

        // Prints curve data
        printButton.addActionListener(e -> drawPanel.printCurve());

        // Resets program
        resetButton.addActionListener(e -> drawPanel.restart());


        // Displays frame
        frame.pack();
        frame.setVisible(true);
    }
}
