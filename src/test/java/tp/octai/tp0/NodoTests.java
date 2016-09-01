package tp.octai.tp0;

import org.junit.Test;

import static org.junit.Assert.*;

public class NodoTests {
    @Test(expected = ExceptionColaVacia.class)
    public void testNodoVacioNoMeDejaIrAlSiguiente() throws ExceptionColaVacia {
        NodoNull unNodo = new NodoNull();
        unNodo.getSiguienteNodo();
    }

    @Test(expected = ExceptionColaVacia.class)
    public void testNodoVacioNoMeDejaVerDato() throws ExceptionColaVacia {
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
    public void testNodoComunSeteaBienNodoSiguiente() throws ExceptionColaVacia {
        Nodo<Integer> unNodo = new Nodo<>(1);
        Nodo<Integer> otroNodo = new Nodo<>(5);
        unNodo.setSiguienteNodo(otroNodo);
        assertTrue(unNodo.getSiguienteNodo().getDatoNodo() == 5);
    }
}
