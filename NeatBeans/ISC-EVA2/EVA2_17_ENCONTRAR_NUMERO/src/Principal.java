import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nidia Gonzalez Morales 18550676
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);
        //0 --> 1
        //numeros enteros entre 1 y 10
        int numAle = (int) (Math.random()*10)+1;
        int x;
        //System.out.println(numAle);
        for(x=1;x<=3;x++){
            System.out.println("Adivina el número");
            int iNum = Leer.nextInt();
            if(numAle == iNum){
                System.out.println("Ganaste");
                break;
            }
        }
        if(x==4){
            System.out.println("Perdiste");
        }
    }
    
}
