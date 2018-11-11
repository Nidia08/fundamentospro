/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_practica_1;

/**
 *
 * @author Nidia González Morales 18550676
 */
import java.util.Scanner;
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner (System.in);
        
        System.out.println("Ingrese dos valores enteros");
            int valU = Leer.nextInt();
            
            int valD = Leer.nextInt();
            
            if(valU==valD){
                System.out.println("El número 1 y el número 2 son iguales");
            }else{
                System.out.println("El número 1 y el número 2 no son iguales ");
            }
    }
    
}
