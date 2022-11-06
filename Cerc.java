
public class Cerc{
    private int raza;
        public Cerc(int raza){
            this.raza=raza;
        }
    public double getArie(){
        return Math.PI * Math.pow(raza,2);
    }
    public double getCircumferinta(){
        return Math.PI*2*raza;
    }
}