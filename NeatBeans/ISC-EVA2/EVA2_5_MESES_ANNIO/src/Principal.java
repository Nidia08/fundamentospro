/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nidia Gonzalez Morales
 */
import java.util.Scanner;
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);
        
        System.out.println("Ingrese el número de mes");
            int iMes = Leer.nextInt();
        if(iMes == 1)
            System.out.println("Enero");
        else if(iMes == 2)
            System.out.println("Febrero");
        else if(iMes == 3)
            System.out.println("Marzo");
        else if(iMes == 4)
            System.out.println("Abril");
        else if(iMes == 5)
            System.out.println("Mayo");
        else if(iMes == 6)
            System.out.println("Junio");
        else if(iMes == 7)
            System.out.println("Julio");
        else if(iMes == 8)
            System.out.println("Agosto");
        else if(iMes == 9)
            System.out.println("Septiembre");
        else if(iMes == 10)
            System.out.println("Octubre");
        else if(iMes == 11)
            System.out.println("Noviembre");
        else if(iMes == 12)
            System.out.println("Diciembre");
        else{
            System.out.println("Valor invalido");
        }
        
    }
    
}
