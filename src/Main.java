import java.awt.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = initialize();
        // need to create the sub grids inside



    }

    public static JFrame initialize(){
        // creating the frame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 900);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        frame.setLayout(new GridLayout(3, 3)); // frame to hold the 9x9 areas
        frame.add(createPanel());
        frame.add(createPanel());
        frame.add(createPanel());
        frame.add(createPanel());
        frame.add(createPanel());
        frame.add(createPanel());
        frame.add(createPanel());
        frame.add(createPanel());
        frame.add(createPanel());
        System.out.print(frame.isDoubleBuffered());
        frame.setVisible(true); // this thing is cooked make sure it is last!!!!!

        return frame;
    }

    public static JPanel createPanel(){
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3));
        panel.setSize(100, 100);
        panel.setVisible(true);
        JButton b1=new JButton("1");
        JButton b2=new JButton("2");
        JButton b3=new JButton("3");
        JButton b4=new JButton("4");
        JButton b5=new JButton("5");
        JButton b6=new JButton("6");
        JButton b7=new JButton("7");
        JButton b8=new JButton("8");
        JButton b9=new JButton("9");
        // adding buttons to the frame
        panel.add(b1); panel.add(b2); panel.add(b3);
        panel.add(b4); panel.add(b5); panel.add(b6);
        panel.add(b7); panel.add(b8); panel.add(b9);
        return panel;
    }
}