import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Pro10 extends JFrame{

    Pro10(){
        String data[][] = {
                {"1", "Kanad", "Joshi"},
                {"2", "Keval", "Joshi"},
                {"3", "Kevin", "Joshi"},
                {"4", "Kashyap", "Joshi"},
                {"5", "Krutrath", "Joshi"},
        };

        String title[] = {"ID", "First Name", "Last Name"};
        JTable table = new JTable(data, title);

        table.setBounds(10, 10, 200, 100);
        add(table);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Pro10();
    }
}
