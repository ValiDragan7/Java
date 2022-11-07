import javax.swing.JOptionPane;

 

public class App {

    public static String num(String nume){
        return nume.substring(0,2);
    }
    public static String pren(String pren){
        return pren.substring(pren.length()-2,pren.length());
    }
    public static String an(String an){
        return an.substring(an.length()-2,an.length());
    }
    public static void main(String[] args) throws Exception {
        String name;
        String prenume;
        String datanaster;

        name =JOptionPane.showInputDialog("Nume:");
        prenume=JOptionPane.showInputDialog("Prenume:");
        datanaster=JOptionPane.showInputDialog("Data de nastere:(in format zi/luna/an)");
        System.out.println("Parola ta este "+num(name)+pren(prenume)+an(datanaster));
    }
}
