
import java.util.*;

public abstract class Persona {
    String Nome;
    String Cognome;
    public Persona(String nome, String cognome) {
        Nome = nome;
        Cognome = cognome;
    }
    public abstract String datiUtente();
}