public class Lab3P13 {
    public static int Ackerman(int m,int n){
        if(m==0){
            n=n+1;
            return n;
        }        
        if(n==0)
            return Ackerman(m-1,1);
        return Ackerman(m-1,Ackerman(m, n-1));
    }
    public static void main(String[] args) {
        System.out.println(Ackerman(5, 6));
    }
}
