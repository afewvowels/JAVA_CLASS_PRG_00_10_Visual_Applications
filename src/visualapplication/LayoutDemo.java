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
/**
 *
 * @author jrsullins
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// This application demos the more commonly used layouts in Java
public class LayoutDemo extends JFrame {
    
    // 6 buttons of different "natureal" sizes
    private JButton b1 = new JButton("Button");
    private JButton b2 = new JButton("B");
    private JButton b3 = new JButton("A Very Very Large Button");
    private JButton b4 = new JButton("Another Button");
    private JButton b5 = new JButton("Button 5");
    private JButton b6 = new JButton("B6");
    
    public LayoutDemo() {
        
        // This code creates panels with differnt layouts and adds buttons
        // Uncomment the one you want to see
        
        // The FlowLayout keeps components their natural size and adds
        // them left to right in rows, "wrapping" when the edge of the
        // panel is reached.
        
        /*
        JPanel P = new JPanel(new FlowLayout());
        P.add(b1);
        P.add(b2);
        P.add(b3);
        P.add(b4);
        P.add(b5);
        P.add(b6);
        */
        
        // The GridLayout creates a rows x columns grid of equally sized
        // cells. Components are added in row-major order, and they are
        // resized to fit the grid.        
        
       /* 
        JPanel P = new JPanel(new GridLayout(3, 2));
        P.add(b1);
        P.add(b2);
        P.add(b3);
        P.add(b4);
        P.add(b5);
        P.add(b6);
        */      
        
        // The BorderLayout creates 5 areas, north, south, east, west, and
        // center. In this case, the add method is overloaded to specify
        // which area a component is placed in.        
        
        /*
        JPanel P = new JPanel(new BorderLayout());
        P.add(b1, BorderLayout.SOUTH);
        P.add(b2, BorderLayout.WEST);
        P.add(b3, BorderLayout.NORTH);
        P.add(b4, BorderLayout.EAST);
        P.add(b5, BorderLayout.CENTER);
        */
        
        // Absolute positioning can be used if the layout is null. The
        // setBounds method places the component at a position and sets
        // its width and height
        
        
        JPanel P = new JPanel(null);
        P.add(b1);
        P.add(b2);
        P.add(b3);
        b1.setBounds(10, 10, 80, 40);
        b2.setBounds(100, 10, 50, 40);
        b3.setBounds(10, 60, 200, 40);
        
        
        getContentPane().add(P);
        setSize(200, 200);  
        setVisible(true);       
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } 
    
    public static void main(String[] args) {
        LayoutDemo l = new LayoutDemo(); 
    }

}