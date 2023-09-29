package frame;


import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {


    public Frame() {


        super("Frame's Title");
        this.setDefaultCloseOperation(3);
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;

        this.setSize(800, 600);
        int framesWidth = this.getWidth();
        int framesHeight = this.getHeight();

        this.setLocation((width - framesWidth) / 2, (height - framesHeight) / 2);
//        this.setBounds((width-framesWidth)/2, (height-framesHeight)/2, 800, 600);
//        this.setIconImage(Toolkit.getDefaultToolkit().getImage("src/main/resources/HotFlame.png"));


//        JFrame frame = new JFrame("Title of frame");
//        frame.setTitle("Frame's title");
//        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("src/main/resources/HotFlame.png"));
//        frame.setVisible(true);
//        frame.setLocation(200, 300);
//        frame.setResizable(false); // can't change size of frame
//        frame.setSize(800, 600);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Frame().setVisible(true);
    }
}
