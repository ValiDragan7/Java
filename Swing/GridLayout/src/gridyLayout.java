import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class gridyLayout{

    public static void main(String[] args) {
        

        // Grid Layout 
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new GridLayout(3,3,2,2));//randuri si coloane//distanta orizontala si verticala

        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
        //frame.add(new JButton("10"));//daca mai adaugam un buton, pe layout tul nostru se va mai crea o coloana 

        frame.setVisible(true);
    }
}