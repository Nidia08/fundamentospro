
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nidia González Morales 18550676
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner (System.in);
        
        System.out.println("Ingrese el valor de la temperatura");
            double tem = Leer.nextDouble();
            
        if(tem<0){
            System.out.println("Freezing weather");
        }else{
            if((tem>0)&&(tem<=10)){
                System.out.println("Very Cold weather");
            }else{
                if((tem>11) && (tem<=20)){
                    System.out.println("Cold weather");
                }else{
                    if((tem>21)&&(tem<=30)){
                        System.out.println("Normal in temp");
                    }else{
                        if((tem>31)&&(tem<40)){
                            System.out.println("Its hot");
                        }else{
                            if(tem>=40){
                                System.out.println("Its ver hot");
                            }
                        }
                    }
                }
            }
        }
           
    }
    
}
