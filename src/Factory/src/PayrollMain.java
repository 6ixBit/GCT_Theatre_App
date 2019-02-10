package comp1549payrollproject;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * Class containing the main() method.  Just displays a message explaining how to run the JUnit tests.
 */
public class PayrollMain extends JFrame {

    String text = "<html>"
            + "<h2>This application is not designed to run from the main() method</h2>"
            + "<p>Run the <strong>JUnit tests</strong> defined in the test package to demonstrate the code.  Do this "
            + "in NetBeans by right-clicking the project and choosing <strong>Test</strong>.</p>"
            + "<p>41 JUnit test should run and pass.</p>"
            + "</html>";

    /**
     * The constructor sets up the GUI.
     */
    public PayrollMain() {
        //     setLayout(new GridLayout(1, 2, 0, 5));
        Font font = new Font("Helvetica", Font.PLAIN, 14);

        // Set up the left side of the window where no inheritance used
        JPanel panel = new JPanel();
        JLabel label = new JLabel();

        label.setText(text);
        label.setFont(font);
        panel.add(label);
        add(panel);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        pack();

    }

    /**
     *
     * main() method.
     */
    public static void main(String[] args) {
        PayrollMain me = new PayrollMain();
        me.setVisible(true);
    }
}
