package sisrel;

import sisrel.calculation.Calculator;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nEjecutando my calculadora:");
        Calculator calculadora = new Calculator();
        int x = 1;
        int y = 3;
        int sum = calculadora.sumar(x,y);
        System.out.println(x + " + " + y + " = " + sum);
        System.out.println(calculadora.sumar(Integer.MAX_VALUE, 0));
        }
    }
