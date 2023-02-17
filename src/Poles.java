import java.util.Scanner;


public class Poles{
	public static void main(String[]args){

        //Creazione voli per Caracas, Bali e San Francisco
        Volo Caracas= new Volo("Milano", "Caracas", "10:25", "22:30", 300, 200, 200);
        Volo Bali= new Volo("Milano", "Bali", "11:25", "23:30", 450, 300, 300);
        Volo SanFrancisco= new Volo("Milano", "San Francisco", "17:25", "01:45", 3000, 2500, 400);

        //Creazione agente viaggi
        Agente Viaggi=new Agente("Alessandro", "Venezia");

        //Creazione clienti
        Cliente GB=new Cliente("Giorgio", "Bianchi", "10:25", "22:30", 1);
        Cliente MS=new Cliente("Mario", "Rossi", "17:25", "01:45", 1);
        Cliente SC=new Cliente("Simone", "Colombo", "11:25", "23:30", 1);


        //Aggiunta dei voli disponibili
        Viaggi.addVolo(Caracas);
        Viaggi.addVolo(Bali);
        Viaggi.addVolo(SanFrancisco);

        //Prenotazione dei viaggi
        Viaggi.prenotazione(GB);
        Viaggi.prenotazione(MS);
        Viaggi.prenotazione(SC);

        //Calcolo spesa massima - minima - media
        Viaggi.prenotazioneConSpesaMassima();
        Viaggi.prenotazioneConSpesaMinima();
        Viaggi.spesaMediaDellePrenotazioni();

    }
}
