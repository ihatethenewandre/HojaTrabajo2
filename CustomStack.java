/**
 * Clase CustomStack que representa una pila personalizada.
 * @param <T> El tipo de valores que la pila puede contener.
 */
public class CustomStack<T> {
    private Node<T> firstNode; // El primer nodo que se agregó a la pila.

    /**
     * Agrega un valor a la pila.
     * @param value El valor que se debe agregar a la pila.
     */
    public void push(T value) {
        Node<T> current = new Node<T> (value);
        current.setNext(firstNode);
        firstNode = current;
    }

    /**
     * Quita y devuelve el último valor agregado a la pila.
     * @return El último valor agregado a la pila, o null si la pila está vacía.
     */
    public T pop() {
        if (firstNode != null) {
            T value = firstNode.getValue();
            firstNode = firstNode.getNext();
            return value;
        }
        return null;
    }

    /**
     * Obtiene el número de elementos en la pila.
     * @return El número de elementos en la pila.
     */
    public int size() {
        int count = 0;
        Node<T> current = firstNode;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }
}