import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Clase Main que contiene el método principal para ejecutar el programa.
 */
public class Main {
    public static void main(String[] args) {
        // Crear una nueva calculadora y un nuevo stack.
        Calculadora calcu = new Calculadora();
        CustomStack<Float> stack = new CustomStack<>();
        Scanner scanner = new Scanner(System.in);

        // Bucle principal del programa.
        while (true) {
            // Mostrar el menú al usuario.
            System.out.println("1. Abrir archivo y resolver operación Postfix");
            System.out.println("2. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();

            // Procesar la opción elegida por el usuario.
            if (opcion == 1) {
                // Intentar abrir el archivo y leer cada línea.
                try (BufferedReader br = new BufferedReader(new FileReader("datos.txt"))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        // Dividir la línea en caracteres y procesar cada uno.
                        String[] caracteres = line.split(" ");
                        for (String caracter : caracteres) {
                            // Si el caracter es un número, añadirlo al stack.
                            if (calcu.isNumber(caracter)) {
                                calcu.addNumber(stack, Integer.parseInt(caracter));
                            } else {
                                // Si el caracter es un operador, realizar la operación correspondiente.
                                if (stack.size() < 2) {
                                    throw new IllegalStateException("No hay suficientes operandos en la pila para realizar la operación.");
                                }
                                switch (caracter) {
                                    case "+":
                                        calcu.suma(stack);
                                        break;
                                    case "-":
                                        calcu.resta(stack);
                                        break;
                                    case "*":
                                        calcu.producto(stack);
                                        break;
                                    case "/":
                                        // Verificar que no estamos dividiendo por cero antes de realizar la división.
                                        float divisor = stack.pop();
                                        if (divisor == 0) {
                                            throw new ArithmeticException("No es posible Dividir entre 0.");
                                        }
                                        stack.push(divisor);
                                        calcu.division(stack);
                                        break;
                                    default:
                                        throw new IllegalArgumentException("Caracter inválido: " + caracter);
                                }
                            }
                        }
                        // Mostrar el resultado de la operación.
                        System.out.println("Resultado: " + stack.pop());
                    }
                } catch (IOException e) {
                    System.out.println("Error al abrir el archivo: " + e.getMessage());
                } catch (IllegalStateException | ArithmeticException | IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            } else if (opcion == 2) {
                // Salir del programa.
                break;
            } else {
                System.out.println("Opción inválida. Por favor, elige una opción del menú.");
            }
        }

        // Cerrar el scanner antes de salir.
        scanner.close();
    }
}