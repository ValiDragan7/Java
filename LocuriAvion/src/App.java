import java.util.Arrays;
import javax.swing.JOptionPane;

public class App {
    public static boolean plin(int avion[]){
        for(int i=0;i<avion.length;i++){
            if(avion[i]==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] avion= new int[10];
        int[] fumatori= new int[5];
        fumatori= Arrays.copyOfRange(avion, 0, 5);
        int[] nefumatori=new int[5];
        nefumatori=Arrays.copyOfRange(avion, 6, 10);
        while(plin(avion) == false){
            int num=Integer.parseInt(JOptionPane.showInputDialog("1.Fumatori 2.Nefumatori"));
            if(num==1){
                if(plin(fumatori)==true){
                    int rasp = Integer.parseInt(JOptionPane.showInputDialog("Doriti scaun in zona de nefumatori?(1.Da 2.Nu"));
                    if(rasp == 2)
                        System.out.println("Urmatorul zbor este in 3 ore!");
                    else{
                        for(int i=6;i<avion.length;i++)
                        if(avion[i]== 0){
                            avion[i]=1;
                            break;
                        }
                    }
                }
                else{
                    for(int i=0;i<6;i++)
                        if(avion[i]== 0){
                            avion[i]=1;
                            break;
                        }
            
                }
            }
            else{
                if(plin(nefumatori)==true){
                        int rasp = Integer.parseInt(JOptionPane.showInputDialog("Doriti scaun in zona de fumatori?(1.Da 2.Nu"));
                        if(rasp == 2)
                            System.out.println("Urmatorul zbor este in 3 ore!");
                        else{
                            for(int i=0;i<6;i++)
                                if(avion[i]== 0){
                                    avion[i]=1;
                                    break;
                            }
                        }
                    }
                else{
                    for(int i=6;i<avion.length;i++)
                        if(avion[i]== 0){
                            avion[i]=1;
                            break;
                        }
            
                }
            }
        }
        System.out.println("Urmatorul zbor este in 3 ore!");
    }
}
