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
        //1..10
        //lista de combinaciones posibles
        //1,1   1,2   1,3
        int icon=0;
        for(int x=1;x<=10;x++){
            for(int j=1;j<=10;j++){
                icon++;
                System.out.println(x+","+j);
            }
        }
        System.out.println(icon);
    }
    
}
