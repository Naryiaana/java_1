package lesson8.listeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperatorButtonListener implements ActionListener {

    private JTextField inputField;

    public OperatorButtonListener(JTextField inputField) {
        this.inputField = inputField;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        inputField.setText(inputField.getText() + " " + btn.getText());
    }
}
