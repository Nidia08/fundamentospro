/*
 *Bloque if
 */

/**
 *
 * @author Nidia González Morales 18550676
 */
import java.util.Scanner;
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);
        
        System.out.println("Que calificación obtuviste en Fundmentos de Programación");
            double cal=Leer.nextDouble();
            System.out.println("Tu calificación es "+cal);
            
        if(cal>=70){
            System.out.println("Aprobaste");
        }else{
            System.out.println("Reprobaste");
        }
    }
    
}
