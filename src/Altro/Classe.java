package Altro;

import Utenti.Studente;

import java.util.ArrayList;

public class Classe {
    private int anno;
    private String indirizzo;
    private char sezione;

    private ArrayList<Studente> studneti;

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

    public ArrayList<Studente> getStudneti() {
        return studneti;
    }
}
