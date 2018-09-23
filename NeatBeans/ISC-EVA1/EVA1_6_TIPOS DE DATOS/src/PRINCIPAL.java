
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author NIDIA GONZALEZ MORALES 18550676
 */
public class PRINCIPAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Introduce tu nombre");
        String sNombre;//DECLARANDO
        Scanner Leer;//DECLARANDO
        //SCANNER ES UNA CLASE, PARA USAR CLASES
        //SE HACE ATRAVÉS DE OBJETOS, Y LOS OBJETOS
        //SE CREAN CON LA PALABRA new
        Leer = new Scanner (System.in); 
        
        //Scanner leer = new Scanner (System.in);
        //int iVal = 10;
        
        sNombre = Leer.nextLine();//CUANDO DA ENTER
        
        System.out.println("Tu nombre es " + sNombre);//CONECTAMOS CADENAS "TEXTO"
    }
    
}
