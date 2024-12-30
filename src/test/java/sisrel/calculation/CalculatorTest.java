package sisrel.calculation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Source:
 * https://junit.org/junit5/docs/current/user-guide/#overview
 * <p>
 * Name your tests with this pattern: [MethodUnderTest]_[Scenario]_[ExpectedResult]
 * <p>
 * Implement your tests with the AAA pattern:
 * <p>(1) Arrange: define the objects involved
 * <p>(2) Act: apply on them a single behavior of the unit
 * <p>(3) Assert: check the conditions to meet
 */

public class CalculatorTest {

    @Test
    public void sumar_DosEnterosResultadoCabeEnInteger_RetornaResultadoCorrecto() {
        // Arrange
        Calculator calculadora = new Calculator();
        int x = 3;
        int y = 4;
        int valorEsperado = 7;

        // Act
        int valorObtenido = calculadora.sumar(x, y);

        // Assert
        String errorMessage = x + " + " + y + " deberia ser " + valorEsperado;
        assertEquals(valorEsperado, valorObtenido, errorMessage);
    }

    @Test
    public void sumar_ConmutatividadEnSuma_ResultadoEsConmutativo() {
        // Arrange
        Calculator calculadora = new Calculator();
        int x = 3;
        int y = 4;

        // Act
        int resultado1 = calculadora.sumar(x, y);
        int resultado2 = calculadora.sumar(y, x);

        // Assert
        String errorMessage = x + " + " + y + " deberia ser conmutativo";
        assertEquals(resultado1, resultado2, errorMessage);
    }

    @Test
    public void sumar_SumaCero_RetornaMismoValorDeInput() {
        // Arrange
        Calculator calculadora = new Calculator();
        int x = 3;

        // Act
        int valorObtenido = calculadora.sumar(x, 0);

        // Assert
        String errorMessage = x + " + 0 deberia ser " + x;
        assertEquals(valorObtenido, x, errorMessage);
    }

    @Test
    void sumar_SumaEsMayorQueMaxInteger_LanzaArithmeticException() {
        // Arrange
        Calculator calculadora = new Calculator();

        // Act and Assert
        assertThrows(
                ArithmeticException.class,
                () -> calculadora.sumar(Integer.MAX_VALUE, 1),
                "Expected an ArithmeticException for overflow"
        );
    }

    @Test
    void sumar_SumaEsMenorQueMinInteger_LanzaArithmeticException() {
        // Arrange
        Calculator calculadora = new Calculator();

        // Act and Assert
        assertThrows(
                ArithmeticException.class,
                () -> calculadora.sumar(Integer.MIN_VALUE, -1),
                "Expected an ArithmeticException for underflow"
        );
    }
}
