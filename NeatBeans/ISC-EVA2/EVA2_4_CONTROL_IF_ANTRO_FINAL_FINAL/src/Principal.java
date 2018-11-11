/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NIDIA GONZALEZ MORALES 18550676
 */
import java.util.Scanner;
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner (System.in);
        System.out.println("¿Cuál es tu edad?");
            int iEdad = Leer.nextInt();
        System.out.println("¿Tienes INE?");
            boolean bIne = Leer.nextBoolean();
            
            if((iEdad>=18) && (bIne == true) ){
                System.out.println("Puedes pasar");
            }else{
                System.out.println("No puedes pasar");
            }
    }
    
}
