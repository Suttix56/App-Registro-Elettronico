package Controllore;

import Altro.Classe;
import Utenti.Docente;
import Utenti.Genitore;
import Utenti.Persona;
import Utenti.Studente;

import java.util.ArrayList;
import java.util.Date;

public class Controllore {

    public Studente creaStudente(String nome, String cognome, Date dataDiNascita, String CF, Classe classe) {
        return new Studente(nome, cognome, dataDiNascita, CF, classe);
    }

    public Docente creaDocente(String nome, String cognome, Date dataDiNascita, String CF, ArrayList<Classe> classe, ArrayList<String> materie) {
        return new Docente(nome, cognome, dataDiNascita, CF, classe, materie);
    }

    public Genitore creaGenitore(String nome, String cognome, Date dataDiNascita, String CF, Studente studente) {
        return new Genitore(nome, cognome, dataDiNascita, CF, studente);
    }
    public void registrazione(Persona persona) {
        if(persona instanceof Studente) {

        } else if(persona instanceof Genitore) {

        } else {

        }
    }

    public void login() {
        
    }
}
