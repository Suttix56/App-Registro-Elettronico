package Utenti;

import Credenziali.Credenziali;

import java.util.Date;

public class Persona {
    private final String nome;
    private final String congome;

    private final Date dataDiNascita;

    private final String CF;

   private Credenziali credenziali;


    public Persona(String nome, String congome, Date dataDiNascita, String CF) {
        this.nome = nome;
        this.congome = congome;
        this.dataDiNascita = dataDiNascita;
        this.CF = CF;
    }

    public String getNome() {
        return nome;
    }

    public String getCongome() {
        return congome;
    }

    public Date getDataDiNascita() {
        return dataDiNascita;
    }

    public String getCF() {
        return CF;
    }

    public Credenziali getCredenziali() {
        return credenziali;
    }

    public void setCredenziali(Credenziali credenziali) {
        this.credenziali = credenziali;
    }


}
