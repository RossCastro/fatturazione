package org.example;

import junit.framework.TestCase;

public class ProdottoTest extends TestCase {

    public void testGetNome() {
        Prodotto c = new Prodotto("Mouse", 20, 0.22);
        assertTrue(c.getNome()=="Mouse");
        assertFalse(c.getNome()!="Mouse");
    }

    public void testSetNome() {
    }

    public void testGetPrezzo() {
    }

    public void testSetPrezzo() {
    }

    public void testGetIva() {
    }

    public void testSetIva() {
    }
}