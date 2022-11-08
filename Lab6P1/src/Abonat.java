public class Abonat {
    private int codAbonat;
    private ModelNumeTelefon nrTelefon;
    private Persoana date;
    public static int index=1;
    Abonat(String pren,String num){
        this.codAbonat= index;
        Abonat.index+=1;
        this.date= new Persoana(num, pren);
        this.nrTelefon= new ModelNumeTelefon();
    }
    Abonat(String judet,String tara,String nrTel,String nume, String Prenume){
        this.codAbonat= index++;
        nrTelefon= new ModelNumeTelefon(tara,judet,nrTel);
        date= new Persoana(nume, Prenume);
    }
    public void getInformatii(){
        System.out.println("Abonatul cu codul "+ codAbonat+" si cu numele"+date.getName()+ " "+ date.getPrenume()+ " are numarul de telefon "+nrTelefon.convertesteNumarTelefon());
    }
    public int getIndex(){
        return codAbonat;
    }
}
