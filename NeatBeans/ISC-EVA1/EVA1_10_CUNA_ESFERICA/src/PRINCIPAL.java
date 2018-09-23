/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
import java.util.Scanner;
public class PRINCIPAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner Leer = new Scanner(System.in);
        
        double r, g, vT;
        final double pi=3.1416;
        
        System.out.println("Ingresa valor del radio");
            r = Leer.nextDouble();
        System.out.println("Ingresa el valor de los grados");
            g = Leer.nextDouble();
            
            double exr = Math.pow(r,3);
           
            vT = (4/3)*((pi*exr)/2)*g;
            
            System.out.println("El volumen de la cuna esferica es " + vT);
    }
    
}
