
package dip.lab3.student.solution1;

/**
 *
 * @author Jennifer
 */
public class MessageService {

    private final MessageWriter writer;
    private final MessageReader reader;

    public MessageService(MessageReader reader, MessageWriter writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public final void sendMessage() {
        String line = reader.readln();
        writer.writeln(line);
    }
}
