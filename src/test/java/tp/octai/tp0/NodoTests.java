package tp.octai.tp0;

import org.junit.Test;

import static org.junit.Assert.*;

public class NodoTests {
    @Test(expected = AssertionError.class)
    public void testNodoVacioNoMeDejaIrAlSiguiente() {
        NodoNull unNodo = new NodoNull();
        unNodo.getSiguienteNodo();
    }

    @Test(expected = AssertionError.class)
    public void testNodoVacioNoMeDejaVerDato() {
        NodoNull unNodo = new NodoNull();
        unNodo.getDatoNodo();
    }

    @Test
    public void testNodoComun() {
        Nodo<Integer> unNodo = new Nodo<>(1);
        assertTrue(unNodo.getDatoNodo() == 1);
    }

    @Test
    public void testNodoComunDevuelveUnoCuandoRecorre() {
        Nodo<Integer> unNodo = new Nodo<>(1);
        assertTrue(unNodo.recorrerNodo() == 1);
    }

    @Test
    public void testNodoComunSeteaBienNodoSiguiente() {
        Nodo<Integer> unNodo = new Nodo<>(1);
        unNodo.setSiguienteNodo(5);
        assertTrue(unNodo.getSiguienteNodo().getDatoNodo() == 5);
    }
}
