package controller;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Student extends JFrame {
    private JLabel label;
    private JTextField textField;
    private JButton button;
    private JCheckBox checkBox;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private ButtonGroup radioGroup;
    private JComboBox<String> comboBox;
    private JList<String> list;

    public Student() {
        // Set up the frame
        setTitle("Swing Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Add a label
        label = new JLabel("Enter your name:");
        add(label);

        // Add a text field
        textField = new JTextField(20);
        add(textField);

        // Add a button
        button = new JButton("Click Me!");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                JOptionPane.showMessageDialog(null, "Hello, " + name + "!");
            }
        });
        add(button);

        // Add a checkbox
        checkBox = new JCheckBox("Check me");
        add(checkBox);

        // Add radio buttons
        radioButton1 = new JRadioButton("Option 1");
        radioButton2 = new JRadioButton("Option 2");
        radioGroup = new ButtonGroup();
        radioGroup.add(radioButton1);
        radioGroup.add(radioButton2);
        add(radioButton1);
        add(radioButton2);

        // Add a combo box
        comboBox = new JComboBox<String>(new String[]{"Option 1", "Option 2", "Option 3"});
        add(comboBox);

        // Add a list
        list = new JList<String>(new String[]{"Item 1", "Item 2", "Item 3"});
        add(list);

        // Display the frame
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Student();
            }
        });
    }
}
