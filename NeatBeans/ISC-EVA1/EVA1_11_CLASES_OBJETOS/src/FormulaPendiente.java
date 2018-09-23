/*
 *Formula Pendiente
 */

/**
 *
 * @author Nidia González Morales 18550676
 */
import java.util.Scanner;
public class FormulaPendiente {
     public static void main(String[] args) {
        // TODO code application logic here
        double x1,x2,y1,y2,p;
        
        Scanner Leer = new Scanner(System.in);
        
        System.out.println("Ingresa el primer valor de x");
            x1 = Leer.nextDouble();
        System.out.println("Ingresa el segundo valor de x");
            x2 = Leer.nextDouble();
        System.out.println("Ingresa el primer valor de y");
            y1 = Leer.nextDouble();
        System.out.println("Ingresa el segundo valor de y");
            y2 = Leer.nextDouble();
            
            p = (y2-y1)/(x2-x1);
    }
}
