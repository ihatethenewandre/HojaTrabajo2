/**
 * Clase Calculadora que implementa la interfaz ICalculadora.
 */
public class Calculadora implements ICalculadora {

    @Override
    public void suma(CustomStack<Float> stack) {
        float num1 = stack.pop();
        float num2 = stack.pop();

        float resultado = num1 + num2;
        stack.push(resultado);
    }

    @Override
    public void resta(CustomStack<Float> stack) {
        float num1 = stack.pop();
        float num2 = stack.pop();
        
        float resultado = num2 - num1;
        stack.push(resultado);
    }

    @Override
    public void producto(CustomStack<Float> stack) {
        float num1 = stack.pop();
        float num2 = stack.pop();
        
        float resultado = num1 * num2;
        stack.push(resultado);
    }

    @Override
    public void division(CustomStack<Float> stack) {
        float num1 = stack.pop();
        float num2 = stack.pop();
        
        float resultado = num2 / num1;
        stack.push(resultado);
    }

    @Override
    public void addNumber(CustomStack<Float> stack, int n) {
        stack.push((float) n);
    }

    @Override
    public boolean isNumber(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}