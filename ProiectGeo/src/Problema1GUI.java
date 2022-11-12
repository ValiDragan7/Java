import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Problema1GUI extends JFrame implements ActionListener {
    Problema1 problema1= new Problema1();
    JLabel label;   
    JTextArea textArea;
    JTextField textA, textB, textC;
    JButton buttonA, buttonB,buttonC,butFinal,butInapoi;
    Problema1GUI(){

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(800,600);
        

        textA= new JTextField();
        textA.setBounds(150,300,100,25);
        textB= new JTextField();
        textB.setBounds(350,300,100,25);
        textC= new JTextField();
        textC.setBounds(550,300,100,25);

        buttonA= new JButton("<html>Adauga<p>numar in A</html>");
        buttonA.setBounds(150,350,100,70);
        buttonA.addActionListener(this);
        buttonB= new JButton("<html>Adauga<p>numar in B</html>");
        buttonB.setBounds(350,350,100,70);
        buttonB.addActionListener(this);
        buttonC= new JButton("<html>Adauga<p>numar in C</html>");
        buttonC.setBounds(550,350,100,70);
        buttonC.addActionListener(this);

        butFinal= new JButton("Calculeaza!");
        butFinal.setBounds(350, 500, 100, 50);
        butFinal.addActionListener(this);

        label= new JLabel();
        label.setBounds(0, 0, 800, 600);
        label.setBackground(Color.ORANGE);
        label.setOpaque(true);
        label.setLayout(null);

        textArea= new JTextArea("   \nProblema 1:\n   Se dau 3 multimi de numere, A={a(1),..,a(n)},B={b(1),..,b(n)},C={c(1),...,c(n)}.\n   Se cere sa se stabileasca daca exista a[i],b[j],c[k] astfel incat 2*b[j]=a[i]+c[k].");
        textArea.setBounds(0,0,800,200);
        textArea.setLineWrap(true);
        textArea.setFont(new Font("Calibri",Font.PLAIN,20));
        textArea.setBackground(Color.MAGENTA);
        textArea.setEditable(false);
        
        label.add(butFinal);
        label.add(textArea);
        label.add(textA);
        label.add(textB);
        label.add(textC);
        label.add(buttonA);
        label.add(buttonB);
        label.add(buttonC);
        this.add(label);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==buttonA){
            problema1.a.add(Integer.parseInt(textA.getText()));
            JOptionPane.showMessageDialog(null,"Numar adaugat!");
            textA.setText(null);
        }
        if(e.getSource()==buttonB){
            problema1.b.add(Integer.parseInt(textB.getText())*2);
            JOptionPane.showMessageDialog(null,"Numar adaugat!");
            textB.setText(null);
        }
        if(e.getSource()==buttonC){
            problema1.c.add(Integer.parseInt(textC.getText()));
            JOptionPane.showMessageDialog(null,"Numar adaugat!");
            textC.setText(null);
        }
        if(e.getSource()==butFinal){
            int lungA = problema1.a.size();
	        int lungB = problema1.b.size();
	        int lungC = problema1.c.size();


	        // mergeSort(problema1.b,0, lungB-1);
	        // mergeSort(problema1.c,0, lungC-1);
            problema1.b.sort(null);
            problema1.c.sort(null);

            problema1.Coliniar(problema1.a,problema1.b,problema1.c,lungA,lungB,lungC);
        }
    }
    
}
