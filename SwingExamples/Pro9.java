import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Pro9 extends JFrame implements ItemListener {
    JComboBox<String> city;

    Pro9(){
        String cityList[] = {"Rajkot", "Baroda", "Ahadmabad", "Surat",
        "Bhuj"};

        city = new JComboBox<>(cityList);
        add(city);
        city.setBounds(100, 100, 100, 20);
        city.addItemListener(this);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Pro9();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        JOptionPane.showMessageDialog(this, city.getItemAt(city.getSelectedIndex()));
    }
}
