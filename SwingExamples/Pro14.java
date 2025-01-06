import javax.swing.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class Pro14 extends JFrame{
    JProgressBar jpb;

    Pro14(){

        jpb = new JProgressBar(0,0, 100);
        jpb.setValue(50);
        jpb.setStringPainted(true);
        jpb.setBounds(100, 100, 200, 50);
        add(jpb);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        execute();
    }

    public void execute(){
        int i = 0;
        while(i<=100){
            jpb.setValue(i);
            i=i+10;
            try{Thread.sleep(150);}catch(Exception e){}
        }
    }

    public static void main(String[] args) {
        new Pro14();

    }
}
