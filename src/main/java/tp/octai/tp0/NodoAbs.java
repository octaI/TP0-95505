package tp.octai.tp0;


interface NodoAbs {
    Object getDatoNodo();

    NodoAbs getSiguienteNodo();

    int recorrerNodo();

    NodoAbs setSiguienteNodo(NodoAbs unNodo);

    int esNodoComun();
}
