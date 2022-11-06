package Automatfinit;
public class Test {
    public static void main(String args[]) throws Exception{
        Automat M = new Automat("D:/Java/Automatfinit/automat.txt");
        System.out.println(M.analizeazaCuvant("abba"));
    }   
}
