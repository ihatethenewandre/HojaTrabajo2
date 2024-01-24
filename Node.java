/**
 * Clase Node que representa un nodo en una pila.
 * @param <T> El tipo de valor que el nodo puede contener.
 */
public class Node<T> {
    T value; // El valor que contiene este nodo.
    Node<T> next; // El siguiente nodo en la pila.

    /**
     * Constructor para la clase Node.
     * @param val El valor que este nodo debe contener.
     */
    public Node (T val) {
        value = val;
        next = null;
    }

    /**
     * Obtiene el valor que contiene este nodo.
     * @return El valor que contiene este nodo.
     */
    public T getValue() {
        return value;
    }

    /**
     * Obtiene el siguiente nodo en la pila.
     * @return El siguiente nodo en la pila.
     */
    public Node<T> getNext() {
        return next;
    }

    /**
     * Establece el valor que este nodo debe contener.
     * @param newValue El nuevo valor que este nodo debe contener.
     */
    public void setValue(T newValue) {
        value = newValue;
    }

    /**
     * Establece el siguiente nodo en la pila.
     * @param n El nuevo siguiente nodo en la pila.
     */
    public void setNext(Node<T> n) {
        next = n;
    }
}