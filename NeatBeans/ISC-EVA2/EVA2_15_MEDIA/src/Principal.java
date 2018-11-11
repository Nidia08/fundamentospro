
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        Scanner Leer = new Scanner(System.in);
        int x=0,sum=0;
        double med;
        for(x=1;x<=5;x++){
            System.out.println("Ingresa la edad "+x);
            sum += Leer.nextInt();
        }
        med = (float)sum/5;
        System.out.println("La media es "+med);
    }
    
}
