import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
public class Window extends JFrame implements ActionListener{
    private JButton b;    
    private JTextField f;
    private Random r;
    private JLabel l; 
    private FlowLayout fl;
    public Window() {
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(fl = new FlowLayout());
        r = new Random();
        b = new JButton("KASTA TÄRNING");
        b.addActionListener(this);
        f = new JTextField(10);
        l = new JLabel("Total: ");
        add(f);
        add(l);
        add(b);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub
        l.setText("Total: " + kast(Integer.parseInt(f.getText())));
    }
    public int kast(int antal) {
        int total = 0;
        for(int i = 0;i < antal; i++) {
            total+= r.nextInt(6) + 1; 
        }
        return total;
    }
}
