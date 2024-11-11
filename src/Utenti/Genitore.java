package Utenti;

import java.util.Date;

public class Genitore extends Persona{
    private Studente figlio;

    public Genitore(String nome, String congome, Date dataDiNascita, String CF) {
        super(nome, congome, dataDiNascita, CF);
    }

    public Studente getFiglio() {
        return figlio;
    }
}
