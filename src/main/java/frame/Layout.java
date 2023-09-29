package frame;

import javax.swing.*;
import java.awt.*;

public class Layout extends JFrame {

    public Layout() {
        super("Layout");
        this.setBounds(800, 340, 600, 400);
        initComponents();
        this.pack();

        this.setDefaultCloseOperation(3);
    }

    JButton center;
    JButton up;
    JButton down;
    JButton left;
    JButton right;

    public void initComponents() {
        center = new JButton("I'm in Center");
        up = new JButton("I'm on Up");
        down = new JButton("I'm on down");
        left = new JButton("I'm by left");
        right = new JButton("I'm by right");
        Container container = this.getContentPane();

        container.add(center, BorderLayout.CENTER);
        container.add(up, BorderLayout.PAGE_START);
        container.add(down, BorderLayout.PAGE_END);
        container.add(left, BorderLayout.LINE_START);
        container.add(right, BorderLayout.LINE_END);

//        center.setLocation(100, 50);
//        center.setSize(center.getPreferredSize());
//        container.setLayout(null);
//        container.add(center, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new Layout().setVisible(true);
    }
}
