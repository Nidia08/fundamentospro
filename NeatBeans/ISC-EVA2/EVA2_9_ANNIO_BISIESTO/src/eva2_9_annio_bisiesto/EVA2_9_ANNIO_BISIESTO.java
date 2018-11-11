/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_9_annio_bisiesto;

/**
 *
 * @author invitado
 */
import java.util.Scanner;
public class EVA2_9_ANNIO_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);
        
        System.out.println("Ingresa el número de un año");
            int iAnnio = Leer.nextInt();
        if((iAnnio%4==0)&&(iAnnio%100!=0)){
            System.out.println("Es año bisisesto");
        }else{
            if((iAnnio%100==0)&&(iAnnio%400==0)){
                System.out.println("Es año bisisesto");
            }else{
                System.out.println("No es año bisiesto");
            }
        }
    }
    
}
