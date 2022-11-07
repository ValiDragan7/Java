import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

public class ProgresBar {
    JFrame frame = new JFrame();
    JProgressBar progressBar=new JProgressBar();
    ProgresBar(){

        progressBar.setValue(0);
        progressBar.setBounds(0,0,500,50);
        progressBar.setStringPainted(true);
        progressBar.setFont(new Font("Comics Sans", Font.PLAIN,25));
        progressBar.setForeground(Color.GREEN);
        progressBar.setBackground(Color.BLACK);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.add(progressBar);
        frame.setLayout(null);
        frame.setVisible(true);

        fill();
    }
    public void fill(){
        int counter=0;
        while(counter<= 100){
            progressBar.setValue(counter);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter +=1;
        }
        progressBar.setString("Get HACKED! :0");
    }
}
