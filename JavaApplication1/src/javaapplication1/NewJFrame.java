
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Vali
 */
public class NewJFrame extends JFrame implement ActionListener
{
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JPanel textField= new JPanel();
    
    public NewJFrame() {
        initComponents();
    

    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        this.setLayout(new GridLayout(3,3,10,15));
        this.setSize(800,500);

        button1 = new JButton("Problema 1");
        button1.setBackground(Color.CYAN);
        button1.setFocusable(false);
        button1.setFont(new Font("Ariel", Font.BOLD,20));
        button1.setForeground(new Color(76,115,38));
        button1.addActionListener(this);
        button1.addMouseListener(new MouseListener(){

            @Override
            public void mouseClicked(MouseEvent e) {
            
            }

            @Override
            public void mousePressed(MouseEvent e) {
                
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                button1.setToolTipText("Se dau 3 multimi de numere, A={a(1),..,a(n)},B={b(1),..,b(n)},C={c(1),...,c(n)}.Se cere sa se stabileasca daca exista a[i],b[j],c[k] astfel incat 2b[j]=a[i]+c[k].");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }

        });


        button2 = new JButton("Problema 2");
        button2.setFocusable(false);
        button2.setFont(new Font("Ariel", Font.BOLD,20));
        button2.setForeground(new Color(255,0,0));

        button3 = new JButton("Problema 3");
        button3.setFocusable(false);
        button3.setFont(new Font("Ariel", Font.BOLD,20));
        button3.setForeground(new Color(255,0,0));

        button4 = new JButton("Problema 4");
        button4.setFocusable(false);
        button4.setFont(new Font("Ariel", Font.BOLD,20));
        button4.setForeground(new Color(255,0,0));

        button5 = new JButton("Problema 5");
        button5.setFocusable(false);
        button5.setFont(new Font("Ariel", Font.BOLD,20));
        button5.setForeground(new Color(255,0,0));

        button6 = new JButton("Problema 6");
        button6.setFocusable(false);
        button6.setFont(new Font("Ariel", Font.BOLD,20));
        button6.setForeground(new Color(255,0,0));

        button7 = new JButton("Problema 7");
        button7.setFocusable(false);
        button7.setFont(new Font("Ariel", Font.BOLD,20));
        button7.setForeground(new Color(255,0,0));

        button8 = new JButton("Problema 8");
        button8.setFocusable(false);
        button8.setFont(new Font("Ariel", Font.BOLD,20));
        button8.setForeground(new Color(255,0,0));

        button9 = new JButton("Problema 9");
        button9.setFocusable(false);
        button9.setFont(new Font("Ariel", Font.BOLD,20));
        button9.setForeground(new Color(255,0,0));


        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(button4);
        this.add(button5);
        this.add(button6);
        this.add(button7);
        this.add(button8);
        this.add(button9);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button1){
            this.dispose();
            new Problema1GUI();
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
