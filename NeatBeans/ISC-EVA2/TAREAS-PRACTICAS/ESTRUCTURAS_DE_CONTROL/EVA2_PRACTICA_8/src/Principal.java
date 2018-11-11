
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
        
        System.out.println("Ingresa la medida del primer lado del triangulo");
            double lP = Leer.nextDouble();
        
        System.out.println("Ingresa la medida del segundo lado del triangulo");
            double lS = Leer.nextDouble();
        
        System.out.println("Ingresa la medida del tercer lado del triangulo");
            double lT = Leer.nextDouble();
            
            
            if((lP==lS)&&(lP==lT)&&(lS==lT)){
                System.out.println("Traingulo equilatero");
            }else{
                if((lP==lT)&&(lP!=lS)&&((lT!=lS))){
                       System.out.println("Triangulo isoceles"); 
                    }else{
                        if((lS==lT)&&(lS!=lP)&&(lS!=lP)){
                                System.out.println("Triangulo isoceles");
                    }else{
                        if((lP!=lS)&&(lP!=lT)&&(lS!=lT)){
                                System.out.println("Triangulo escaleno");
                        }
                    }
                
                }
            }
    }
}
