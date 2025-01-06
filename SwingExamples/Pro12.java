import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pro12 extends JFrame implements ActionListener {
    JButton button1;

    Pro12(){
        button1 = new JButton("Get Data");
        button1.setBounds(100, 100, 100, 40);

        add(button1);

        button1.addActionListener(this);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Pro12();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //int ans = JOptionPane.showConfirmDialog(this,"Are You Sure");
        String ans = JOptionPane.showInputDialog(this, "Enter Your Name");
        JOptionPane.showMessageDialog(this, ans);
        //JOptionPane.showMessageDialog(this, ans, "Alert", JOptionPane.WARNING_MESSAGE);

    }
}
