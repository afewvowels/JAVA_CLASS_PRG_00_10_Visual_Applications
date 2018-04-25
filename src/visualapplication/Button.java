/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visualapplication;

import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author kbsmith01
 */
public class Button extends JFrame implements ActionListener {
    private JButton button;
    
    public Button() {
        button = new JButton("Button");
        button.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button");
    }
}
