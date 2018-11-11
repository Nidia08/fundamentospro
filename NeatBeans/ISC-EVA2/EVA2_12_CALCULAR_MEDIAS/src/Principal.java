
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Nidia Gonzalez Morales 18550676
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner (System.in);
        
        int edad = 0,sum=0;
        
        System.out.println("Ingresa la edad 1");
            sum += edad = Leer.nextInt();
        System.out.println("Ingresa la edad 2");
            sum += edad = Leer.nextInt();
        System.out.println("Ingresa la edad 3");
            sum += edad = Leer.nextInt();
        System.out.println("Ingresa la edad 4");
            sum += edad = Leer.nextInt();
        System.out.println("Ingresa la edad 5");
            sum += edad = Leer.nextInt();
            
            double med = (double) sum/5;
            System.out.println(med);
    }
    
}
