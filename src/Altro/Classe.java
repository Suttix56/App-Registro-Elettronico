package Altro;

import Utenti.Studente;
import java.util.ArrayList;

public class Classe {
    private final int anno;
    private final String indirizzo;
    private final char sezione;

    private ArrayList<Studente> studenti;

    public Classe(int anno, String indirizzo, char sezione) {
        this.anno = anno;
        this.indirizzo = indirizzo;
        this.sezione = sezione;
    }

    public int getAnno() {
        return anno;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public char getSezione() {
        return sezione;
    }

    public ArrayList<Studente> getStudenti() {
        return studenti;
    }
}
