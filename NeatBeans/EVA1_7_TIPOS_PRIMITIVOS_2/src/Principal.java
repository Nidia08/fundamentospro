/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nidia Gonzalez Morales 18550676
 */
import java.util.Scanner;
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String sNombre;
        int iEdad, iAnio;
        
        Scanner Leer = new Scanner(System.in);
        
        System.out.println("Ingresa tu nombre");
            sNombre = Leer.nextLine();
        System.out.println("Ingresa tu edad");
            iEdad = Leer.nextInt();
            
            iAnio = 2018 - iEdad;
        System.out.println("Tu nombre es "+ sNombre + "\n"+ "Y tu año de nacimiento es " + iAnio);
        
        //\n es para hacer salto de linea
            
    }
    
}
