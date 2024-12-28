package sisrel.calculation;

/**
 * Calculator class. Example taken from:
 * https://www.testingdocs.com/junit-calculator-test-case-example/
 * https://www.youtube.com/watch?v=vZm0lHciFsQ
 */

public class Calculator {

    public Calculator() {}

    /**
     * Sums two integers and returns the result.
     * This operation is commutative, therefore
     * add(a,b) == add(b,a).
     *
     * @param a integer
     * @param b integer
     * @return the result of the operation
     */
    public int add(int a, int b) {
        return a + b;
        // Other potential implementations:
        // return Integer.sum(a, b);
        // return Math.addExact(a, b);
        // return (int)Double.sum(a, b);
    }

    /**
     * Multiplies a and b. This operation is commutative, therefore
     * multiply(a,b) == multiply(b,a)
     * @param a integer
     * @param b integer
     * @return the result of the operation (long)
     */
    public long multiply(int a, int b) {
        return (long) a * b;
    }

    /**
     * Performs the operation a / b with a tolerance of 0.000001.
     * @param a this is the numerator
     * @param b this is the denominator
     * @return the result of the operation
     * @throws IllegalArgumentException if denominator is zero.
     */
    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        return (double) a / (double) b;
    }
}