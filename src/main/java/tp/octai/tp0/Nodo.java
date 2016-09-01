package tp.octai.tp0;


class Nodo<T> implements NodoAbs {
    private T datoNodo;

    private NodoAbs siguienteNodo = new NodoNull();

    Nodo(T dato) {

        datoNodo = dato;
    }

    @Override
    public Object getDatoNodo() {
        return datoNodo;
    }

    @Override
    public NodoAbs getSiguienteNodo() {
        return siguienteNodo;
    }

    @Override
    public int recorrerNodo() {
        return 1 + siguienteNodo.recorrerNodo();
    }

    @Override
    public NodoAbs setSiguienteNodo(NodoAbs unNodo) {
        siguienteNodo = siguienteNodo.setSiguienteNodo(unNodo);
        return this;
    }

    @Override
    public int esNodoComun() {
        return 1;
    }
}
