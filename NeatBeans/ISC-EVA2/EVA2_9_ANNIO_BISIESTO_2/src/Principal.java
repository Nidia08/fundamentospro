
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NIDIA
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);
        System.out.println("Escribe un año");
        int iAnnio;
        
        iAnnio = Leer.nextInt();
        int iResi4;
        int iResi100;
        int iResi400;
        
        iResi4 = iAnnio % 4;
        iResi100 = iAnnio % 100;
        iResi400 = iAnnio % 400;
        if (iResi4 == 0 && (!(iResi100 == 0) || iResi400 == 0)) {
            System.out.println("Si es año bisiesto");
        } else {
            System.out.println("No es año bisiesto");
        }
    

    }
    
}
