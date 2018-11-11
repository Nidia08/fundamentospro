/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_4_nested_if_2;

/**
 *
 * @author Nidia Gonzalez Morales 18550676
 */
public class EVA2_4_NESTED_IF_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int iCal=77;
        
        if(iCal==100){
            System.out.println("A");
        }else if((iCal<100)&&(iCal>=90)){
            System.out.println("B");
        }else if((iCal<90)&&(iCal>=80)){
            System.out.println("C");
        }else if((iCal<80)&&(iCal>=70)){
            System.out.println("D");
        }else if((iCal<70)&&(iCal>0)){
            System.out.println("F");
        }else{
            System.out.println("Calificación fuera de rango");
        }
    }
    
}
