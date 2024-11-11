package Utenti;
import Altro.*;

import java.util.ArrayList;
import java.util.Date;

public class Studente extends Persona{
    private ArrayList<Voto> voti;
    private ArrayList<String> note;
    private ArrayList<Assenza> assenze;

    private Classe classe;

    public Studente(String nome, String congome, Date dataDiNascita, String CF) {
        super(nome, congome, dataDiNascita, CF);
    }

    public ArrayList<Voto> getVoti() {
        return voti;
    }

    public ArrayList<String> getNote() {
        return note;
    }

    public ArrayList<Assenza> getAssenze() {
        return assenze;
    }

    public Classe getClasse() {
        return classe;
    }
}
