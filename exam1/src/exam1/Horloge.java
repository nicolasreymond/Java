package exam1;

import java.awt.*;
import javax.swing.JPanel;

/**
 *
 * @author nreymond
 */
public class Horloge {

    public class Panneau extends JPanel {

        int height = 100;
        int width = 100;

        public void paint(Graphics g) {
            Color clr1 = new Color(250, 150, 200);
            g.setColor(clr1);
            g.drawRoundRect(60, 50, 150, 100, 80, 100);

            Color clr2 = clr1.darker();
            g.setColor(clr2);
            g.fillRoundRect(240, 50, 150, 100, 80, 100);
        }
    }
}
