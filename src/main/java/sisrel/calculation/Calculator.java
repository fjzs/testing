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
     * <p>
     * (1) Esta operacion es conmutativa, es decir:
     * sumar(x,y) == sumar(y,x).
     * <p>
     * (2) Esta operacion cumple con la identidad,
     * es decir: sumar(x,0) == x
     * <p>
     * (3) Si el resultado no cabe en un Integer,
     * lanza un ArithmeticException
     *
     * @param x integer
     * @param y integer
     * @return el resultado de la suma.
     */
    public int sumar(int x, int y) {
        long result = (long) x + y;
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            throw new ArithmeticException(x + " + " + y + " es mayor a lo permitido por un Integer");
        }
        //asdasd
        return (int) result;
    }
}