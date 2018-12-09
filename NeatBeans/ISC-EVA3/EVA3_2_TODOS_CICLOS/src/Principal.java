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
        //Contar del 1 al 100 y del 100 al 1
        int con=1,icon=100,j=0,h=101;
        System.out.println("Ciclo for");
        System.out.println("*****");
        for(int x=1;x<=100;x++){
            System.out.print(x+" ");
        }
        System.out.println("");
        for(int i=100;i>=1;i--){
            System.out.print(i+" ");
        }
        System.out.println("\n*****");
        System.out.println("Ciclo while");
        System.out.println("*****");
        
        while(con<=100){
            System.out.print(con+" ");
            con++;
        }
        System.out.println("");
        while(icon>=1){
            System.out.print(icon+" ");
            icon--;
        }
        System.out.println("\n*****");
        System.out.println("Ciclo do while");
        System.out.println("*****");
        do{
            j++;
            System.out.print(j+" ");
            
        }while(j<100);
        System.out.println("");
        do{
            h--;
            System.out.print(h+" ");
            
        }while(h>1);
    }
    
}
