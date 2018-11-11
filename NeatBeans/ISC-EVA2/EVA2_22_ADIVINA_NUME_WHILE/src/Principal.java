
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Nidia González Morales 18550676
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);
        
        int numA = (int) (Math.random()*10)+1;
        int num=0;
        System.out.println(numA);
        while(!(num==numA)){
            System.out.println("Adivina el número");
            num=Leer.nextInt();
        }
    }
    
}
