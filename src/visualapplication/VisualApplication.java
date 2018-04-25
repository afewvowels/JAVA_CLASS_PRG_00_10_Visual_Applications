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
public class VisualApplication extends JFrame implements ActionListener {

    /**
     * @param args the command line arguments
     */
    private JButton greetButton;
    private JButton secondButton;
    private JTextField greetField;
    
    private JSplitPane sPane;
    
    public VisualApplication() {
//        Hello h = new Hello();
//        Button b = new Button();
        
        // Constructed when application constructed
        greetButton = new JButton("Press");
        secondButton = new JButton("Extra button");
        // 15 columns wide, column approx == character
        greetField = new JTextField(15);
        
        // Application event handler
        greetButton.addActionListener(this);
        secondButton.addActionListener(this);
        
//        sPane = new JSplitPane();
        
        // Adding components to surface of the panel
        JPanel P = new JPanel();
//        JPanel S = new JPanel();
//        
//        setPreferredSize(new Dimension(4000,4000));
//        getContentPane().setLayout(new GridLayout());
//        getContentPane().add(sPane);
//        
//        sPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
//        sPane.setDividerLocation(300);
//        sPane.setTopComponent(P);
//        sPane.setBottomComponent(S);
        
        getContentPane().add(P);
        
        P.add(greetButton);
        P.add(greetField);
        P.add(secondButton);
        setSize(450,80);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == greetButton) {
            greetField.setText("Welcome to CSIS 3701!");
            greetField.setEditable(true);
            greetButton.setEnabled(false);
        }
        else if(e.getSource() == secondButton) {
            greetField.setText("Second button!");
            greetButton.setEnabled(true);
        }

        printMessage();
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        VisualApplication v = new VisualApplication();
//        Hello h = new Hello();
    }
    
    public void printMessage( ){
        System.out.println("Message printed");
    }
}
