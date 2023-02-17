
import java.util.*;

public class Volo {
    private String Partenza;
    private String Destinazione;
    private double CostoPrimaClasse;
    private double CostoSecondaClasse;
    private int PostiDisponibili;

    public Volo(String partenza, String destinazione, double costoPrimaClasse, double costoSecondaClasse, int postiDisponibili) {
        Partenza = partenza;
        Destinazione = destinazione;
        CostoPrimaClasse = costoPrimaClasse;
        CostoSecondaClasse = costoSecondaClasse;
        PostiDisponibili = postiDisponibili;
    }

    public String getPartenza() {
        return Partenza;
    }

    public String getDestinazione() {
        return Destinazione;
    }

    public double getCostoPrimaClasse() {
        return CostoPrimaClasse;
    }

    public double getCostoSecondaClasse() {
        return CostoSecondaClasse;
    }

    public int getPostiDisponibili() {
        return PostiDisponibili;
    }

    public void DecrementaPostiDisponibili(int NumeroPosti) {
        PostiDisponibili=PostiDisponibili-NumeroPosti;
    }
}
