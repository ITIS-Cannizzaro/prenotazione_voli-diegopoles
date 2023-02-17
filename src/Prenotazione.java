
import java.util.*;

public class Prenotazione {
	 Volo volo;
	    int NumeroPosti;
	    double Prezzo;
	    String Nome;
	    String Cognome;

	    public Prenotazione(Volo volo, int numeroPosti, double prezzo, String nome, String cognome) {
	        this.volo = volo;
	        NumeroPosti = numeroPosti;
	        Prezzo = prezzo;
	        Nome = nome;
	        Cognome = cognome;
	    }

	    public String ToString() {
	        return "Luogo Partenza = " + volo.Partenza + '\n' +
	                "Luogo Destinazione = " + volo.Destinazione + '\n' +
	                "Numero Posti = " + NumeroPosti + '\n' +
	                "Costo = " + Prezzo + '\n' +
	                "Nome = " + Nome+ '\n' +
	                "Cognome = " + Cognome;
	    }
}

