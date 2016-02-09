
package dip.lab3.student.solution1;
import java.io.*; 
/**
 *"Borrowed" from IndependentCopy. I tried to get a File Writer working on my own, and it did not go well. 
 * @author Jennifer
 */
public class FileMessageWriter implements MessageWriter {

    @Override
      public void writeln(String line) {
		boolean append = false;
		File data = new File(File.separatorChar + "Temp" + 
			  File.separatorChar + "datacopy.txt");
		PrintWriter out = null;
			  
		// This is where we setup our streams (append = false means overwrite)
		// new java.io.FileWriter() creates the file if doesn't exit
		try {
			// make sure we differentiate between java.io.FileWriter
			// class and this custom FileWriter class
			out = new PrintWriter(
						new BufferedWriter(
						new java.io.FileWriter(data, append) ) );
			out.println(line);
			out.close();
			
		} catch (IOException ioe) {
			if(out != null) out.close();
			System.out.println( ioe.getMessage() );
			System.exit(1);  // 1 = signals program end with error
		}

	}
    }
    

