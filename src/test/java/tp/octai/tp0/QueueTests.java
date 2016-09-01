package tp.octai.tp0;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTests {

    @Test
    public void testColaVacia() {
        Cola<Integer> unaCola = new Cola<>();
        assertEquals(unaCola.size(), 0);
        assertEquals(unaCola.isEmpty(), true);
    }

    @Test(expected = AssertionError.class)
    public void testVerTopColaVaciaTiraException() {
        Cola<Integer> unaCola = new Cola<>();
        unaCola.top();
    }

    @Test(expected = AssertionError.class)
    public void testRemoveColaVaciaTiraException() {
        Cola<Integer> unaCola = new Cola<>();
        unaCola.remove();
    }

    @Test
    public void testColaSizeUnElementoNoEmpty() {
        Cola<Integer> unaCola = new Cola<>();
        unaCola.add(1);
        assertEquals(unaCola.isEmpty(), false);
    }

    @Test
    public void testColaSizeVariosElementosNoEmpty() {
        Cola<Integer> unaCola = new Cola<>();
        unaCola.add(1);
        unaCola.add(3);
        unaCola.add(50);
        assertEquals(unaCola.isEmpty(), false);
    }

    @Test
    public void testColaSizeEsCorrecto() {
        Cola<Integer> unaCola = new Cola<>();
        unaCola.add(1);
        unaCola.add(2);
        unaCola.add(1);
        unaCola.add(50);
        assertEquals(unaCola.size(), 4);
    }

    @Test
    public void testColaMuestraElTopBien() throws ExceptionColaVacia {
        Cola<Integer> unaCola = new Cola<>();
        unaCola.add(5);
        unaCola.add(3);
        unaCola.add(1);
        assertTrue(unaCola.top() == 5);
    }

    @Test
    public void testColaRemueveBien() throws ExceptionColaVacia {
        Cola<Integer> unaCola = new Cola<>();
        unaCola.add(5);
        unaCola.add(3);
        unaCola.add(10);
        unaCola.remove();
        assertTrue(unaCola.top() == 3);
    }

    @Test
    public void testCargaStressCola() throws ExceptionColaVacia {
        Cola<Integer> unaCola = new Cola<>();
        for (int i = 0; i < 5000; i++) {
            unaCola.add(i);
        }
        assertEquals(unaCola.size(), 5000);
        for (int i = 0; i < 5000; i++) {
            unaCola.remove();
        }
        assertEquals(unaCola.size(), 0);
    }
}
