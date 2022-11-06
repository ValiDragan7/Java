import java.awt.Font;

import javax.swing.*;

public class NewWindow {
    
    JFrame frame = new JFrame();
    JLabel label = new JLabel("Hello!");
    NewWindow(){
        
        label.setBounds(225,225,50,50);
        label.setFont(new Font("Calibri",Font.BOLD,20));

        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
