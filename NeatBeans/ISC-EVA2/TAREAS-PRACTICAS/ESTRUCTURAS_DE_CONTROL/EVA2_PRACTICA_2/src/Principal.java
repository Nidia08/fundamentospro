/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
        
        System.out.println("Ingrese un número");
            int val = Leer.nextInt();
            
            if(val%2==0){
                System.out.println("Es número par");
            }else{
                System.out.println("Es número impar");
            }
    }
    
}
