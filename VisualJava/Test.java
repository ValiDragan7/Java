public class Test {
    public static void main(String args[]) throws Exception{
        Automat M = new Automat("automat.txt");
        System.out.println(M.analizeazaCuvant("abba"));
        M.Determinist();
    }   
}