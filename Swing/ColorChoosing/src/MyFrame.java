import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame implements ActionListener{

    JButton button;
    JLabel label;

    MyFrame(){

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button= new JButton("Pick a color"); 
        button.addActionListener(this);

        label = new JLabel();
        label.setBackground(Color.white);
        label.setText("This is some text");
        label.setFont(new Font("MV Boli",Font.PLAIN,100));
        label.setOpaque(true);

        this.add(button);
        this.add(label);
        this.pack();
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== button){
            label.setForeground(JColorChooser.showDialog(null, "Pick a colour", Color.black));
        }
        
    }
    
}
