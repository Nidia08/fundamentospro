/*
 *
 */

/**
 *
 * @author Nidia Gonzalez Morales 1855676
 */

import java.util.Scanner;
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);
        
        System.out.println("Ingresa la letra correspondiente a la calificación en mayúsculas");
            String sCal = Leer.nextLine();
            
        switch(sCal){
            case "A":
                System.out.println("Su calificación es 100");
            break;
            case "B":
                System.out.println("Su calificación es 90");
            break;
            case "C":
                System.out.println("Su calificación es 80");
            break;
            case "D":
                System.out.println("Su calificación es 70");
            break;
            case "F":
                System.out.println("Su calificación es 0");
            break;
            default:
                System.out.println("No corresponde con una calificación válida");
        }
    }
    
}
