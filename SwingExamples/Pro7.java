import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Pro7 extends JFrame implements ItemListener {
    JRadioButton gender1, gender2;
    ButtonGroup btng = new ButtonGroup();
    JButton button1;
    JLabel label1;

    Pro7(){

        gender1 = new JRadioButton("Male", true);
        gender2 = new JRadioButton("Female");
        button1 = new JButton("Get Status");
        label1 = new JLabel("Answer is ");

        gender1.setBounds(100, 100, 100, 50);
        gender2.setBounds(200, 100, 100, 50);
        button1.setBounds(100, 150, 100, 50);
        label1.setBounds(100, 200, 100, 50);

        btng.add(gender1);
        btng.add(gender2);

        add(gender1);
        add(gender2);
        add(button1);
        add(label1);

        gender1.addItemListener(this);
        gender2.addItemListener(this);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Pro7();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(gender1.isSelected()){
            label1.setText("Male");
        }else{
            label1.setText("Female");
        }
    }
}
