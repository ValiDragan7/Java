public class MultimeIntregi{
    private int[] arr;
    
    public MultimeIntregi(){
        arr= new int[10];
    }
    public MultimeIntregi(int[] b){
        arr=b;
    }
    public MultimeIntregi(int b){
        arr= new int[10];
        for(int i=0;i<arr.length+b;i++){
            arr[i]= (int)(Math.random()*2);
        }
    }
    public MultimeIntregi reuneste(MultimeIntregi m){
        int[]r= new int[10];
        for(int i =0;i<arr.length;i++){
            if(m.arr[i]==1 || arr[i]==i){
                r[i]=1;
            }
        }
        return new MultimeIntregi(r);
    }
    public MultimeIntregi intersectie(MultimeIntregi m){
        int[]r= new int[10];
        for(int i =0;i<arr.length;i++){
            if(m.arr[i]==1 && arr[i]==i){
                r[i]=1;
            }
        }
        return new MultimeIntregi(r);
    }
    public void insereazaElement(int n){
        if(n>=0 && n<=9)
        {
            if(arr[n]== 0) arr[n]=1;
            System.out.println("Elementul "+ n+" a fost adaugat in multime!");

        }   
        else{
            System.out.println("Numarul trebuie sa fie intre 1 si 9");
        } 
    }
    public void stergeElement(int n){
        if(n>=0 && n<=9){
            if(arr[n]==1) arr[n]=0;
        }
    }
}
