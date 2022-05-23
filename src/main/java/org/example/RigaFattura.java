package org.example;

public class RigaFattura {
    private Prodotto p;
    private int qnt;

    public RigaFattura(Prodotto p, int qnt) {
        this.p = p;
        this.qnt = qnt;
    }




    public int getQnt() {
        return qnt;
    }

    public void setQut(int qnt) {
        this.qnt = qnt;
    }

    public Prodotto getP() {
        return p;
    }

    public void setP(Prodotto p) {
        this.p = p;
    }
}
