import javax.swing.*;
import java.awt.*;
import javax.swing.JLabel;

public class Main {
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("src/detroit.png");
        JLabel label = new JLabel();
        JFrame frame = new JFrame();
        label.setText("Bro, do you even code?");
        label.setIcon(image);       

        frame.setTitle("Detroit App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        
        frame.add(label);


        frame.setVisible(true);
    }
}