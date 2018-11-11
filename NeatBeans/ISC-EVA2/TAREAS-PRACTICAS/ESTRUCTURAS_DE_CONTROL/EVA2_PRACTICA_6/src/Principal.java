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

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner (System.in);
        
        System.out.println("Ingrese el primer valor de la cordenada");
            double valU = Leer.nextDouble();
        System.out.println("Ingrese el segundo valor de la cordenada");
            double valD = Leer.nextDouble();
            
            if((valU>0)&&(valD>0)){
                System.out.println("Cuadrante I");
            }else{
                if((valU<0)&&(valD>0)){
                    System.out.println("Cuadrante II");
                }else{
                    if((valU<0)&&(valD<0)){
                        System.out.println("Cuadrante III");
                    }else{
                        if((valU>0)&&(valD<0)){
                            System.out.println("Cuadrante IV");
                        }
                    }
                }
            }
    }
    
}
