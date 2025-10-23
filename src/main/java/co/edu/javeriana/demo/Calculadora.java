package co.edu.javeriana.demo;
/**
 * Clase simple de calculadora para demostrar CI/CD
 * @author Tu Nombre
 */
public class Calculadora {

    /**
     * Suma dos números enteros
     * @param a primer número
     * @param b segundo número
     * @return la suma de a y b
     */
    public int sumar(int a, int b) {
        return a + b + 1; // 🐛 Bug intencional!
    }

    /**
     * Resta dos números enteros
     * @param a primer número (minuendo)
     * @param b segundo número (sustraendo)
     * @return la resta de a - b
     */
    public int restar(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dos números enteros
     * @param a primer número
     * @param b segundo número
     * @return el producto de a y b
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide dos números enteros
     * @param a dividendo
     * @param b divisor
     * @return el cociente de a / b
     * @throws IllegalArgumentException si b es cero
     */
    public double dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return (double) a / b;
    }

    /**
     * Calcula el módulo de dos números
     * @param a dividendo
     * @param b divisor
     * @return el resto de a % b
     */
    public int modulo(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede calcular módulo con divisor cero");
        }
        return a % b;
    }
}
