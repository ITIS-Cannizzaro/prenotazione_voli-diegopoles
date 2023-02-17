import java.util.*;
public class Cliente extends Persona{
	String OrarioPartenza;
    String OrarioArrivo;
    int PrenotazionePosti;

    public Cliente(String nome, String cognome, String orarioPartenza, String orarioArrivo, int prenotazionePosti) {
        super(nome, cognome);
        OrarioPartenza = orarioPartenza;
        OrarioArrivo = orarioArrivo;
        PrenotazionePosti = prenotazionePosti;
    }

    public String getOrarioPartenza() {
        return OrarioPartenza;
    }

    public void setOrarioPartenza(String orarioPartenza) {
        OrarioPartenza = orarioPartenza;
    }

    public String getOrarioArrivo() {
        return OrarioArrivo;
    }

    public void setOrarioArrivo(String orarioArrivo) {
        OrarioArrivo = orarioArrivo;
    }

    public int getPrenotazionePosti() {
        return PrenotazionePosti;
    }

    public void setPrenotazionePosti(int prenotazionePosti) {
        PrenotazionePosti = prenotazionePosti;
    }

    public String datiUtente() {
        return Nome+" "+Cognome;
    }

    public void DisdettaPrenotazione(Agente agente) {
        for(int i=0; i<agente.Prenotazioni.size(); i++) {
            if(agente.Prenotazioni.get(i).Nome.equals(Nome) && agente.Prenotazioni.get(i).Cognome.equals(Cognome)) {
                System.out.println("Disdetta Prenotazione");
                agente.Prenotazioni.remove(i);
            }
        }
    }
}
