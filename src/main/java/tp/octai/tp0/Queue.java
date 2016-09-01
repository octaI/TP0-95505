package tp.octai.tp0;


interface Queue<T> {
    boolean isEmpty();

    int size();

    void add(T item);

    T top() throws ExceptionColaVacia;

    void remove() throws ExceptionColaVacia;
}

