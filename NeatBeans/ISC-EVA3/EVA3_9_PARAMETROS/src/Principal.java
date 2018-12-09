/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 *
 * Nidia González Morales 18550676
 */
public class Principal { //CLASE -> TIPO DE DATO ABSTRACTO

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(new Principal());
        Principal pObjeto = new Principal();
        System.out.println(pObjeto);
        UnaClase ucObjeto2 = new UnaClase();
        System.out.println(ucObjeto2);
        //
        int iValor = 5;
        incrementa(iValor);
        System.out.println("El valor es " + iValor);
        
        Valor vObjeto = new Valor();
        vObjeto.iValor = 5;
        incrementa(vObjeto);
        System.out.println("El valor 2 es "+vObjeto.iValor);
    }
    public static void incrementa(int iVal){
        iVal++;
    }
    
    public static void incrementa(Valor vVal){
        vVal.iValor++;
    }
}

class UnaClase{}

class Valor{
    int iValor;
}
