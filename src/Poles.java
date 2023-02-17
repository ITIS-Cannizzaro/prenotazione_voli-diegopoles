import java.util.Scanner;

// Chiamare la classe col proprio cognome
public class Poles{
	public static void main(String[] args){
		Volo v1=new Volo("Milano", "Napoli", 4000, 2500, 300);
        Prenotazione p1=new Prenotazione(v1);
        System.out.println(p1.calcolaCosto(true, 10));
        v1.DecrementaPostiDisponibili(10);
        System.out.println(v1.getPostiDisponibili());
	}
}
