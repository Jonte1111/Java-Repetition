import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Window extends JFrame implements ActionListener {
    private JList list;
    private JButton add;
    private JButton sum;
    private JTextField text;
    private FlowLayout f;
    private DefaultListModel dlm;
    public Window() {
        setSize(800, 800);
        setLayout(f = new FlowLayout());
        dlm = new DefaultListModel<Integer>();
        list = new JList<Integer>();
        list.setModel(dlm);
        text = new JTextField(10);
        add = new JButton("Add");
        sum = new JButton("Sum");
        add.addActionListener(this);
        sum.addActionListener(this);
        add.setActionCommand("add");
        sum.setActionCommand("sum");
        add(list);
        add(text);
        add(add);
        add(sum);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getActionCommand() == "add") {
            dlm.addElement(Integer.parseInt(text.getText()));
        if(e.getActionCommand() == "sum") {
            int tmp = 0;
            for(int i = 0; i < dlm.getSize(); i++) {
                tmp += (Integer)dlm.getElementAt(i);
            }
            JOptionPane.showMessageDialog(null, "Totalt: " + tmp, "Summa", JOptionPane.OK_OPTION);
        }
        }
    }
}
