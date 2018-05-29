package paintx;

import javax.swing.*;
import java.awt.*;
import static java.awt.Color.*;

public class Panneau extends JPanel {

    boolean test;
    private int u = -1;
    public final Color[] couleur = {RED, YELLOW, BLUE, GREEN, GRAY, PINK, MAGENTA, WHITE, BLACK};

    public Panneau(boolean b) {
        test = b;
    }

    public void paintComponent(Graphics g) {
        int x = (this.getWidth());
        int y = (this.getHeight());
        //System.out.println(couleur[u]);
        System.out.println(u);
        if (u != -1) {
            g.setColor(couleur[u]);
        }
        g.drawRect(50, 50, x - 100, y - 100);
        g.drawLine(50, 50, x - 50, y - 50);
        g.drawLine(50, y - 50, x - 50, 50);
        if (test) {
            u++;
            test = false;
        }
        if (u == 9) {
            u = 0;
        }
    }

}
