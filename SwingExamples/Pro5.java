import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pro5 extends JFrame implements ActionListener {
    JLabel label1;
    JButton button1;
//    JTextField text1;
    JTextArea text1;

    Pro5(){
        button1 = new JButton("Get Data");
        label1 = new JLabel("Answer is ");
        text1 = new JTextArea();

        text1.setBounds(100, 50, 100, 50);
        button1.setBounds(100, 100, 100, 40);
        label1.setBounds(100, 150, 100, 40);

        add(button1);
        add(label1);
        add(text1);

        button1.addActionListener(this);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Pro5();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        label1.setText(text1.getText());
    }
}
