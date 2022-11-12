import javax.swing.JOptionPane;

public class Problema1 {
    
    public int[] liniaA= new int[99];
    public int c1=0;
    public int[] liniaB= new int[99];
    public int c2=0;
    public int[] liniaC= new int[99];
    public int c3=0;

    void merge(int Ar[],int st,int mid, int dr){
        int i,j,k;
        int n1= mid-st+1;
        int n2= dr- mid;
        // crea 2 vectori secundari
        int St[]= new int[n1]; 
        int Dr[]= new int[n2];
        // le dam valori vectorilor secundari din vectorul principal
        for(i=0;i<n1;i++){
            St[i]= Ar[st+i];
        }
        for(j= 0; j<n2;j++){
            Dr[j]= Ar[mid+1+j];
        }
    
        i=0;
        j=0;
        k=st;
        // merge intre cei 2 vectori
        while(i< n1 && j< n2){
            if(St[i]< Dr[j]){
                Ar[k]=St[i];
                i++;
            }
            else{
                Ar[k]= Dr[j];
                j++;
            }
            k++;
        }
        // restul membrilor din St sau Dr
        while(i < n1){
            Ar[k]= St[i];
            i++;
            k++;
        }
        while(j<n2){
            Ar[k]= Dr[j];
            j++;
            k++;
        }
    }
    void mergeSort(int Ar[], int s, int d){

        if(s<d){
    
            int mid = s+(d-s)/2;
    
            mergeSort(Ar,s,mid);
            mergeSort(Ar,mid+1,d);
    
            merge(Ar,s,mid,d);
        }
    }
    public void PrintAr(int Ar[], int lung){
        for(int i=0;i<lung;i++){
            if(i!=lung-1){
                System.out.print(Ar[i]+",");
            }
            else
                System.out.print(Ar[i]);
        }
    }
    void Coliniar(int A[],int D[], int C[],int lungA, int lungB, int lungC){
        int i,j,k,l,E[]= new int[lungC];
        for(i=0;i<lungA;i++){
            for(j=0;j<lungC;j++){
                E[j]= A[i]+C[j];
                }
                l=0;k=0;
                while(l< lungC && k < lungB)
                {
                    if(D[k]== E[l]){
                        String s =String.valueOf(A[i]) + "," + D[k]/2 + "," + String.valueOf(E[l]-A[i]);
                        JOptionPane.showMessageDialog(null,s +" sunt coliniare\n");
                        k++;
                        }
                    if(D[k]< E[l])
                        k++;
                    if(D[k]>E[l])
                        l++;
                }
        }
    
    }
}
