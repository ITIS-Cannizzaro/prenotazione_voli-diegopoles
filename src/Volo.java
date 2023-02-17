
import java.util.*;

public class Volo {
	 String Partenza;
	    String OrarioPartenza;
	    String Destinazione;
	    String OrarioArrivo;
	    int CostoPrimaClasse;
	    int CostoSecondaClasse;
	    int PostiDisponibili;
	    public Volo(String partenza, String destinazione, String orarioPartenza, String orarioArrivo, int costoPrimaClasse, int costoSecondaClasse, int postiDisponibili) {
	        Partenza = partenza;
	        Destinazione = destinazione;
	        OrarioPartenza = orarioPartenza;
	        OrarioArrivo = orarioArrivo;
	        CostoPrimaClasse = costoPrimaClasse;
	        CostoSecondaClasse = costoSecondaClasse;
	        PostiDisponibili = postiDisponibili;
	    }

	    public String ToString() {
	        return "Partenza = " + Partenza + '\n' +
	                "Orario Partenza = " + OrarioPartenza + '\n' +
	                "Destinazione = " + Destinazione + '\n' +
	                "Orario Arrivo = " + OrarioArrivo + '\n' +
	                "Costo Prima Classe = " + CostoPrimaClasse + '\n' +
	                "Costo Seconda Classe = " + CostoSecondaClasse + '\n' +
	                "Posti Disponibili = " + PostiDisponibili;
	    }
}
