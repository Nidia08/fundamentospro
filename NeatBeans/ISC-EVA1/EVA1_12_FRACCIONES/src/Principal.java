/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NIDIA
 */
import java.util.Scanner;
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);
        
        int n1,n2,d1,d2;
        
        System.out.println("Numerador");
        n1 = Leer.nextInt();
        
        System.out.println("Denominador");
        d1 = Leer.nextInt();
        
        System.out.println("Numerador dos");
        n2 = Leer.nextInt();
        
        System.out.println("Denominador dos");
        d2 = Leer.nextInt();
        
        if(d1==d2){
            int sF = n1+n2;
            System.out.println("La suma de la fracción es " + sF + "/"+d2);
        }else{
            int sD = d1*d2;
            int sDF = n1*d2;
            int sDF1 = n2*d1;
            int sT = sDF + sDF1;
            System.out.println("La suma de la fracción es "+ sT +"/"+sD);
        }
        if(d1==d2){
            int sF = n1+n2;
            System.out.println("La resta de la fracción es " + sF + "/"+d2);
        }else{
            int sD = d1*d2;
            int sDF = n1*d2;
            int sDF1 = n2*d1;
            int sT = sDF - sDF1;
            System.out.println("La resta de la fracción es "+ sT +"/"+sD);
        }
        
        int mN = n1*n2;
        int mD = d1*d2;
        System.out.println("La multiplicación de la fracción es "+mN+"/"+mD);
        
        int dA = n1*d2;
        int dB = d1*n2;
        
        System.out.println("La división de la fracción es "+dA+"/"+dB);
    }
    
}
