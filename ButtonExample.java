import java.awt.*;
import java.awt.event.*;

public class ButtonExample extends Frame implements ActionListener {

    Button btn;

    ButtonExample() {
        // Create button
        btn = new Button("Click Me");
		btn = new Button("Clear");
		btn = new Button("Hii My name is Nirakar");
		

        // Set button position
        btn.setBounds(100, 100, 100, 40);

        // Add action listener
        btn.addActionListener(this);

        // Add button to frame
        add(btn);

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

    // Action performed when button is clicked
    public void actionPerformed(ActionEvent e) {
        btn.setLabel("Clicked!");
    }

    public static void main(String[] args) {
        new ButtonExample();
    }
}