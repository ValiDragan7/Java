public class ModelNumeTelefon {
    private String codTara;
    private String codJudet;
    private String nrTelefon;

    ModelNumeTelefon(){
        this.codTara="040";
        this.codJudet="0339";
        this.nrTelefon="0771547337";
    }
    ModelNumeTelefon(String T,String J,String nrTel){
        this.codTara= T;
        this.codJudet=J;
        this.nrTelefon=nrTel;
    }

    public String getTara(){
        return codTara;
    }
    public String getJudet(){
        return codJudet;
    }
    public String getNrTelefon(){
        return nrTelefon;
    }
    public void setTara(String t){
        this.codTara=t;
    }
    public void setJudet(String J){
        this.codJudet=J;
    }
    public void setNrTel(String nr){
        this.nrTelefon=nr;
    }

    public String convertesteNumarTelefon(){
        StringBuffer sb= new StringBuffer();
        sb.append(codTara);
        sb.append("-");
        sb.append(codJudet);
        sb.append("-");
        sb.append(nrTelefon);
        return sb.toString();
    }
}
