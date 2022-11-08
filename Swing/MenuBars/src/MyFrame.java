import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.event.*;
import java.awt.*;

public class MyFrame extends JFrame implements ActionListener{
    JMenuBar menuBar= new JMenuBar();
    JMenu fileMenu= new JMenu("File");
    JMenu saveMenu= new JMenu("Save");
    JMenu helpMenu= new JMenu("Help");
    JMenuItem exitItem;
    JMenuItem saveItem;
    JMenuItem loadItem;
    MyFrame(){


        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        menuBar.add(fileMenu);
        menuBar.add(saveMenu);
        menuBar.add(helpMenu);

        loadItem= new JMenuItem("Load");
        saveItem= new JMenuItem("Save");
        exitItem= new JMenuItem("Exit");

        loadItem.setMnemonic(KeyEvent.VK_L);
        saveItem.setMnemonic(KeyEvent.VK_S);
        exitItem.setMnemonic(KeyEvent.VK_Q);

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        this.setJMenuBar(menuBar);
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
       
        if(e.getSource()==loadItem){
            System.out.println("Loaded");
        }
        if(e.getSource()==saveItem){
            System.out.println("Saved");
        }
        if(e.getSource()==exitItem){
            System.exit(0);
        }
    }
}
