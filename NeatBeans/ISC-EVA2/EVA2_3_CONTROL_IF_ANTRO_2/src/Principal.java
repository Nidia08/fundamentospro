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
       boolean bINE;
        
        Scanner Leer = new Scanner(System.in);
        
        System.out.println("¿Tienes INE?");
            bINE = Leer.nextBoolean();
        if(bINE == true){
            System.out.println("Si tienes INE");
        }else{
            System.out.println("No tienes INE");
        }
    }
    
}
