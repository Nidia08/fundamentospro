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
       
        boolean materiasTerminadas;
        boolean servicio;
        boolean residencias;
        
        materiasTerminadas = true;
        servicio = true;
        residencias = true;
        if (materiasTerminadas == true && servicio == true && residencias == true) {
            System.out.println("Si se puede titular");
        } else {
            System.out.println("No se puede titular");
        }
    
    }
    
}
