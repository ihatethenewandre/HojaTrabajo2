import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Pruebas {

    @Test
    void TestSuma() {
        Calcu calcu = new Calcu();
        CustomStack<Float> stack = new CustomStack<>();
        stack.push(2.0f);
        stack.push(3.0f);

        calcu.suma(stack);

        assertEquals(5.0f, stack.pop());
    }

    @Test
    void TestResta() {
        Calcu calcu = new Calcu();
        CustomStack<Float> stack = new CustomStack<>();
        stack.push(3.0f);
        stack.push(5.0f);

        calcu.resta(stack);

        assertEquals(2.0f, stack.pop());
    }

    @Test
    void TestMultiplicacion() {
        Calcu calcu = new Calcu();
        CustomStack<Float> stack = new CustomStack<>();
        stack.push(2.0f);
        stack.push(3.0f);

        calcu.producto(stack);

        assertEquals(6.0f, stack.pop());
    }

    @Test
    void TestDivision() {
        Calcu calcu = new Calcu();
        CustomStack<Float> stack = new CustomStack<>();
        stack.push(2.0f);
        stack.push(6.0f);

        calcu.division(stack);

        assertEquals(3.0f, stack.pop());
    }

    @Test
    void TestOperaciones() {
        Calcu calcu = new Calcu();
        CustomStack<Float> stack = new CustomStack<>();
        stack.push(2.0f);
        stack.push(3.0f);

        calcu.suma(stack);
        calcu.addNumber(stack, 4);
        calcu.producto(stack);

        assertEquals(20.0f, stack.pop());
    }

    @Test
    void TestEjemplo(){
        Calcu calcu = new Calcu();
        CustomStack<Float> stack = new CustomStack<>();
        stack.push(1f);
        stack.push(2f);

        calcu.suma(stack);
        calcu.addNumber(stack, 4);
        calcu.producto(stack);
        calcu.addNumber(stack, 3);
        calcu.suma(stack);

        assertEquals(15.0f, stack.pop());
    }
}
