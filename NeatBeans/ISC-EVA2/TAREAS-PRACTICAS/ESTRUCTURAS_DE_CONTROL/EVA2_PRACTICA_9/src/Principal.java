
import java.util.Scanner;

/*
 * Resolver ecuaciones cuadraticas de la forma Axcuadrada+Bx+C=0. Antes de resolver indicar (usando
 * discriminantes)si la ecuacion se puede resolver, si es un trinomio cuadrado perfecto, o si es
 * otro tipo de trinomio  entrada 1 2 1 salida trinomio cuadrado perfecto y las raices son x1 = -1, x2 = -1.
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
        System.out.println("Ingresa los valores de la variable a ");
            double a = Leer.nextDouble();
         System.out.println("Ingresa los valores de la variable b ");
            double b = Leer.nextDouble();
         System.out.println("Ingresa los valores de la variable c ");
            double c = Leer.nextDouble();
            
            double bC = Math.pow(b, 2);
            double ac = 4*a*c;
            double ra = Math.sqrt(bC-ac);
        if(bC>=ac){
            System.out.print("Si se puede resolver  ");
            if((bC-ac)==0){
                System.out.println("es un trinomio cuadrado perfecto");
            }
            double res1 = (-b+ ra)/(2*a);
            double res2 = (-b-ra)/(2*a);
            System.out.println("y sus raices son x1= "+res1+" y x2= "+res2);
        }else{
            System.out.println("No se puede resolver, raiz imaginaria");
        }
        
    }
    
}
