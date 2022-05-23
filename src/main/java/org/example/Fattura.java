package org.example;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Fattura {
    private int numero;
    private LocalDate data;
    private Cliente cliente;
    private List<RigaFattura> righeFattura=new ArrayList<>();

    public Fattura(int numero, LocalDate data, Cliente cliente, List<RigaFattura> righeFattura) {
        this.numero = numero;
        this.data = data;
        this.cliente = cliente;
        this.righeFattura = righeFattura;
    }
    public double totale(){
        double imponibile=0;
        for(RigaFattura row:righeFattura){
            imponibile+= row.getP().getPrezzo() * row.getQnt();
        }
        return imponibile;
    }
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<RigaFattura> getRigheFattura() {
        return righeFattura;
    }

    public void setRigheFattura(List<RigaFattura> righeFattura) {
        this.righeFattura = righeFattura;
    }
}
