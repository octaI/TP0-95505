package tp.octai.tp0;


class NodoNull<T> extends NodoAbs {


    @Override
    public Object getDatoNodo() throws ExceptionColaVacia {
        throw new ExceptionColaVacia();
    }

    @Override
    public int esNodoComun() {
        return 0;
    }

    @Override
    public NodoAbs getSiguienteNodo() throws ExceptionColaVacia {
        throw new ExceptionColaVacia();
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
