package testfenetre;

import javax.swing.*;
import java.awt.*;

public class Panneau extends JPanel {

    int height = 100;
    int width = 100;

    public void paintComponent(Graphics g) {

        int x = (this.getWidth() / 2);
        int y = (this.getHeight() / 2);
        
        g.setColor(Color.black);
        g.fillRoundRect(x/2, y/2, x, y, 40, 40);
        g.setColor(Color.yellow);
        g.fillRect((x/2)+20, (y/2)+20, x-40, y-40);
        g.setColor(Color.red);
        g.fillOval((x/2)+25, (y/2)+25, x-50, y-50);

    }
}
    