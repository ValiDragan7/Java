public class Complex {
    private double parteaReala;
    private double parteaImag;
    Complex(){
        this.parteaReala= 0;
        this.parteaImag= 0;
    }
    Complex(double r, double i){
        this.parteaReala=r;
        this.parteaImag= i;
    }
    public Complex Adunare(Complex B){
        Complex C= new Complex(this.parteaReala+B.parteaReala,this.parteaImag+B.parteaImag);
        return C;
    }
    public Complex Scadere(Complex B){
        Complex C= new Complex(this.parteaReala-B.parteaReala,this.parteaImag-B.parteaImag);
        return C;
    }
    public void Afisare(){
        System.out.printf("(%.2f,%.2f)\n",this.parteaReala,this.parteaImag);
    }
}
