
package dip.lab3.student.solution1;

/**
 *
 * @author Jennifer
 */
public class ConsoleMessageWriter implements MessageWriter {
      @Override
    public final void writeln(String line) {
        System.out.println("Incoming Message:");
        System.out.println(line);
}
}
