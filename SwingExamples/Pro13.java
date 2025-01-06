import javax.swing.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class Pro13 extends JFrame implements AdjustmentListener {
    JScrollBar scrollBar;
    JLabel label;
    Pro13(){
        scrollBar = new JScrollBar(1,0, 0, 0, 100);
        label = new JLabel("");

        scrollBar.setBounds(100, 100, 50, 150);
        label.setBounds(200, 250, 100, 50);

        add(scrollBar);
        add(label);

        scrollBar.addAdjustmentListener(this);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Pro13();
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        label.setText("Scroll bar "+scrollBar.getValue());
    }
}
