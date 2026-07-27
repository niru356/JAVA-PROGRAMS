import java.awt.*;
import java.awt.event.*;

public class CommodityBillCalculator extends Frame implements ActionListener {

    Checkbox rice, wheat, sugar, oil;
    Label result;
    Button calculate;

    public CommodityBillCalculator() {

        setTitle("Commodity Bill Calculator");
        setSize(350, 300);
        setLayout(new FlowLayout());

        rice = new Checkbox("Rice - $50");
        wheat = new Checkbox("Wheat - $40");
        sugar = new Checkbox("Sugar - $30");
        oil = new Checkbox("Oil - $120");

        calculate = new Button("Calculate Bill");
        result = new Label("Total Bill: $0");

        add(rice);
        add(wheat);
        add(sugar);
        add(oil);
        add(calculate);
        add(result);

        calculate.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int total = 0;

        if (rice.getState())
            total += 50;

        if (wheat.getState())
            total += 40;

        if (sugar.getState())
            total += 30;

        if (oil.getState())
            total += 120;

        result.setText("Total Bill: $" + total);
    }

    public static void main(String[] args) {
        new CommodityBillCalculator();
    }
}