/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visualapplication;

/**
 *
 * @author kbsmith01
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Keypad version 2 handles events by creating event handling objects. Note it
// does not implement ActionListener because it does not handle events itself.

public class Keypad2 extends JFrame {
    
    private static final int KEYS = 12;
    // Store buttons in array for ease of implementation
    private JButton[] keys = new JButton[KEYS];
    
    private JTextField keyField = new JTextField(15);
    
    // To simplify creation, store labels in array of String
    private String[] labels = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "*", "0", "#"};
    
    public Keypad2() {
        
        // Build layout first
        JPanel mainPanel = new JPanel(new BorderLayout());
        getContentPane().add(mainPanel);
        
        JPanel buttonPanel = new JPanel(new GridLayout(4, 3));
        mainPanel.add(buttonPanel, BorderLayout.CENTER);
        mainPanel.add(keyField, BorderLayout.SOUTH);
        
        // Use loop to build each of the 12 keys        
        for (int i = 0; i < KEYS; i++) {
            // Construct key from labels in array
            keys[i] = new JButton(labels[i]);
            
            // Instead of handling events ourselves, we construct a Handler object
            // to do so, passing it to the button.
            keys[i].addActionListener(new Handler2(labels[i]));
            buttonPanel.add(keys[i]);            
        }        
        
        setSize(120, 150);
        setVisible(true);        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        Keypad2 k = new Keypad2();
    }

}