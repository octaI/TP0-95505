package tp.octai.tp0;


class Nodo<T> extends NodoAbs<T> {
    private T datoNodo;
    private NodoAbs<T> siguienteNodo = new NodoNull<>();

    Nodo(T dato) {

        datoNodo = dato;
    }

    @Override
    public T getDatoNodo() {
        return datoNodo;
    }

    @Override
    public NodoAbs<T> getSiguienteNodo() {
        return siguienteNodo;
    }

    @Override
    public int recorrerNodo() {
        return 1 + siguienteNodo.recorrerNodo();
    }

    @Override
    public NodoAbs<T> setSiguienteNodo(NodoAbs unNodo) {
        siguienteNodo = siguienteNodo.setSiguienteNodo(unNodo);
        return this;
    }

    @Override
    public int esNodoComun() {
        return 1;
    }
}
