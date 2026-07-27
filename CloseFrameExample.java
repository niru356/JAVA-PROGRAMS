import java.awt.*;
import java.awt.event.*;

public class CloseFrameExample extends Frame {

    CloseFrameExample() {
        setTitle("AWT Frame Example");
        setSize(600, 300);
        setLayout(new FlowLayout());

        Label l = new Label("Click the Close (X) button to Exit");
        add(l);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public static void main(String args[]) {
        new CloseFrameExample();
    }
}