package testjop;

import javax.swing.*;

public class TestJOP {

    public static void main(String[] args) {
        JOptionPane Jop1 = new JOptionPane();
        Jop1.showMessageDialog(null, "INFO", "INFO", JOptionPane.INFORMATION_MESSAGE);

        JOptionPane Jop2 = new JOptionPane();
        Jop2.showMessageDialog(null, "WARNING", "WARNING", JOptionPane.WARNING_MESSAGE);

        JOptionPane Jop3 = new JOptionPane();
        Jop3.showMessageDialog(null, "ERROR", "ERROR", JOptionPane.ERROR_MESSAGE);

    }

}
