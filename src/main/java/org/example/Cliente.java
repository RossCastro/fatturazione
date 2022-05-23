package org.example;

public class Cliente {
    private String nome;
    private String cognome;
    private String Piva;
    private String indirizzo;


    public Cliente(String nome, String cognome, String piva, String indirizzo) {
        this.nome = nome;
        this.cognome = cognome;
        Piva = piva;
        this.indirizzo = indirizzo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getPiva() {
        return Piva;
    }

    public void setPiva(String piva) {
        Piva = piva;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }
}
