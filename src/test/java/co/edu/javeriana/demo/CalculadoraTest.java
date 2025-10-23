package co.edu.javeriana.demo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
/**
 * Tests para la clase Calculadora
 */
@DisplayName("Tests de Calculadora")
public class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    public void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    @DisplayName("Test suma de números positivos")
    public void testSumarPositivos() {
        assertEquals(5, calculadora.sumar(2, 3),
                "2 + 3 debe ser 5");
        assertEquals(100, calculadora.sumar(50, 50),
                "50 + 50 debe ser 100");
    }

    @Test
    @DisplayName("Test suma con números negativos")
    public void testSumarNegativos() {
        assertEquals(0, calculadora.sumar(-1, 1),
                "-1 + 1 debe ser 0");
        assertEquals(-5, calculadora.sumar(-2, -3),
                "-2 + (-3) debe ser -5");
    }

    @Test
    @DisplayName("Test suma con cero")
    public void testSumarConCero() {
        assertEquals(5, calculadora.sumar(5, 0),
                "5 + 0 debe ser 5");
        assertEquals(0, calculadora.sumar(0, 0),
                "0 + 0 debe ser 0");
    }

    @Test
    @DisplayName("Test resta de números")
    public void testRestar() {
        assertEquals(2, calculadora.restar(5, 3),
                "5 - 3 debe ser 2");
        assertEquals(-2, calculadora.restar(3, 5),
                "3 - 5 debe ser -2");
        assertEquals(0, calculadora.restar(5, 5),
                "5 - 5 debe ser 0");
    }

    @Test
    @DisplayName("Test multiplicación")
    public void testMultiplicar() {
        assertEquals(12, calculadora.multiplicar(3, 4),
                "3 * 4 debe ser 12");
        assertEquals(0, calculadora.multiplicar(0, 5),
                "0 * 5 debe ser 0");
        assertEquals(-10, calculadora.multiplicar(-2, 5),
                "-2 * 5 debe ser -10");
    }

    @Test
    @DisplayName("Test división normal")
    public void testDividir() {
        assertEquals(2.0, calculadora.dividir(6, 3), 0.001,
                "6 / 3 debe ser 2.0");
        assertEquals(2.5, calculadora.dividir(5, 2), 0.001,
                "5 / 2 debe ser 2.5");
    }

    @Test
    @DisplayName("Test división por cero lanza excepción")
    public void testDividirPorCero() {
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> calculadora.dividir(5, 0),
                "Dividir por cero debe lanzar IllegalArgumentException"
        );

        assertTrue(exception.getMessage().contains("cero"),
                "El mensaje debe mencionar 'cero'");
    }

    @Test
    @DisplayName("Test módulo")
    public void testModulo() {
        assertEquals(1, calculadora.modulo(5, 2),
                "5 % 2 debe ser 1");
        assertEquals(0, calculadora.modulo(10, 5),
                "10 % 5 debe ser 0");
    }

     @Test
    @DisplayName("Test potencia")
    public void testPotencia() {
        assertEquals(8.0, calculadora.potencia(2, 3), 0.001, "2^3 debe ser 8");
        assertEquals(1.0, calculadora.potencia(5, 0), 0.001, "Cualquier número elevado a 0 debe ser 1");
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> calculadora.potencia(2, -1),
                "Exponente negativo debe lanzar excepción");
        assertTrue(exception.getMessage().contains("negativo"));
    }

    @Test
    @DisplayName("Test raíz cuadrada")
    public void testRaizCuadrada() {
        assertEquals(3.0, calculadora.raizCuadrada(9), 0.001, "Raíz cuadrada de 9 debe ser 3");
        assertEquals(0.0, calculadora.raizCuadrada(0), 0.001, "Raíz cuadrada de 0 debe ser 0");
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> calculadora.raizCuadrada(-4),
                "No se puede calcular raíz de número negativo");
        assertTrue(exception.getMessage().contains("negativo"));
    }

    @Test
    @DisplayName("Test factorial")
    public void testFactorial() {
        assertEquals(1, calculadora.factorial(0), "0! debe ser 1");
        assertEquals(120, calculadora.factorial(5), "5! debe ser 120");
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> calculadora.factorial(-3),
                "Factorial de número negativo debe lanzar excepción");
        assertTrue(exception.getMessage().contains("negativo"));
    }

    @Test
    @DisplayName("Test máximo común divisor (MCD)")
    public void testMcd() {
        assertEquals(6, calculadora.mcd(54, 24), "MCD de 54 y 24 debe ser 6");
        assertEquals(1, calculadora.mcd(17, 5), "MCD de 17 y 5 debe ser 1");
        assertEquals(10, calculadora.mcd(-20, 30), "MCD con números negativos debe funcionar correctamente");
    }
}
