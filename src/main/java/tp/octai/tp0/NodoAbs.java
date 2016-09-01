package tp.octai.tp0;


abstract class NodoAbs<T> {
    public abstract T getDatoNodo() throws ExceptionColaVacia;

    public abstract NodoAbs<T> getSiguienteNodo() throws ExceptionColaVacia;

    public abstract int recorrerNodo();

    public abstract NodoAbs<T> setSiguienteNodo(NodoAbs<T> unNodo);

    public abstract int esNodoComun();
}
