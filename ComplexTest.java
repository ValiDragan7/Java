public class ComplexTest {
    public static void main(String[] args) {
        Complex A= new Complex(3.2,6);
        Complex B= new Complex(5.7,2);
        Complex C = new Complex();
        A.Afisare();
        B.Afisare();
        C=A.Adunare(B);
        System.out.printf("Cele 2 numere complexe adunate dau ");
        C.Afisare();
        C=A.Scadere(B);
        System.out.printf("Daca facem operatie A-B ramanem cu ");
        C.Afisare();
    }
}
