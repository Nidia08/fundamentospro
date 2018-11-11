
import java.util.Scanner;

/*
 * primos usuario da un número decir si es primo 
 */

/**
 *
 * Nidia Gonzalez Morales 18550676
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner (System.in);
        
        System.out.println("Ingrese un número entero positivo");
        int num = Leer.nextInt();
        boolean primo=true;
        for(int x=2;x<num;x++){//No es necesario llegar hasta el numero (Llegar hasta la raiz del numero)
            //residuo
           if((num%x)==0){
               primo=false;
               break;
           }
        }
        
        if(primo){
            System.out.println(num+" es un número primo");
        }else{
            System.out.println(num+" no es un número primo");
        }
        
    }
    
}
