import javax.swing.JOptionPane;

public class ContBancarTest {
    public static void main(String[] args) {
        ContBancar C= new ContBancar(40, 10);
        int i=1;
        while(i!=0){
            C.afisareContSuma();
            System.out.println("\n1.Adaugare Numerar\n2.Retragere Numerar\n9.Iesire.");
            String s= JOptionPane.showInputDialog("Introdu optiune:");
            i= Integer.parseInt(s);
            if(i==1){
                String d = JOptionPane.showInputDialog("Suma adaugata: ");
                int n = Integer.parseInt(d);
                C.depunereNumerar(n);
            }
            if(i==2){
                String d =JOptionPane.showInputDialog("Suma retrasa:");
                int n = Integer.parseInt(d);
                C.retragereNumerar(n);
            }
            if(i==9)
                break;
            else
                System.out.println("Operatie nereusita");
        }
    }
}
