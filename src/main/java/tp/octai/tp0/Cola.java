package tp.octai.tp0;


class Cola<T> implements Queue<T> {
    private NodoAbs<T> primerNodo;

    Cola() {

        primerNodo = new NodoNull<>();
    }

    public int size()  {
        return primerNodo.recorrerNodo();
    }

    public T top() {
        return primerNodo.getDatoNodo();
    }

    public void remove()  {
        primerNodo = primerNodo.getSiguienteNodo();
    }

    public void add(T item) {
        primerNodo = primerNodo.setSiguienteNodo( item);
    }


    public boolean isEmpty() {
        return (primerNodo.esNodoComun() == 0);
    }

}
