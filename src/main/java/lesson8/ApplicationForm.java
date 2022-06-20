package lesson8;

import lesson8.components.NumberJButton;
import lesson8.components.OperatorJButton;
import lesson8.listeners.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ApplicationForm extends JFrame {

    private JTextField inputField;
    private CalcEngine calcEngine;


    public ApplicationForm(String title) throws HeadlessException {
        super(title);
        setBounds(200,200,270,370);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
      //  testListener();
        calcEngine = new CalcEngine();

        setJMenuBar(createMenu());

        setLayout(new BorderLayout());

        add(createTopPanel(), BorderLayout.NORTH);
        add(createCenterPanel(), BorderLayout.CENTER);

        setResizable(false);
        setVisible(true);
    }

    private JMenuBar createMenu() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menuFile = new JMenu("File");
        menuBar.add(menuFile);

        JMenuItem helpItem = menuFile.add(new JMenuItem("Help"));
        helpItem.addActionListener(new HelpButtonListener());
        menuFile.add(helpItem);

        JMenuItem aboutItem = menuFile.add(new JMenuItem("About"));
        aboutItem.addActionListener(new AboutButtonListener());
        menuFile.add(aboutItem);

        JMenuItem exitItem = menuFile.add(new JMenuItem("Exit"));
        exitItem.addActionListener(new ExitButtonListener());
        menuFile.add(exitItem);

        /*exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });*/
        return menuBar;
    }

    private JPanel createTopPanel() {
        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());

        inputField = new JTextField();
        inputField.setEditable(false);
        top.add(inputField);
        inputField.setFont(new Font("TimesRoman", Font.PLAIN, 25));
        inputField.setMargin(new Insets(8,0,8,0));
        inputField.setBackground(new Color(255,255,255));
        inputField.setText("Calculate here...");

        return top;
    }

    private JPanel createCenterPanel() {
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout());

        ActionListener buttonListener = new ButtonListener(inputField);

        centerPanel.add(createDigitsPanel(buttonListener), BorderLayout.CENTER);
        centerPanel.add(createOperatorsPanel(buttonListener), BorderLayout.WEST);

        return centerPanel;
    }

    private JPanel createDigitsPanel(ActionListener buttonListener) {
        JPanel digitsPanel = new JPanel();

       digitsPanel.setLayout(new GridLayout(4,3));

        for (int i = 0; i < 10; i++) {
            String buttonTitle = (i == 9) ? "0" : String.valueOf(i + 1);
            JButton btn = new NumberJButton(buttonTitle);
            btn.addActionListener(buttonListener);
            digitsPanel.add(btn);
        }

        JButton calc = new OperatorJButton("=");
        calc.addActionListener(e -> {
            Double result = calcEngine.addOperand(getLastInputNum());
            showResult(result);
            calcEngine.reset();
        });
        digitsPanel.add(calc);

        JButton clear = new OperatorJButton("C");
        clear.addActionListener(e -> {
            inputField.setText("");
            calcEngine.reset();
        });
        digitsPanel.add(clear);


       return digitsPanel;
    }

    private void showResult(double result) {
        showResult(result, null);
    }

    private void showResult(double result, String operator) {
        String resultStr = (result % 1 == 0) ? String.valueOf((int) result) : String.format("%.3f", result);
        if (operator != null) {
            resultStr += operator;
        }
        inputField.setText(resultStr);
    }

    private JPanel createOperatorsPanel(ActionListener buttonListener) {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,1));

        JButton minus = new OperatorJButton("-");
        minus.addActionListener(e -> {
            if (inputField.getText().length() == 0) {
                return;
            }
            buttonOperatorHandling("-");
        });
        panel.add(minus);

        JButton plus = new OperatorJButton("+");
        plus.addActionListener(e -> {
            if (inputField.getText().length() == 0) {
                return;
            }
            buttonOperatorHandling("+");
        });
        panel.add(plus);

        JButton multiply = new OperatorJButton("x");
        multiply.addActionListener(e -> {
            if (inputField.getText().length() == 0) {
                return;
            }
            buttonOperatorHandling("x");
        });
        panel.add(multiply);

        JButton divide = new OperatorJButton("/");
        divide.addActionListener(e -> {
            if (inputField.getText().length() == 0) {
                return;
            }
            buttonOperatorHandling("/");
        });
        panel.add(divide);

        return panel;
    }

    private void buttonOperatorHandling(String operator) {
        String inputStr = inputField.getText();

        if (String.valueOf(inputStr.charAt(inputStr.length() - 1)).matches("\\D")) {
            inputField.setText(inputStr.substring(0, inputStr.length() - 1) + operator);
            calcEngine.setOperator(operator);
            return;
        }

        Double result = calcEngine.addOperand(getLastInputNum());
        if (result != null) {
            showResult(result, operator);
        } else {
            inputField.setText(inputStr + operator);
        }

        calcEngine.setOperator(operator);
    }

    private String getLastInputNum() {
        var arr = inputField.getText().split("[^0-9\\.]");
        return arr[arr.length - 1];
    }


    private void testListener() {
        Button button = new Button("Кнопка");
        button.addActionListener(new TestButtonListener());

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("СОБЫТИЕ!");
            }
        }); //анонимный класс
        /*   button.addActionListener(e -> System.out.println("СОБЫТИЕ ЧЕРЕЗ ЛЯМБДУ!")); //лямбда выражение*/
        super.add(button);
    }
}
