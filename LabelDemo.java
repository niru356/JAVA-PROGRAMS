import java.awt.*;
import java.awt.event.*;

public class LabelDemo extends Frame {

    LabelDemo() {
        super("Flow Layout");

        Label l1 = new Label("Welcome to the Java AWT");
        l1.setBounds(50, 50, 150, 30);

        Label l2 = new Label("Center Label", Label.CENTER);
        l2.setBounds(50, 100, 150, 30);

        add(l1);
        add(l2);

        setSize(300, 200);
        setLayout(null);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new LabelDemo();
    }
}