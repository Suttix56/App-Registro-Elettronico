package Controllore;

import Altro.Classe;
import Utenti.*;

import Credenziali.Credenziali;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Controllore {
    private File fileStudenti;
    private File fileDocenti;
    private File fileGenitori;

    public Controllore(){
        try{
            fileStudenti = new File("studenti.bin");
            fileStudenti.createNewFile();
            fileDocenti = new File("docenti.bin");
            fileDocenti.createNewFile();
            fileGenitori = new File("genitori.bin");
            fileGenitori.createNewFile();
        }catch(IOException ignore){}
    }

    // ---- INIZIO CREAZIONE UTENTI ----//
    public Studente creaStudente(String nome, String cognome, Date dataDiNascita, String CF, Classe classe) {
        return new Studente(nome, cognome, dataDiNascita, CF, classe);
    }

    public Docente creaDocente(String nome, String cognome, Date dataDiNascita, String CF, ArrayList<Classe> classe, ArrayList<String> materie) {
        return new Docente(nome, cognome, dataDiNascita, CF, classe, materie);
    }

    public Genitore creaGenitore(String nome, String cognome, Date dataDiNascita, String CF, Studente studente) {
        return new Genitore(nome, cognome, dataDiNascita, CF, studente);
    }
    // ---- FINE CREAZIONE UTENTI ---- //

    // ---- INIZIO MODIFCA UTENTI ---- //
    public void modificaStudente(Studente studente_temp, Studente studente) {

    }

    public void modificaDocente(Docente docente_temp, Docente docente) {

    }

    public void modificaGenitore(Genitore genitore_temp, Genitore genitore) {

    }
    // ---- FINE MODIFCA UTENTI ---- //
    
    public void login(Credenziali credenziali) {

    }

    //REGISTRAZIONE
    public void registrazione(Persona persona, Credenziali credenziali) {
        if(persona instanceof Studente) {
            Studente s = (Studente) persona;
            s.setCredenziali(credenziali);
        } else if(persona instanceof Genitore) {
            Genitore g = (Genitore) persona;
            g.setCredenziali(credenziali);
        } else {
            Docente d = (Docente) persona;
            d.setCredenziali(credenziali);
        }
        //vanno messi nel file
    }
}