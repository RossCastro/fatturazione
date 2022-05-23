package org.example;

import junit.framework.TestCase;

public class ClienteTest extends TestCase {

    public void testGetNome() {
       Cliente a = new Cliente("Gabriele", "Zulini", "jyjkhgt7665r", "San Donato 10");
       assertTrue(a.getNome()=="Gabriele");
       assertFalse(a.getNome()!="Gabriele");
    }

    public void testSetNome() {
    }

    public void testGetCognome() {
    }

    public void testSetCognome() {
    }

    public void testGetPiva() {
    }

    public void testSetPiva() {
    }

    public void testGetIndirizzo() {
    }

    public void testSetIndirizzo() {
    }


}