import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Pro6 extends JFrame implements ItemListener {
    JCheckBox jcb;
    JButton button1;
    JLabel label1;

    Pro6(){

        jcb = new JCheckBox("Rajkot", true);
        button1 = new JButton("Get Status");
        label1 = new JLabel("Answer is ");

        jcb.setBounds(100, 100, 100, 50);
        button1.setBounds(100, 150, 100, 50);
        label1.setBounds(100, 200, 100, 50);

        add(jcb);
        add(button1);
        add(label1);

        jcb.addItemListener(this);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Pro6();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(jcb.isSelected()){
            label1.setText("True");
        }else{
            label1.setText("False");
        }
    }
}
