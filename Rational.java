public class Rational {
    private int numarator;
    private int numitor;

    Rational(int a, int b){
        this.numarator= a/CMMDC(a, b);
        this.numitor= b/CMMDC(a, b);
    }
    public int CMMDC(int a,int b){
        while(a != b) {
            if(a > b) 
                a = a - b;
            else 
                b = b - a;
        }
        return a;
    }

    
    public Rational adunare(Rational B){
        Rational C= new Rational(0,0);
        if(this.numitor==B.numitor){
            C= new Rational(this.numarator+B.numarator,this.numitor);
            return C;
        }else
        C= new Rational(this.numarator*B.numitor+this.numitor*B.numarator, this.numitor*B.numitor);
        return C;
    }
    public Rational Scadere(Rational B){
        Rational C= new Rational(0,0);
        if(this.numitor==B.numitor){
            C= new Rational(this.numarator-B.numarator,this.numitor);
            return C;
        }else
        C= new Rational(this.numarator*B.numitor-this.numitor*B.numarator, this.numitor*B.numitor);
        return C;
    }
    public Rational Inmultire(Rational B){
        Rational C= new Rational(this.numarator*B.numarator, this.numitor*B.numitor);
        return C;
    }
    public Rational Impartire(Rational B){
        Rational C= new Rational(this.numarator*B.numitor, this.numitor*B.numarator);
        return C;
    }
    public void Afisare(){
        System.out.printf("%d/%d\n",this.numarator,this.numitor);
    }
}
