package fenetre.graphique;

import java.awt.Graphics;
import javax.swing.JPanel;

public class MonPanneau extends JPanel {
    
    @Override
    public void paintComponent (Graphics g)
    {
        g.fillOval(100, 100, 50, 50);
    }
    
}
