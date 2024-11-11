package Utenti;
import Altro.*;

import java.util.ArrayList;
import java.util.Date;

public class Docente extends Persona{

    private ArrayList<Classe> classi;
    private ArrayList<String> materie;

    public Docente(String nome, String congome, Date dataDiNascita, String CF) {
        super(nome, congome, dataDiNascita, CF);
    }

    public ArrayList<Classe> getClassi() {
        return classi;
    }

    public ArrayList<String> getMaterie() {
        return materie;
    }
}
