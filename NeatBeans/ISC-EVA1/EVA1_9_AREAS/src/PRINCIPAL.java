/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nidia Gonzalez Morales 18550676
 */
import java.util.Scanner;
public class PRINCIPAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);
        
        double bM,bMe,aT,h;
        
        System.out.println("Ingresa el valor de la base mayor");
            bM = Leer.nextDouble();
        System.out.println("Ingresa el valor de la base menor");
            bMe = Leer.nextDouble();
        System.out.println("Ingresa el valor de la altura");
            h = Leer.nextDouble();
            
            aT = ((bM+bMe)/2)*h;
        System.out.println("El área del trapecio es " + aT);
    }
    
}
