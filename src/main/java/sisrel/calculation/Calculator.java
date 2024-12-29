package sisrel.calculation;

/**
 * Calculator class. Example taken from:
 * https://www.testingdocs.com/junit-calculator-test-case-example/
 * https://www.youtube.com/watch?v=vZm0lHciFsQ
 */

public class Calculator {

    public Calculator() {}

    /**
     * Suma 2 enteros y retorna el resultado.
     *
     * (1) Esta operacion es conmutativa, por lo que
     * sumar(x,y) == sumar(x,y).
     *
     * (2) Esta operacion cumple con la identidad,
     * es decir sumar 0 a x es x: sumar(x,0) == x
     *
     * (3) Si el resultado es mas grande que un entero,
     * retorna un ArithmeticException
     *
     * @param x integer
     * @param y integer
     * @return el resultado de la suma.
     */
    public int sumar(int x, int y) {
        long result = (long) x + y;
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            throw new ArithmeticException();
        }
        return (int) result;
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