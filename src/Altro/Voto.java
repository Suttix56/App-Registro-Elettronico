package Altro;

import Utenti.Docente;

public class Voto {
    private double voto;
    private String materia;
    private Docente docente;

    public Voto(double voto, String materia, Docente docente) {
        this.voto = voto;
        this.materia = materia;
        this.docente = docente;
    }

    public double getVoto() {
        return voto;
    }

    public String getMateria() {
        return materia;
    }

    public Docente getDocente() {
        return docente;
    }
}
