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
        int iVal=5;
        int iRes = calcularFactorial(iVal);
        System.out.println("El resultado es "+iRes);
    }
    public static int calcularFactorial(int iVal){
        int iRes=1;
        
        for(int x = iVal; x>=1; x--){
            iRes *= x;
        }
        return iRes;
    }
}
