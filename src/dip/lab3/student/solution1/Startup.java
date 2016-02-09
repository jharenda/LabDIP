package dip.lab3.student.solution1;

import java.io.File;

/**
 * Here in the main, I ask the user for console input, then output the input in
 * a JOption. Then I ask for input in the jOption, and output it in the console.
 *
 * @author Jennifer
 */
public class Startup {

    public static void main(String[] args) {
       // File f = new File("data.txt");
//System.out.println(f.getAbsolutePath());
        MessageWriter msgWriter1 = new ConsoleMessageWriter();
        MessageWriter msgWriter2 = new JOptionPaneMessageWriter();

        MessageReader msgReader1 = new KeyboardMessageReader();
        MessageReader msgReader2 = new JOptionPaneMessageReader(); 
        MessageService msg1 = new MessageService(msgReader1, msgWriter2);
        MessageService msg2 = new MessageService(msgReader2, msgWriter1);

       msg1.sendMessage();
       msg2.sendMessage();

        MessageReader reader = new FileMessageReader();
       MessageWriter writer = new JOptionPaneMessageWriter();

        // Copy from reader to writer
        // Notice that Copier is NOT dependent on implementation of reader/writer
        // (it is not rigid, fragile or immobile)
        MessageService copier = new MessageService(reader, writer);
        copier.sendMessage();

        // Send end of program message
        System.out.println("Program ended. Line of reader input copied successfully to writer output.");
    }
}
