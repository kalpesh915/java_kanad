import javax.swing.*;

public class Pro2 extends JFrame {

    Pro2(){
        JButton button = new JButton("Welcome");
        button.setBounds(100, 100, 100, 30);
        add(button);

        setSize(500, 500);
        setLayout(null);
        setVisible(true);

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Pro2();
    }
}
