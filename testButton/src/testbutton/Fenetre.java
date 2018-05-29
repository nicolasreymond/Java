package testbutton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Fenetre extends JFrame {

    private JPanel container = new JPanel();
    private JButton b1 = new JButton("+1");
    private JButton b2 = new JButton("+2");
    private JButton b3 = new JButton("+3");
    private JButton b4 = new JButton("+4");
    private JButton b5 = new JButton("+5");
    private Font police = new Font("verdana", Font.BOLD, 30);

    public Fenetre() {
        this.setTitle("Bouton");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        
        
        this.setLayout(new BorderLayout());
        this.getContentPane().add(b1, BorderLayout.CENTER);
        this.getContentPane().add(b2, BorderLayout.NORTH);
        this.getContentPane().add(b3, BorderLayout.SOUTH);
        this.getContentPane().add(b4, BorderLayout.EAST);
        this.getContentPane().add(b5, BorderLayout.WEST);
        
        
        this.setVisible(true);
    }
}