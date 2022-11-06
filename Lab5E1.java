public class Lab5E1 {
    
    private int[] arr= new int[20];
    int i;
    public void Lab5(){
        int c;
        for(i=0;i<arr.length;i++){
            c=0;
            arr[i]= (int)(Math.random()*90)+10;
                for(int j=0;j<i;j++){
                    if(arr[i]==arr[j])
                        c=1;
                }
            if(c==0)
                System.out.print(arr[i]+ " ");
        }
    }
}
