/*
 * 
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
        Scanner Leer = new Scanner(System.in);
        
        System.out.println("Escribe un número");
            int iDia = Leer.nextInt();
            
        switch(iDia){
            case 1:
                System.out.println("Domingo");
            break;
            case 2:
                System.out.println("Lunes");
            break;
            case 3:
                System.out.println("Martes");
            break;
            case 4:
                System.out.println("Miercoles");
            break;
            case 5:
                System.out.println("Jueves");
            break;
            case 6:
                System.out.println("Viernes");
            break;
            case 7:
                System.out.println("Sábado");
            break;
            default:
                System.out.println("No corresponde a un día de la semana");
        }
            
    }
    
}
