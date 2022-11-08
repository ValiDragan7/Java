import javax.swing.JOptionPane;

public class AgendaTelefonica {
    private Abonat abonati[];
    private int nrCurent;
    public AgendaTelefonica(int n){
        abonati= new Abonat[n];
    }

    public void adaugareaAbonat(){
        String s= JOptionPane.showInputDialog("Introduceti datele abonatului");
        String[] t= s.split(" ");
        if(t.length==2){
            abonati[nrCurent++]= new Abonat(t[0],t[1]);
        }
        else if(t.length==5){
            abonati[nrCurent++]= new Abonat(t[3], t[2], t[4], t[0], t[1]);
        }
        else
            JOptionPane.showMessageDialog(null,"Eroare","Eroare", JOptionPane.WARNING_MESSAGE);
        return;
    }

    public void stergeAbonat(){
        String s = JOptionPane.showInputDialog("Cod: ");
        int n = Integer.parseInt(s);
        Abonat[] inter=new Abonat[abonati.length-1];
        for(int i=0;i<nrCurent;i++){
            if(abonati[i].getIndex() == n){
                System.arraycopy(abonati, 0, inter, 0, i);
                System.arraycopy(abonati, i+1, inter, i,nrCurent-i-1);
                abonati = inter;
                JOptionPane.showMessageDialog(null, "Abonatul a fost sters");
                nrCurent--;
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Nu exista");

    }
}
