package sisrel.calculation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Source: https://www.testingdocs.com/junit-calculator-test-case-example/
 * https://junit.org/junit5/docs/current/user-guide/#overview
 *
 * Name your tests with this pattern: [MethodUnderTest]_[Scenario]_[ExpectedResult]
 *
 * Implement your tests with the AAA pattern:
 * (1) Arrange: define the objects involved
 * (2) Act: apply on them a single behavior of the unit
 * (3) Assert: check the conditions to meet
 */

public class CalculatorTest {

    @Test
    public void add_PositiveNumbers_ReturnsCorrectResult() {
        // Arrange
        Calculator calculator = new Calculator();
        int a = 3;
        int b = 4;
        int expected = 7;

        // Act
        int actual = calculator.add(a, b);

        // Assert
        String errorMessage = a + " + " + b + " should be " + expected;
        assertEquals(expected, actual, errorMessage);
    }
    @Test
    public void add_NegativeNumbers_ReturnsCorrectResult() {
        // Arrange
        Calculator calculator = new Calculator();
        int a = -3;
        int b = -4;
        int expected = a + b;

        // Act
        int actual = calculator.add(a, b);

        // Assert
        String errorMessage = a + " + " + b + " should be " + expected;
        assertEquals(expected, actual, errorMessage);
    }

    @Test
    public void add_Commutative_ReturnsSameResult() {
        // Arrange
        Calculator calculator = new Calculator();
        int a = 3;
        int b = 4;

        // Act
        boolean isCommutative = calculator.add(a, b) == calculator.add(b, a);

        // Assert
        String errorMessage = a + " + " + b + " should be commutative";
        assertTrue(isCommutative, errorMessage);
    }

    @Test
    public void add_Zeros_ReturnsCorrectResult() {
        // Arrange
        Calculator calculator = new Calculator();
        int a = 0;
        int b = 0;
        int expected = 0;

        // Act
        int actual = calculator.add(a, b);

        // Assert
        String errorMessage = a + " + " + b + " should be " + expected;
        assertEquals(expected, actual, errorMessage);
    }

    @Test
    public void multiply_PositiveNumbers_ReturnsCorrectResult() {
        // Arrange
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 25;
        long expected = 250;

        // Act
        long actual = calculator.multiply(a, b);

        // Assert
        String errorMessage = a + " x " + b + " should be " + expected;
        assertEquals(expected, actual, errorMessage);
    }

    @Test
    public void multiply_ZeroZero_ReturnsZero() {
        // Arrange
        Calculator calculator = new Calculator();
        int a = 0;
        int b = 0;
        long expected = 0;

        // Act
        long actual = calculator.multiply(a, b);

        // Assert
        String errorMessage = a + " x " + b + " should be " + expected;
        assertEquals(expected, actual, errorMessage);
    }

    @Test
    public void multiply_NegativeNumbers_ReturnsCorrectResult() {
        // Arrange
        Calculator calculator = new Calculator();
        int a = -5;
        int b = -6;
        long expected = 30;

        // Act
        long actual = calculator.multiply(a, b);

        // Assert
        String errorMessage = a + " x " + b + " should be " + expected;
        assertEquals(expected, actual, errorMessage);
    }

    @Test
    public void divide_PositiveNumbers_ReturnsCorrectResult() {
        // Arrange
        Calculator calculator = new Calculator();
        int a = 1;
        int b = 3;
        double expected = (double) (a) / (double) (b);

        // Act
        double actual = calculator.divide(a, b);

        // Assert (when comparing doubles you need a threshold).
        String errorMessage = a + " x " + b + " should be " + expected;
        double threshold = 0.0000001;
        assertEquals(expected, actual, threshold, errorMessage);
    }

    @Test
    public void divide_DenominatorZero_RaisesIllegalArgumentException() {
        // Arrange
        Calculator calculator = new Calculator();
        int a = 15;
        int b = 0;

        // Assert
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(a, b));
    }
}
