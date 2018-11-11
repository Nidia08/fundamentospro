/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Nidia Gonzalez Morales 1855676
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int x=1;x<=10;x++){
            for(int j=1;j<=x;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=9;i>=1;i--){
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
