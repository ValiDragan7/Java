import javax.swing.*;
public class Lab3P12 {
    public static int Putere(int a, int p){
        if(p==0)
            return 1;
        else
            return a*Putere(a,p-1);
    }
    public static void main(String[] args) {
        String s1= JOptionPane.showInputDialog("Adaugati numarul: ");
        int a= Integer.parseInt(s1);
        String s2= JOptionPane.showInputDialog("Adaugati puterea nuamrului: ");
        int p= Integer.parseInt(s2);

        System.out.printf("Numarul %d la puterea %d este egal cu %d",a,p,Putere(a,p));
    }
}
