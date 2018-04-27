/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visualapplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author kbsmith01
 */
public class FlowLayout extends JFrame {
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;
    private JButton b5;
    private JButton b6;
    
    public FlowLayout() {
        b1 = new JButton("Button 1");
        b2 = new JButton("Button 2");
        b3 = new JButton("Button 3");
        b4 = new JButton("Button 4");
        b5 = new JButton("Button 5");
        b6 = new JButton("Button 6");
        
        JPanel P = new JPanel(new GridLayout(2,3));
        
        getContentPane().add(P);
        
        
        P.add(b1);
        P.add(b2);
        P.add(b3);
        P.add(b4);
        P.add(b5);
        P.add(b6);
        
        setVisible(true);
        setSize(400,300);
    }
    
    public static void main(String[] args) {
        FlowLayout fl = new FlowLayout();
    }
}
