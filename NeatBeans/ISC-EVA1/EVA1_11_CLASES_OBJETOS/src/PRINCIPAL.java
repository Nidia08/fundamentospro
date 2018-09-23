/*
 *Demostración de programación orientada a objetos
 */

/**
 *
 * @author Nidia González Morales 18550676
 */
import Nombre.Principal2;
import java.util.Scanner;

public class PRINCIPAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);
        int iVal = 10;
        Ejemplo eMiObjetoEjemplo;
        eMiObjetoEjemplo = new Ejemplo();
        
        Ejemplo eObj2 = new Ejemplo();
        
        Ejemplo eObj3;
        
        
        Principal2 otroObjeto = new Principal2();
    }
    
}
//TIPOS ABSTRACTOS DE DATOS
class Ejemplo{//CATEGORIAS
    int iVal = 10;
}
