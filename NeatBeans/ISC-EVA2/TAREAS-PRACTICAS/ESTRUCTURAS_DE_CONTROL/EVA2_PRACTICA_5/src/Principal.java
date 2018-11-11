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
        
        System.out.println("Ingresa tres números");
            double valU = Leer.nextDouble();
            double valD = Leer.nextDouble();
            double valT = Leer.nextDouble();
            
            if((valU > valD) && (valU > valT)){
                System.out.println(valU+" es el número mayor");
            }else{
                if((valD > valU) && (valD > valT)){
                    System.out.println(valD+" es el número mayor");
                }else{
                    if((valT > valU) && (valT > valD) ){
                        System.out.println(valT+" es el número mayor");
                    }
                }
            
            }
            
    }
    
   }
