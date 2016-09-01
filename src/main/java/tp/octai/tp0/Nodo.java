package tp.octai.tp0;


class Nodo<T> implements NodoAbs<T> {
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
    public NodoAbs<T> setSiguienteNodo(T datoNuevo) {
        siguienteNodo = siguienteNodo.setSiguienteNodo(datoNuevo);
        return this;
    }

    @Override
    public int esNodoComun() {
        return 1;
    }
}
