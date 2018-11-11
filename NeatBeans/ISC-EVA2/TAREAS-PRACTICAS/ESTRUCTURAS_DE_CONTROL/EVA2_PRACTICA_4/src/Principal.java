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
         
           System.out.println("Ingresa un número");
            double val = Leer.nextDouble();
            
            if(val>0){
                System.out.println("1");
            }else if(val<0){
                System.out.println("-1");
            }else if(val==0){
                System.out.println("0");
            }
    }
    
}
