package Automatfinit;
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
}

