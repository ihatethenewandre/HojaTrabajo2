/**
 * Interfaz ICalculadora que define los métodos que una calculadora debe tener.
 */
public interface ICalculadora {
    public void suma(CustomStack<Float> stack);
    public void resta(CustomStack<Float> stack);
    public void producto(CustomStack<Float> stack);
    public void division(CustomStack<Float> stack);

    public void addNumber(CustomStack<Float> stack, int n);
    public boolean isNumber(String s);
}