public class RationalTest {
    public static void main(String[] args) {
        Rational A= new Rational(1, 3);
        A.Afisare();
        Rational B = new Rational(2, 4);
        B.Afisare();
        Rational C= new Rational(0, 0);
        C=A.Inmultire(B);
        C.Afisare();
    }
}
