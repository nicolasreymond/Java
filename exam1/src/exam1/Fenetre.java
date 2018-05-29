package exam1;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author nreymond
 */
class Fenetre extends JFrame {
    
    private JPanel container = new JPanel();
    private JPanel top = new JPanel();
    private JPanel bottom = new JPanel();
    
    private JTextField ecran = new JTextField();
    
    private int heure;
    
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawArc(150, 150, 150, 150, 360, 360);
        
    }
    
    public Fenetre() {
        this.setSize(500, 500);
        this.setTitle("Horloge");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        ecran.setPreferredSize(new Dimension(100, 25));
        //container.add(ecran);
        this.setContentPane(container);
        this.setVisible(true);
    }
    
}
