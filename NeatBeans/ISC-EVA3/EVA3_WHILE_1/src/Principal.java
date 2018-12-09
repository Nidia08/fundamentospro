
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
        Scanner Leer = new Scanner (System.in);
        int sum = 0, sumd=0, i=0,numU,numC;
        
        numU = (int) (Math.random()*14+1);
        sum += numU;
        System.out.println(numU);
        
        numC = (int) (Math.random()*14+1);
        sumd += numC;
        
       while ((sum<=21)&&(sumd<=21)&&(i==0)){
            System.out.println("¿Quieres una carta?");
                String res = Leer.nextLine();
                if (res.equals("si")){
                    numU = (int) (Math.random()*14+1);
                    System.out.println(numU);
                    sum += numU;
                    numC = (int) (Math.random()*14+1);
                    sumd += numC;
                }else{
                    i=1;
                }
        }
       
       if(sum>21){
           System.out.println("Perdiste");
       }else if(sumd>21){
           System.out.println("Ganaste");
       }else if(sum>sumd){
           System.out.println("Ganaste");
       }else if(sumd>sum){
           System.out.println("Perdiste");
       }
       
    }
    
}
