import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.*;

public class primSwing extends JFrame {
    
    primSwing(){
        this.setTitle("Prima Interfata");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(800,600);
        this.setVisible(true);

        ImageIcon image= new ImageIcon("logo.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(150,40,225));
    }
}
