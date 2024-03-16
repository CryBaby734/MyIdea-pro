import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){
        JLabel label = new JLabel();
        label.setText("Bro Do you even Code? ");
        this.setTitle("Detroit App");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(420,420);
        this.setVisible(true);
        ImageIcon image = new ImageIcon("detroit.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(123,50,250));
    }

}
