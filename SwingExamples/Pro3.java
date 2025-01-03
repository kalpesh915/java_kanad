import javax.swing.*;

public class Pro3 extends JFrame {
    Pro3(){
        JButton button1 = new JButton("Yes");
        JButton button2 = new JButton("No");

        button1.setBounds(100, 100, 100, 40);
        button2.setBounds(200, 100, 100, 40);

        add(button1);
        add(button2);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Pro3();
    }
}
