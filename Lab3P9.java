import javax.swing.*;
public class Lab3P9 {
    public static int Factorial(int a){
        int d = 1;
        if(a == 0)
            return 1;
        for(int i=1;i<=a;i++)
            d=d*i;
        return d;
    }
    public static double Combinari(int k, int n){
        if(n>k)
            return (Factorial(n-1)/(Factorial(k-1)*Factorial(n-k-2)))-Combinari(k,n-1);
        return 0;
    }
    public static void main(String[] args) {
        String s1= JOptionPane.showInputDialog("Introduceti un numar k: ");
        int k = Integer.parseInt(s1);
        String s2= JOptionPane.showInputDialog("Introduceti un numar n: "); 
        int n = Integer.parseInt(s2);

        System.out.println("Combinari de n luate cate k este egal cu: "+ Combinari(k, n));
    }
}
