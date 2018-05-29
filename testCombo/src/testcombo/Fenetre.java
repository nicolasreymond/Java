package testcombo;

import java.awt.*;
import javax.swing.*;

public class Fenetre extends JFrame {

    private JPanel container = new JPanel();
    private JLabel label1 = new JLabel("Une combo box");
    private JLabel label2 = new JLabel("Un textField");
    private JComboBox combo = new JComboBox();
    private JTextField jtf = new JTextField();

    public Fenetre() {
        this.setTitle("Test de combo");
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        container.setBackground(Color.white);
        container.setLayout(new BorderLayout());
        //TOP
        JPanel top = new JPanel();
        top.add(label1);
        
        combo.setPreferredSize(new Dimension(200, 20));
        combo.addItem("Option 1");
        combo.addItem("Option 2");
        combo.addItem("Option 3");

        top.add(combo);
        container.add(top, BorderLayout.NORTH);
        
        //BOTTOM
        JPanel bottom = new JPanel();
        
        Font police = new Font("Arial", Font.BOLD, 14);
        jtf.setFont(police);
        jtf.setPreferredSize(new Dimension(150,30));
        jtf.setForeground(Color.green);
        
        bottom.add(label2);
        bottom.add(jtf);
        container.add(bottom, BorderLayout.SOUTH);
        
        this.setContentPane(container);
        this.setVisible(true);
    }
}
