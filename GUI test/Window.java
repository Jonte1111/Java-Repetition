import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import java.awt.*;
public class Window extends JFrame{
    private GridLayout g;
    private JPanel p1;
    private JPanel p2;
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;
    public Window() {
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(g = new GridLayout(2,0));
        //p1.setLayout(new FlowLayout());
        p2 = new JPanel();
        p2.setLayout(new FlowLayout());
        b1 = new JButton("Knapp 1");
        b2 = new JButton("Knapp 2");
        b3 = new JButton("Knapp 3");
        b4 = new JButton("Knapp 4");
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        //p1.add(new JTextField());
        add(new JTextArea());
        add(p2);
        setVisible(true);
    }
}
