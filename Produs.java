public class Produs {
    private String nume;
    private double pret;
    public Produs(String n, int pret){
        this.nume = n;
        this.pret = pret;
    }
    public void AfiseazaProdus(){
        System.out.println("Produsul se numeste "+ nume);
    }
    public double GetPret(){
        return pret;
    }
    public void SetPret(int np){
        pret = np;
    }
    public void aplicaPret(int r){
        pret= pret - (pret*r)/100;
    }
}
