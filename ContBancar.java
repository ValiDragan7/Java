public class ContBancar {
    private int numarCont;
    private double sumaCont;

    public ContBancar(int nrc,double sumaC){
        this.numarCont= nrc;
        this.sumaCont= sumaC;
    }
    public void depunereNumerar(int Ad){
        this.sumaCont += Ad;
    }
    public void retragereNumerar(int Re){
        if(Re> sumaCont)
            System.out.println("Extragere invalida");
        else
            sumaCont -= Re;
    }
    public void afisareContSuma(){
        System.out.print("Contul cu numarul "+ numarCont);
        System.out.print(" are suma "+ sumaCont);
    }
}
