public class Persoana {
    private String nume;
    private String prenume;

    Persoana(String num,String pren){
        this.nume=num;
        this.prenume=pren;
    }

    String getName(){
        return this.nume;
    }
    String getPrenume(){
        return this.prenume;
    }
    void setName(String nam){
        this.nume= nam;
    }
    void setPrename(String nam){
        this.prenume= nam;
    }
}
