package sisrel.calculation;

/**
 * Source: https://www.testingdocs.com/junit-calculator-test-case-example/
 *
 * Name your tests with this pattern: [MethodUnderTest]_[Scenario]_[ExpectedResult]
 *
 * Implement your tests with the AAA pattern:
 * (1) Arrange: define the objects involved
 * (2) Act: apply on them a single behavior of the unit
 * (3) Assert: check the conditions to meet
 */

//public class CalculatorTest {
//
//    @Test
//    public void add_PositiveNumbers_ReturnsCorrectResult() {
//        // Arrange
//        Calculator calculator = new Calculator();
//        int a = 3;
//        int b = 4;
//        int expectedResult = 7;
//
//        // Act
//        int result = calculator.add(a, b);
//
//        // Assert
//        String errorMessage = a + " + " + b + " should be " + expectedResult;
//        Assert.assertEquals(errorMessage, expectedResult, result);
//    }
//
//    @Test
//    public void add_NegativeNumbers_ReturnsCorrectResult() {
//        // Arrange
//        Calculator calculator = new Calculator();
//        int a = -3;
//        int b = -4;
//        int expectedResult = a + b;
//
//        // Act
//        int result = calculator.add(a, b);
//
//        // Assert
//        String errorMessage = a + " + " + b + " should be " + expectedResult;
//        Assert.assertEquals(errorMessage, expectedResult, result);
//    }
//
//    @Test
//    public void add_Commutative_ReturnsSameResult() {
//        // Arrange
//        Calculator calculator = new Calculator();
//        int a = 3;
//        int b = 4;
//
//        // Act
//        boolean isCommutative = calculator.add(a, b) == calculator.add(b, a);
//
//        // Assert
//        String errorMessage = a + " + " + b + " should be commutative";
//        Assert.assertTrue(errorMessage, isCommutative);
//    }
//
//    @Test
//    public void add_Zeros_ReturnsCorrectResult() {
//        // Arrange
//        Calculator calculator = new Calculator();
//        int a = 0;
//        int b = 0;
//        int expectedResult = 0;
//
//        // Act
//        int result = calculator.add(a, b);
//
//        // Assert
//        String errorMessage = a + " + " + b + " should be " + expectedResult;
//        Assert.assertEquals(errorMessage, expectedResult, result);
//    }
//
//    @Test
//    public void multiply_PositiveNumbers_ReturnsCorrectResult() {
//        // Arrange
//        Calculator calculator = new Calculator();
//        int a = 10;
//        int b = 25;
//        long expectedResult = a * b;
//
//        // Act
//        long result = calculator.multiply(a, b);
//
//        // Assert
//        String errorMessage = a + " x " + b + " should be " + expectedResult;
//        Assert.assertEquals(errorMessage, expectedResult, result);
//    }
//
//    @Test
//    public void multiply_ZeroZero_ReturnsZero() {
//        // Arrange
//        Calculator calculator = new Calculator();
//        int a = 0;
//        int b = 0;
//        long expectedResult = 0;
//
//        // Act
//        long result = calculator.multiply(a, b);
//
//        // Assert
//        String errorMessage = a + " x " + b + " should be " + expectedResult;
//        Assert.assertEquals(errorMessage, expectedResult, result);
//    }
//
//    @Test
//    public void multiply_NegativeNumbers_ReturnsCorrectResult() {
//        // Arrange
//        Calculator calculator = new Calculator();
//        int a = -5;
//        int b = -6;
//        long expectedResult = 30;
//
//        // Act
//        long result = calculator.multiply(a, b);
//
//        // Assert
//        String errorMessage = a + " x " + b + " should be " + expectedResult;
//        Assert.assertEquals(errorMessage, expectedResult, result);
//    }
//
//    @Test
//    public void divide_PositiveNumbers_ReturnsCorrectResult() {
//        // Arrange
//        Calculator calculator = new Calculator();
//        int a = 1;
//        int b = 3;
//        double expectedResult = (double) (a) / (double) (b);
//
//        // Act
//        double result = calculator.divide(a, b);
//
//        // Assert (when comparing doubles you need a threshold).
//        String errorMessage = a + " x " + b + " should be " + expectedResult;
//        double threshold = 0.0000001;
//        Assert.assertEquals(errorMessage, expectedResult, result, threshold);
//    }
//
//    @Test
//    public void divide_DenominatorZero_RaisesIllegalArgumentException() {
//        // Arrange
//        Calculator calculator = new Calculator();
//        int a = 15;
//        int b = 0;
//
//        // Assert
//        String errorMessage = "if denominator is 0 an IllegalArgumentException is expected";
//        Assert.assertThrows(errorMessage, IllegalArgumentException.class,
//                () -> {
//                    // Act
//                    calculator.divide(a, b);
//                });
//    }
//}
