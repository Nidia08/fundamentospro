
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 *Nidia Gonzalez Morales 18550676
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner (System.in);
        int num,con=2;
        boolean primo=true;
        
        System.out.println("Ingrese un número entero positivo");
            num=Leer.nextInt();
            
           while((primo)&&(con<(num/2))){
                con++;
                if((num%con)==0){
                   primo=false;
               }
            }
            if(primo){
                System.out.println(num+" es un número primo");
            }else{
                System.out.println(num+" no es un número primo");
            }
    }
    
}
