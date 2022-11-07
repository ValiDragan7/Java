import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener{

    JRadioButton pizzabButton;
    JRadioButton hamburgerbButton;
    JRadioButton hotdogButton;
    ImageIcon pizzIcon= new ImageIcon("pizza.png");
    ImageIcon hamgurIcon= new ImageIcon("hamburger.png");
    ImageIcon hotIcon= new ImageIcon("hotdog.png");
    MyFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        ButtonGroup group= new ButtonGroup();

        pizzabButton= new JRadioButton("PIZZA");
        pizzabButton.addActionListener(this);
        pizzabButton.setIcon(pizzIcon);
        hamburgerbButton= new JRadioButton("HAMBURGIR");
        hamburgerbButton.addActionListener(this);
        hamburgerbButton.setIcon(hamgurIcon);
        hotdogButton= new JRadioButton("HAAAMMMM");
        hotdogButton.addActionListener(this);
        hotdogButton.setIcon(hotIcon);

        group.add(pizzabButton);
        group.add(hamburgerbButton);
        group.add(hotdogButton);

        this.add(pizzabButton);
        this.add(hamburgerbButton);
        this.add(hotdogButton);
        this.pack();
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== pizzabButton){
            System.out.println("Haida la pizzaaaaa");}
        if(e.getSource()== hamburgerbButton){
            System.out.println("Burgirr!");}
        if(e.getSource()== hotdogButton){
            System.out.println("MIaaaaaaaaaaaaaaaaaaaut!");}
    } 
}
