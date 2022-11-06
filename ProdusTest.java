public class ProdusTest {
    public static void main(String[] args) {
        Produs A= new Produs("Malai", 200);
        A.AfiseazaProdus();
        System.out.printf("Pretul produsului este %f",A.GetPret());
        A.aplicaPret(10);
        System.out.printf("\nPretul produsului este %f",A.GetPret());
    }    
}
