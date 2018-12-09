
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Nidia González Morales
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);
        
        double pi=0,aba=3.0;
        int seg=1,count=1;
        double form=(1-(1.0/aba));
        boolean signo=true;
        
        do{
            for(int x=1;x<=count;x++){
                if(x==1){
                    pi=4*form;
                }else{
                    if(signo){
                        aba=aba+2.0;
                        pi=4*(form+(1.0/aba));
                        form=form+(1.0/aba);
                        signo=false;
                        break;
                    }else{
                        aba=aba+2.0;
                        pi=4*(form-(1.0/aba));
                        form=form-(1.0/aba);
                        signo=true;
                        break;
                    }
                }
            }
           
            System.out.println("Valor de pi: "+pi);
            /*System.out.println("¿Desea continuar?");
            seg=Leer.nextInt();*/
            count++;
        }while(pi!=3.141699984275317);
    }
}
