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
        //stack --> Memoria estatica 
            //variables primitivas 
            //llamadas a función
        //heap --> memoria dinamica
        System.out.println("Inicia Main");
        A();
        System.out.println("Termina Main");
        
    }
    public static void A(){
        System.out.println("Inicia A");
        B();
        System.out.println("Termina A");
    }
    public static void B(){
        System.out.println("Inicia B");
        C();
        System.out.println("Termina B");
    }
    public static void C(){
        System.out.println("Inicia C");
        System.out.println("Termina C");
        int iDiv = 1/0;
    }
}
