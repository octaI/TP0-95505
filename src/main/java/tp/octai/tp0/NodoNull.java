package tp.octai.tp0;


class NodoNull implements NodoAbs {


    @Override
    public Object getDatoNodo()   {
        throw new AssertionError();
    }

    @Override
    public int esNodoComun() {
        return 0;
    }

    @Override
    public NodoAbs getSiguienteNodo()   {
        throw new AssertionError();
    }

    @Override
    public int recorrerNodo() {
        return 0;
    }

    @Override
    public NodoAbs setSiguienteNodo(NodoAbs unNodo) {
        return unNodo;
    }





}
