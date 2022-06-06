import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Window extends JFrame implements ActionListener{
    private JLabel area;
    private JButton b;
    private GridLayout g;
    private int LIFE;
    public Window() {
    LIFE = 20;
    setSize(200, 200);
    setLayout(g = new GridLayout(1,2));
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    area = new JLabel();
    area.setText("Boss");
    b = new JButton("Tryck här");
    b.addActionListener(this);
    add(area);
    add(b);
    setVisible(true);
    }
    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        // TODO Auto-generated method stub
        LIFE = LIFE-1;
        if(LIFE == 0)
            area.setText("Defeat");
        else
            area.setText(String.valueOf(LIFE));
    }
}
