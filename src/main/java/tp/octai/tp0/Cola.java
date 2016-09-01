package tp.octai.tp0;


class Cola<T> implements Queue<T> {
    private NodoAbs primerNodo;

    Cola() {

        primerNodo = new NodoNull();
    }

    public int size()  {
        return primerNodo.recorrerNodo();
    }

    public T top() {
        return (T) primerNodo.getDatoNodo();
    }

    public void remove()  {
        primerNodo = primerNodo.getSiguienteNodo();
    }

    public void add(T item) {
        primerNodo = primerNodo.setSiguienteNodo( new Nodo<>(item));
    }


    public boolean isEmpty() {
        return (primerNodo.esNodoComun() == 0);
    }

}
