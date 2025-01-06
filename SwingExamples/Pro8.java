import javax.swing.*;
public class Pro8 extends JFrame{
    JPasswordField passwordField;

    Pro8(){
        passwordField = new JPasswordField();
        passwordField.setBounds(100, 100, 100, 30);
        passwordField.setEchoChar('0');
        add(passwordField);
        setSize(400, 400);
        setVisible(true);
        setLayout(null);


        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Pro8();
    }
}
