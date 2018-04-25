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
public class Hello extends JFrame implements ActionListener {
    
    private JButton greetButton;
    private JTextField greetField;
    
    public Hello() {
        greetButton = new JButton("Press");
        greetField = new JTextField(15);
        greetButton.addActionListener(this);
        JPanel P = new JPanel();
        getContentPane().add(P);
        P.add(greetButton);
        P.add(greetField);
        setSize(280,80);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent e) {
        greetField.setText("Hello!");
    }
    
    public JButton getButton() {
        return this.greetButton;
    }
    
    public static void main(String[] args) {
        Hello h = new Hello();
    }
}
