import javax.swing.*;

public class Pro1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        JButton button1 = new JButton("Click Me");
        button1.setBounds(100, 100, 100, 50);
        frame.add(button1);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}