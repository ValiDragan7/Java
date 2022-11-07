import javax.swing.*;

public class Test {
    
    
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("icon.jpeg");
        String responses[]= {"BINEEE MAA","RAUUUU MAAA","vorbesti singur"};
        // JOptionPane.showMessageDialog(null, "Hai la baie", "", JOptionPane.PLAIN_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Hai la baie", "", JOptionPane.INFORMATION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Hai la baie", "", JOptionPane.QUESTION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Hai la baie", "", JOptionPane.WARNING_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Hai la baie", "", JOptionPane.ERROR_MESSAGE);

        // int raspuns = JOptionPane.showConfirmDialog(null, "Vrei la baie?", "xxx", JOptionPane.YES_NO_CANCEL_OPTION);
        // String name = JOptionPane.showInputDialog("What is your name?"); 
        JOptionPane.showOptionDialog(null, "CE FAAA MAAA", "hello", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,image , responses, 0);      
    }
}
