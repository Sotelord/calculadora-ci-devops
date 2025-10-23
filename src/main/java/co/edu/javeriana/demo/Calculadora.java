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
        return a + b; // ✅ Arreglado
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

    public double potencia(double base, int exponente) {
        if (exponente < 0) {
            throw new IllegalArgumentException("El exponente no puede ser negativo");
        } else {
            return Math.pow(base, (double)exponente);
        }
    }

    public double raizCuadrada(double numero) {
        if (numero < (double)0.0F) {
            throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo");
        } else {
            return Math.sqrt(numero);
        }
    }

    public long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("No se puede calcular el factorial de un número negativo");
        } else {
            long resultado = 1L;

            for(int i = 2; i <= n; ++i) {
                resultado *= (long)i;
            }

            return resultado;
        }
    }

    public int mcd(int a, int b) {
        a = Math.abs(a);

        int temp;
        for(int var5 = Math.abs(b); var5 != 0; a = temp) {
            temp = var5;
            var5 = a % var5;
        }

        return a;
    }
}
