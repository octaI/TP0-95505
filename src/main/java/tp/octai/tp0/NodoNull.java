package tp.octai.tp0;


class NodoNull<T> implements NodoAbs<T> {


    @Override
    public T getDatoNodo()   {
        throw new AssertionError();
    }

    @Override
    public int esNodoComun() {
        return 0;
    }

    @Override
    public NodoAbs<T> getSiguienteNodo()   {
        throw new AssertionError();
    }

    @Override
    public int recorrerNodo() {
        return 0;
    }

    @Override
    public NodoAbs<T> setSiguienteNodo(T unDato) {
        return new Nodo<>(unDato);
    }





}
