package tp.octai.tp0;


class Cola<T> implements Queue<T> {
    private NodoAbs<T> primerNodo;

    Cola() {

        primerNodo = new NodoNull();
    }

    public int size()  {
        return primerNodo.recorrerNodo();
    }

    public T top() throws ExceptionColaVacia {
        return primerNodo.getDatoNodo();
    }

    public void remove() throws ExceptionColaVacia {
        primerNodo = primerNodo.getSiguienteNodo();
    }

    public void add(T item) {
        primerNodo = primerNodo.setSiguienteNodo(new Nodo<>(item));
    }


    public boolean isEmpty() {
        return (primerNodo.esNodoComun() == 0);
    }

}
