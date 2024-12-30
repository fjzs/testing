package sisrel;

import sisrel.calculation.Calculator;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nEjecutando my calculadora:");
        Calculator calculadora = new Calculator();
        System.out.println("1 + 3 = " + calculadora.sumar(1,3));
        System.out.println("1 + 0 = " + calculadora.sumar(1,0));
        boolean conmutativo = calculadora.sumar(2,5) == calculadora.sumar(5,2);
        System.out.println("2 + 5 = 5 + 2? : " + conmutativo);
        try{
            calculadora.sumar(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        catch (Exception e){
            System.out.println("Excepcion al sumar " + Integer.MAX_VALUE + " + " + Integer.MAX_VALUE + ":");
            System.out.println(e);
        }
        }
    }
