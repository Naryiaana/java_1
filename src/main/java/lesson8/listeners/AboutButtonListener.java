package lesson8.listeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AboutButtonListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JFrame jFrame = new JFrame();
        JOptionPane.showMessageDialog(jFrame, "This calculator was made by Naryiaana. Hope it comes in handy :)");
    }
}
