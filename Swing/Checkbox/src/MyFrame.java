import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener{
    JCheckBox checkBox = new JCheckBox();
    JButton button = new JButton();
    ImageIcon verified;
    ImageIcon unverif;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        verified= new ImageIcon("v2.png");
        unverif = new ImageIcon("x.png");

        checkBox.setText("I'm not a robot!");
        checkBox.setFocusable(false);
        checkBox.setIcon(unverif);
        checkBox.setSelectedIcon(verified);
        button.setText("submit");
        button.addActionListener(this);

        this.add(checkBox);
        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource()== button)
            System.out.println(checkBox.isSelected());
    }
    
}
