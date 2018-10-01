/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NIDIA
 */
import java.text.DecimalFormat;
import java.util.Scanner;
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);
        
        double x1=0,x2=0,y1=0,y2=0,p=0,a = 0;
        
        System.out.println("Usando la fórmula 𝑦 = x²,\nconoceras el valor de la pendiente y del área que existe "
                + "entre dos valores de x");
        
            System.out.println("Porfavor ingrese los datos necesarios");
            System.out.println("Ingrese el primer valor de x");
                x1 = Leer.nextDouble();
            System.out.println("Ingrese el segundo valor de x");
                x2 = Leer.nextDouble();
                
                y1 = Math.pow(x1, 2);
                y2 = Math.pow(x2, 2);
            
                p = ((x2-x1)/(y2-y1));            
            
                if(x1<x2){
                    a = ((Math.pow(x2, 3))/3)-((Math.pow(x1, 3))/3);
                }else{
                    if(x1>x2){
                        a = ((Math.pow(x1, 3))/3)-((Math.pow(x2, 3))/3);
                    }
                }
                DecimalFormat df = new DecimalFormat("#.000");
                System.out.println("La pendiente de sus datos es "+df.format(p));
                System.out.println("y el áera es "+ df.format(a)+"u²");
          
    }
    
}
