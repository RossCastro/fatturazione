package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        Cliente c = new Cliente("Riccardo", "Verderio", "jxsin878nc9", "Via dalle palle 666");
        Prodotto p1 = new Prodotto("Penne BIC", 4, 0.22);
        Prodotto p2 = new Prodotto("Spazzolino", 2, 0.22);
        Prodotto p3 = new Prodotto("Caviale", 34, 0.22);
        RigaFattura r1 = new RigaFattura(p1, 4);
        RigaFattura r2 = new RigaFattura(p2, 10);
        RigaFattura r3 = new RigaFattura(p3, 3);
        List<RigaFattura> righe = new ArrayList<>();
        righe.add(r1);
        righe.add(r2);
        righe.add(r3);
        Fattura f=new Fattura(1, LocalDate.now(), c, righe);
        /*double totIva = 0;
        double totNoIva = 0;
        System.out.println("                                   Numero fattura: "+f.getNumero()+"\n                                   Data: "+f.getData()+
                "\n"+f.getCliente().getCognome()+" "+f.getCliente().getNome()+"\n"+f.getCliente().getIndirizzo()+"\nPartita IVA: "+f.getCliente().getPiva());
        for(int i=0;i<righe.size();i++) {
            double importo=f.getRigheFattura().get(i).getQnt()*f.getRigheFattura().get(i).getP().getPrezzo();
            System.out.println("Prodotto: "+f.getRigheFattura().get(i).getP().getNome()+
                    "\tQuantità: "+f.getRigheFattura().get(i).getQnt()+
                    "\tPrezzo: "+f.getRigheFattura().get(i).getP().getPrezzo()+
                    "\tImporto: "+importo);
            totNoIva=totNoIva+importo;
        }
        totIva=(totNoIva*0.22)+totNoIva;*/
        System.out.println(f.totale());
    }
}
