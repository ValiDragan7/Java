import javax.swing.JOptionPane;

public class Dreptunghi {
    private double lungime;
    private double latime;

    public Dreptunghi(){
        this.lungime= 1;
        this.latime = 1;
    }
    public void afisarePerimetrul(){
        System.out.println("Perimetrul dreptunghiului este: "+ (lungime*2+latime*2));
    }
    public void afisareArie(){
        System.out.println("Aria dreptunghiului este: "+ (lungime*latime));
    }
    public void setLungime(){
        String s= JOptionPane.showInputDialog("Noua lungime: ");
        double n = Integer.parseInt(s);
        if(0<=n && n<=20)
            this.lungime= n;
        else
            System.out.println("Valoare nu se afla in [0,20]");
    }
    public void setLatime(){
        String s= JOptionPane.showInputDialog("Noua latime: ");
        double n = Double.parseDouble(s);
        if(0 <= n && n <= 20)
            this.latime= n;
        else
            System.out.println("Valoare nu se afla in [0,20]");
    }
    public double getLungime(){
        return this.lungime;
    }
    public double getLatime(){
        return this.latime;
    }
}
