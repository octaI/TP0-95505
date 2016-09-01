package tp.octai.tp0;


interface NodoAbs<T> {
    T getDatoNodo();

    NodoAbs<T> getSiguienteNodo();

    int recorrerNodo();

    NodoAbs<T> setSiguienteNodo(T datoNuevo);

    int esNodoComun();
}
