/*
Programa para calcular ciruitos electricos en paralelo
 */
package examen_practico_circuito;

import java.util.Scanner;

/**
 *
 * @Banana Bread
 */


public class Examen_practico_circuito {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("introdusca las siguientes resistencias ");
        System.out.println("R1");
        double rR1;
        rR1 = input.nextDouble();
        
        System.out.println("R2");
        double rR2;
        rR2 = input.nextDouble();
        
        System.out.println("R3");
        double rR3;
        rR3 = input.nextDouble();
        
        System.out.println("R4");
        double rR4;
        rR4 = input.nextDouble();
        
        System.out.println("R5");
        double rR5;
        rR5 = input.nextDouble();
        
        System.out.println("Introduce el voltaje");
        double rV;
        rV = input.nextDouble();
        
        double rRT; 
        rRT =  1 / ( 1 / rR1 +  1 / rR2 + 1 / rR3 + 1 / rR4 + 1 / rR5);
        System.out.print("RT es ");
        System.out.println(rRT);
        
        double rI1;
        rI1 = rV / rR1;
        System.out.print("I1 es ");
        System.out.println(rI1);
        
        double rI2;
        rI2 = rV / rR2;
        System.out.print("I2 es ");
        System.out.println(rI2);
        
        double rI3;
        rI3 = rV / rR3;
        System.out.print("I3 es ");
        System.out.println(rI3);
        
        double rI4;
        rI4 = rV / rR4;
        System.out.print("I4 es ");
        System.out.println(rI4);
        
        double rI5;        
        rI5 = rV / rR5;
        System.out.print("I5 es ");
        System.out.println(rI5);
        
        double rIT;
        rIT = rI1 + rI2 + rI3 + rI4 + rI5;
        System.out.println("IT es ");
        System.out.println(rIT);
    }
}
