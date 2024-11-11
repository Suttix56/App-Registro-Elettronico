package Utenti;

import java.util.Date;

public class Persona {
    private String nome;
    private String congome;

    private Date dataDiNascita;

    private String CF;

    //ToDo -> mettere le credenziali.


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
}
