import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pro15 extends JFrame implements ActionListener {
    JButton button1;
    JColorChooser jc;
    Color color = Color.RED;
    Container container;
    Pro15(){
        button1 = new JButton("Set Color");
        button1.setBounds(100, 100, 100, 40);
        jc = new JColorChooser();
        container = getContentPane();

        container.setLayout(new FlowLayout());
        container.setSize(100, 100);

        container.add(button1);

        button1.addActionListener(this);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Pro15();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        color = JColorChooser.showDialog(this, "Select Color", color);
        container.setBackground(color);
    }
}
