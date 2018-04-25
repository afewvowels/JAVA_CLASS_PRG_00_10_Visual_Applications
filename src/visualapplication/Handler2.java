/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visualapplication;

import javax.swing.*;
import java.awt.event.*;

// Keypad version 1 handles events by looping through array of
// buttons to find which one was pressed.

// This class handles events on the keypad by popping up a dialog
// showing the button pressed
public class Handler2 implements ActionListener {
    
    private String key;          // The key for this particular handler
    
    public Handler2(String k) {  // Set in the constructor
        key = k;
    }
    
    // This handles events created by the corresponding button.
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, key);
    }

}