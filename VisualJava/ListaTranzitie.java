import java.util.*;

public class ListaTranzitie {
    private ArrayList <Tranzitie> list = new ArrayList <Tranzitie>();
    
    void adaugaTranzitie(Tranzitie tr){
        this.list.add(tr);
    }
    Tranzitie gasesteTranzitie(String stare, char simbol){
        for(int i = 0;i<this.list.size();i++){
            Tranzitie tr = this.list.get(i);
            if(tr.SpuneInceput().equals(stare) && tr.SpuneSimbol()==simbol)
                return tr;
        }
            return null;
    }
    public boolean determinist(){
        for(int i=0;i<this.list.size();i++){
            int j=1;
            Tranzitie tr= this.list.get(i);
            for(int k=i+1;k<this.list.size();k++){
                if(tr.SpuneInceput().equals(this.list.get(k).SpuneInceput()) && tr.SpuneSimbol()== this.list.get(k).SpuneSimbol()){
                    j++;
                }
            }
            if(j>1)
                return false;
        }
        return true;
   }
}
