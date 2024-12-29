package sisrel;

import sisrel.calculation.Calculator;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nRunning my calculator:");
        Calculator myCalculator = new Calculator();
        int x = 1;
        int y = 3;
        int sum = myCalculator.sumar(x,y);
        long multiplication = myCalculator.multiply(x,y);
        double division = myCalculator.divide(x, y);
        System.out.println(x + " + " + y + " = " + sum);
        System.out.println(x + " x " + y + " = " + multiplication);
        System.out.println(x + " / " + y + " = " + division);
        }
    }
