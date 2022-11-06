import javax.swing.*;
public class Lab3P10 {
    public static int CMMDC(int u, int v){
        if(v==0)
            return u;
        else
            return CMMDC(u,u%v);
    }
    public static void main(String[] args) {
        String s1 = JOptionPane.showInputDialog("Introduceti primul numar: ");
        int n1= Integer.parseInt(s1);
        String s2= JOptionPane.showInputDialog("Introduceti al doilea numar: ");
        int n2 = Integer.parseInt(s2);

        System.out.println("Cel mai mic divizor comun al celor doua numere este "+CMMDC(n1, n2));
    }
}