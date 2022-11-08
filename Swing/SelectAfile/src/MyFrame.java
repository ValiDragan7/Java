import javax.swing.*;
import java.io.File;
import java.awt.event.*;
import java.awt.*;
public class MyFrame extends JFrame implements ActionListener{

    JButton button= new JButton("SELECT FILE");
    MyFrame(){

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button.addActionListener(this);

        this.add(button);
        this.pack();
        this.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== button){
            JFileChooser fileChooser= new JFileChooser();
            fileChooser.setCurrentDirectory(new File("."));//din ce folder porneste
            int response = fileChooser.showOpenDialog(null);//selecteaza
         // int response = fileChooser.showSaveDialog(null);//salveaza


            if(response == JFileChooser.APPROVE_OPTION){
                File file= new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }
        }
    }
    
}
