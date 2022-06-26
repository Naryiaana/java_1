package lesson8.listeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelpButtonListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JFrame jFrame = new JFrame();
        JOptionPane.showMessageDialog(jFrame, "Hello! This calculator helps you to do calculations. Please, contact us if you have any problems!");
    }
}
