import java.awt.*;
import javax.swing.*;
//Panel e o componenta care func ca un container care contine alte componente
public class SwingPanel extends JFrame{

    SwingPanel(){

        
        JLabel label =new JLabel("Luffy.gif");
        ImageIcon icon1= new ImageIcon("luffy.gif");
        label.setIcon(icon1);
        label.setBounds(0,0,200,100);

        //panels
        JPanel redPanel = new JPanel();//creare panel
        redPanel.setBackground(Color.RED);//schimbare culoare
        redPanel.setBounds(0,0,200,200);//setare poz si dimensiune
        // redPanel.setLayout(null);// setam loyoutul ca null 
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(200,0,200,200);
        // bluePanel.setLayout(null);
        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(0,200,400,200);
        // greenPanel.setLayout(null);

        //basic frame,resizable,terminare la x,800x600,layout null
        this.setTitle("Panels Swing");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(800,600);
        this.setVisible(true);
        greenPanel.add(label);// adaugam label intr-un panel
        //adaugare panels
        this.add(redPanel);
        this.add(bluePanel);
        this.add(greenPanel);
        

    }
}
