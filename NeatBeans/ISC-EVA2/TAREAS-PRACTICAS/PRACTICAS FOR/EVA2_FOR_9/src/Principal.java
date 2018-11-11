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
        int sum = 0,icon=0;
  
        for(int x=1;x<=100;x++){
            System.out.print(x +" ");
            sum+=x;
        }
        System.out.println("");
        System.out.print("El resultado de la sumatoria = ");
        for(int j=1;j<=100;j++){
           
            icon ++;
            if(icon==100){
                System.out.print(j+" = "+sum);
                break;
            }else{
                System.out.print(j +" + "); 
            }
        }
        //System.out.println(sum);
    }
    
}
