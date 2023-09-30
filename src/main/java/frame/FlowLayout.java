package frame;

import javax.swing.*;
import java.awt.*;

public class FlowLayout extends JFrame {

    FlowLayout() {
        super("Layout");
        this.setBounds(800, 340, 600, 400);
        initComponents();
//        this.pack();

        this.setDefaultCloseOperation(3);
    }


    JButton button1 = new JButton("Button1");
    JButton button2 = new JButton("Button2");
    JButton button3 = new JButton("Button3");
    JButton button4 = new JButton("Button4");
    JPanel panel = new JPanel(new java.awt.FlowLayout(0));

    private void initComponents() {
        button1.setPreferredSize(new Dimension(100, 50));
        button2.setPreferredSize(button2.getPreferredSize());
        panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        this.getContentPane().add(panel, BorderLayout.PAGE_START);
    }

    public static void main(String[] args) {
        new FlowLayout().setVisible(true);
    }
}