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
        //for: no manipulamos la variable contador 
        //deteneremos cuando encontremos un numero divisible entre 5
        for(int x=1;x<=10;x++){
            System.out.println(x);
            if(x%5==0){
                break;//Interrumpe la lógica del programa
            }
        }
        //continue
        //imprimir los números que no sean divisibles entre 5
        int i;
        for(i=1;i<=10;i++){
            int iResi =i%5; 
            if(iResi==0){
                continue;
            }
             System.out.println(i);
        }
    }
    
}
