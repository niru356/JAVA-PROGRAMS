import java.awt.*;
import java.awt.event.*;

public class ButtonClickExample extends Frame implements ActionListener {

    Button btn;
    Label lbl;

    ButtonClickExample() {
        // Create button and label
        btn = new Button("Click Me");
        lbl = new Label("Button not clicked");

        // Set positions
        btn.setBounds(100, 100, 80, 30);
        lbl.setBounds(80, 150, 150, 30);

        // Register ActionListener
        btn.addActionListener(this);

        // Add components
        add(btn);
        add(lbl);

        // Frame settings
        setSize(300, 250);
        setLayout(null);
        setVisible(true);

        // Close window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    // Handle button click
    public void actionPerformed(ActionEvent e) {
        lbl.setText("Button Clicked!");
    }

    public static void main(String[] args) {
        new ButtonClickExample();
    }
}