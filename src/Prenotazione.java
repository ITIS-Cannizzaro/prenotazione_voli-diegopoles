
import java.util.*;

public class Prenotazione {
    private Volo volo;
    public Prenotazione(Volo volo) {
        this.volo = volo;
    }

    public double calcolaCosto(boolean Primaclasse, int NumeroPosti){

        double costo=0;

        if(Primaclasse==true && volo.getPostiDisponibili()>=NumeroPosti){
            costo=volo.getCostoPrimaClasse();
        }
        else if(Primaclasse==false && volo.getPostiDisponibili()>=NumeroPosti){
            costo=volo.getCostoSecondaClasse();
        }
        else{
            System.out.println("Posti non disponibili");
        }
        return costo;
    }
}

