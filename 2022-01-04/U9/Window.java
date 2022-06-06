import javax.lang.model.util.ElementScanner6;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.*;
public class Window extends JFrame implements ActionListener{
    private JButton plus;
    private JButton times;
    private JButton minus;
    private JTextField input1;
    private JTextField input2;
    private GridLayout g;
    private JLabel total;
    public Window() {
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(g = new GridLayout(2,3));
        input1 = new JTextField();
        input2 = new JTextField();

        total = new JLabel("Total: ");

        plus = new JButton("+");
        minus = new JButton("-");
        times = new JButton("x");

        plus.addActionListener(this);
        minus.addActionListener(this);
        times.addActionListener(this);

        plus.setActionCommand("plus");
        minus.setActionCommand("minus");
        times.setActionCommand("times");

        add(input1);
        add(total);
        add(input2);
        add(plus);
        add(minus);
        add(times);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        Integer one = Integer.parseInt(input1.getText());
        Integer two = Integer.parseInt(input2.getText());
        if(e.getActionCommand() == "plus") {
            total.setText("Total: " + (one + two));
        }
        else if(e.getActionCommand() == "minus") {
            total.setText("Total: " + (one - two));
        }
        else 
            total.setText("Total: " + (one * two));
    }
}
