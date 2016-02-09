
package dip.lab3.student.solution1;

import javax.swing.JOptionPane;

/**
 *
 * @author Jennifer
 */
public class JOptionPaneMessageWriter implements MessageWriter {
     @Override
    public final void writeln(String line) {
        JOptionPane.showMessageDialog(null, "Incoming Message: " + line);
    }
}
