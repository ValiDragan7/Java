import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyFrame extends JFrame implements ActionListener{
    
    JComboBox comboBox;

    MyFrame(){
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String animal[]= {"dog","bee","cat"};
        comboBox= new JComboBox<>(animal);
        comboBox.addActionListener(this);

        // comboBox.setEditable(true);//poti selecta elementele din combobox si prin scriere
        // comboBox.getItemCount();//returneaza numarul de elemente din combobox
        // comboBox.addItem("horse");
        // comboBox.insertItemAt("pig", 0);//insereaza un element la o anumita pozitie
        // comboBox.setSelectedIndex(0);//seteaza elementul selectat la inceput programului
        // comboBox.removeItem("pig");//ELIMINA UN element dupa nume
        // comboBox.removeItemAt(0);//elimina un element dupa index
        // comboBox.removeAllItems();//sterge toate elementele

        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== comboBox)
            System.out.println(comboBox.getSelectedItem());
    }
}
