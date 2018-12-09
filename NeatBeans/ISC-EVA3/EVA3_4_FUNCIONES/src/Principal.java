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
    public static void main(String[] args) {
        //PARA USAR LA FUNCION --> LLAMADA A FUNCION
        Principal mObjeto = new Principal();
        mObjeto.imprimeMensaje("hola");
        Math.random();
    }
    //PARADIGMAS DE PROGRAMACION:
    // PROGRAMACION ESTRUCTURADA
    //PROGRAMACION MODULAR, ORIENTADA A OBJETOS
    //ORIENTA A EVENTOS, LOGICA, FUNCIONAL
    
    //OOP
    //publico privado protegido default
    //nivel de acceso valor de retorno nombre de la funcion (argumentos)
    //{cuerpo de la funcion}
    //funciones --> Regresan valor
    //Procedimietnos --> no regresan nada
     void imprimeMensaje(String mensaje){
        System.out.println("Hola "+mensaje);
    }
}
