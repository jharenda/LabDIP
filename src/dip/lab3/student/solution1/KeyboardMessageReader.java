
package dip.lab3.student.solution1;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class KeyboardMessageReader implements MessageReader {
   @Override
    public String readln() {
        System.out.println("Please enter some text, then press return:");

        Scanner input = new Scanner(System.in);
        return input.nextLine();
    } 
}
