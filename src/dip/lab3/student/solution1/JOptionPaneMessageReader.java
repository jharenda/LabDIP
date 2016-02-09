/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Jennifer
 */
public class JOptionPaneMessageReader implements MessageReader {

    @Override
    public String readln() {
         JFrame frame = new JFrame("InputDialog Example #1");
    String name = JOptionPane.showInputDialog(frame, "What's your name?");
    return name; 
    }
    
}
