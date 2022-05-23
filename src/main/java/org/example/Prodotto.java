package org.example;

public class Prodotto {
    private String nome;
    private double prezzo;
    private double iva;

    public Prodotto(String nome, double prezzo, double iva) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }
}

