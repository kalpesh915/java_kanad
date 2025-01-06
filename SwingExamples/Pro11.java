import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;

public class Pro11 extends JFrame implements ListSelectionListener {
    JList<String> city;

    Pro11(){
        String cityName[] = {"Rajkot", "Baroda", "Ahamdabad", "Bhuj",
        "Surat", "Amreli", "Morbi"};

        city = new JList<>(cityName);
        city.setBounds(100, 100, 100, 100);
        city.addListSelectionListener(this);
        add(city);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Pro11();
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        //String myCity = city.getSelectedValue();
        //JOptionPane.showMessageDialog(this,"City is "+myCity);
        List<String> selectedCity = city.getSelectedValuesList();
        String data  = selectedCity.stream().reduce("", (x, y) -> x +" "+ y);
        JOptionPane.showMessageDialog(this, data);
    }
}
