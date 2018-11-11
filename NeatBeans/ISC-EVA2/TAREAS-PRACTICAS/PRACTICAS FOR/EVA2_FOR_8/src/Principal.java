/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Nidia Gonzalez MOrales 18550676
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numAle;
        for(int x=1;x<=20;x++){
            numAle = (int) (Math.random()*100)+1;
            System.out.println(x+".-"+numAle);
        }
        
    }
    
}
