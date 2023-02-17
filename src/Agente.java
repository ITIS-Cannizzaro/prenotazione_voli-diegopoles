
import java.util.*;

public class Agente extends Persona{
	ArrayList <Volo> ListaVoli;
    ArrayList <Prenotazione> Prenotazioni;
    public Agente(String nome, String cognome) {
        super(nome, cognome);
        ListaVoli=new ArrayList <Volo>();
        Prenotazioni=new ArrayList <Prenotazione>();
    }

    public void stampaStorico(){
        for(int i=0; i<ListaVoli.size(); i++) {
            System.out.println(ListaVoli.get(i).ToString());
            System.out.println(" ");
        }
    }

    public void addVolo(Volo volo) {
        ListaVoli.add(volo);
    }

    public void prenotazione(Cliente cliente){
        double Prezzo=0;
        int opzionenull=0;
        for(int i=0; i<ListaVoli.size(); i++) {
            if (cliente.OrarioPartenza.equals(ListaVoli.get(i).OrarioPartenza) && cliente.OrarioArrivo.equals(ListaVoli.get(i).OrarioArrivo)) {
                opzionenull++;
                System.out.println(" ");
                System.out.println("Nome e cognome della prenotazione: "+cliente.datiUtente());
                System.out.println("Volo: "+cliente.OrarioPartenza + " - " + cliente.OrarioArrivo);
                if (cliente.PrenotazionePosti <= ListaVoli.get(i).PostiDisponibili) {
                    System.out.println("Scegli tra prima classe e seconda classe: ");
                    Scanner in = new Scanner(System.in);
                    String risposta = in.nextLine();
                    if (risposta.toLowerCase().equals("prima classe")) {
                        Prezzo = cliente.PrenotazionePosti * ListaVoli.get(i).CostoPrimaClasse;
                        System.out.println("Grazie per aver prenotato il posto in prima classe!");
                        ListaVoli.get(i).PostiDisponibili -= cliente.PrenotazionePosti;
                        Prenotazione prenotazione = new Prenotazione(ListaVoli.get(i), cliente.PrenotazionePosti, Prezzo, cliente.Nome, cliente.Cognome);
                        Prenotazioni.add(prenotazione);
                    }
                    else if (risposta.toLowerCase().equals("seconda classe")) {
                        Prezzo = cliente.PrenotazionePosti * ListaVoli.get(i).CostoSecondaClasse;
                        System.out.println("Grazie per aver prenotato il posto in seconda classe!");
                        ListaVoli.get(i).PostiDisponibili -= cliente.PrenotazionePosti;
                        Prenotazione prenotazione = new Prenotazione(ListaVoli.get(i), cliente.PrenotazionePosti, Prezzo, cliente.Nome, cliente.Cognome);
                        Prenotazioni.add(prenotazione);
                    }
                    Prezzo = 0;
                    break;
                }
                else
                    System.out.println("Al momento non sono disponibili posti sul volo scelto");
            }
        }
        if(opzionenull==0) {
            System.out.println("Non ho le soluzioni di viaggio");
        }
    }

    public String datiUtente(){
        return Nome+" "+Cognome;
    }

    public void prenotazioneConSpesaMassima() {
        int Posizione=0;
        double ValoreMax=0;
        boolean Controllo=Prenotazioni.isEmpty();
        if(Controllo==false) {
            for(int i=0; i<Prenotazioni.size(); i++) {
                if(Prenotazioni.get(i).Prezzo > ValoreMax) {
                    ValoreMax=Prenotazioni.get(i).Prezzo;
                    Posizione=i;
                }
            }
            System.out.println(" ");
            System.out.println("La prenotazione la spesa maggiore è: " + "\n" + Prenotazioni.get(Posizione).ToString());
        }
    }

    public void prenotazioneConSpesaMinima() {
        int Posizione=0;
        double ValoreMin=10000;
        boolean Controllo=Prenotazioni.isEmpty();
        if(Controllo==false) {
            for(int i=0; i<Prenotazioni.size(); i++) {
                if(Prenotazioni.get(i).Prezzo < ValoreMin) {
                    ValoreMin=Prenotazioni.get(i).Prezzo;
                    Posizione=i;
                }
            }
            System.out.println(" ");
            System.out.println("La prenotazione con la spesa minore è: "+ "\n" +Prenotazioni.get(Posizione).ToString());
        }
    }

    public void spesaMediaDellePrenotazioni() {
        ArrayList <Prenotazione> Lista=Prenotazioni;
        double somma=0;
        double media=0;
        int cont=0;
        for(int i=0; i<Lista.size(); i=0) {
            cont=1;
            somma+=Lista.get(i).Prezzo;
            for(int j=1; j<Lista.size(); j++) {
                if(Lista.get(i).volo.equals(Lista.get(j).volo)) {
                    cont ++;
                }
            }
            for(int k=1; k<Lista.size(); k++) {
                if(Lista.get(i).volo.equals(Lista.get(k).volo)) {
                    somma=somma+Lista.get(k).Prezzo;
                }
            }

            media=somma/cont;
            System.out.println(" ");
            System.out.println("Il costo medio per il seguente volo: " + "\n" + Lista.get(i).volo.Partenza + ": " + Lista.get(i).volo.OrarioPartenza + "\n" + Lista.get(i).volo.Destinazione + ": " + Lista.get(i).volo.OrarioArrivo + "\n" + "è: " + media);
            somma=0;
            cont=0;
            for(int y=1; y<Lista.size(); y++) {
                if(Lista.get(i).volo.equals(Lista.get(y).volo)) {
                    Lista.remove(y);
                }
            }
            Lista.remove(i);
        }
    }

    public void stampaPrenotazioni(){
        for(int i=0; i<Prenotazioni.size(); i++) {
            System.out.println(Prenotazioni.get(i).ToString());
        }
    }
}
