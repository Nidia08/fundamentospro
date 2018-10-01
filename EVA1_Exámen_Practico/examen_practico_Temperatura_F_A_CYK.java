/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatura_.f_a_.c.y.k;

import java.util.Scanner;

/**
 *
 * @author odm 66945
 */
public class Temperatura_F_A_CYK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("introduce la temperatura en grados Fahrenheit");
        double far;
        
        far = input.nextDouble();
        double c;
        double celcius;
        
        celcius = (far - 32) / 1.8;
        System.out.println("el resultado es");
        System.out.print(celcius);
        System.out.println("°C");
        System.out.println(" o");
        double kelvin;
        
        kelvin = (far + 459.67) / 1.8;
        System.out.print(kelvin);
        System.out.println("°K");
    }
    
}
