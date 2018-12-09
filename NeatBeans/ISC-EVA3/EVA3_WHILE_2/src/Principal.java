
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner (System.in);
        String user = "Nidia";
        String pass = "123";
        int iCon=0;
        boolean enter=false;
        
        while((iCon<=2)&&(!enter)){
            System.out.println("Usuario");
                String us = Leer.nextLine();
            System.out.println("Contraseña");
                String con = Leer.nextLine();
            if((us.equals(user))&&(con.equals(pass))){
                iCon ++;
                enter=true;
            }else{
                System.out.println("Datos incorrectos");
                iCon ++;
            }
                
        }
        
        if(enter){
            System.out.println("Bienvenido");
        }else{
            System.out.println("Acceso denegado");
        }
        
    }
    
}
