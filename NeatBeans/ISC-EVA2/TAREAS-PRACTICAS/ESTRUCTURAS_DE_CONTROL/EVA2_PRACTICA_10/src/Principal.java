
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
        Scanner Leer = new Scanner(System.in);
        
        System.out.println("Ingrese los puntos en Matemáticas");
            double dMat = Leer.nextDouble();
        System.out.println("Ingrese los puntos en Química");
            double dQui = Leer.nextDouble();
        System.out.println("Ingrese los puntos en Física");
            double dFis = Leer.nextDouble();
            
            double sum = dMat+dQui+dFis;
         
            if((((dMat>=65)&&(dFis>=55)&&(dQui>=50))&&(sum>=180))||((dMat>=65)&&(sum>=140))){
                        System.out.println("El candidato es elegible para el curso");
            }else{
                        System.out.println("El candidato no es elegible para el curso");
                    }
    }
    
}
