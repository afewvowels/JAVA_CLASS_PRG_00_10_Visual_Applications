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

/**
 *
 * @author jrsullins
 */
public class LayoutApp extends JFrame {
    private JTextField fileField;
    private JButton loadButton;
    private JButton saveButton;
    
    public LayoutApp() {
        fileField = new JTextField(15);
        loadButton = new JButton("LOAD");
        saveButton = new JButton("SAVE");
        
        // Subpanel for label and file textfield, which should always be next to one another
        JPanel filePanel = new JPanel(new BorderLayout());
        filePanel.add(new JLabel(" File: "), BorderLayout.WEST);
        filePanel.add(fileField, BorderLayout.CENTER);
        
        // Subpanel for buttons, which should be same size
        JPanel buttonPanel = new JPanel(new GridLayout(1, 2));
        buttonPanel.add(loadButton);
        buttonPanel.add(saveButton);
        
        // Main panel to which we add the subpanels
        JPanel mainPanel = new JPanel(new FlowLayout());
        mainPanel.add(filePanel);
        mainPanel.add(buttonPanel);
        
        // Attach to application and make visible
        getContentPane().add(mainPanel);
        setSize(250, 100);
        setVisible(true);       
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    public static void main(String[] args) {
        LayoutApp l = new LayoutApp(); 
    }
}


 


