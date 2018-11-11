
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
        int num;
        System.out.println("Ingrese un númeor entero");
            num = Leer.nextInt();
        for(int x=1;x<=100;x++){
            if(x%num!=0){
                System.out.println(x);
            }
        }
    }
    
}
