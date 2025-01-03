import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pro4 extends JFrame implements ActionListener {
    JLabel label1;
    JButton button1, button2;
    Pro4(){
        button1 = new JButton("Yes");
        button2 = new JButton("No");
        label1 = new JLabel("Answer is ");

        button1.setBounds(100, 100, 100, 40);
        button2.setBounds(200, 100, 100, 40);
        label1.setBounds(150, 50, 100, 40);

        add(button1);
        add(button2);
        add(label1);

        button1.addActionListener(this);
        button2.addActionListener(this);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Pro4();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //label1.setText("Button Clicked");
        label1.setText(e.getActionCommand());
    }
}
