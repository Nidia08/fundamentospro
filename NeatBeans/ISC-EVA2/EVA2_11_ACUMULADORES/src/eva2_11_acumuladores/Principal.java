/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_11_acumuladores;



/**
 *
 * @author Nidia González Morales 18550676
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //ACUMULADOR
        int sum = 0; //PUNTO DE PARTIDA
            System.out.println("Valor de suma "+sum);
            sum = sum + 10;
            System.out.println("Valor de suma "+sum);
            sum = sum + 10;
            System.out.println("Valor de suma "+sum);
            sum += 10; //+= OPERADOR DE INCREMENTO
            System.out.println("Valor de suma "+sum);
            
            //MULTIPLICACION
            int mult = 1;
            System.out.println("Valor de multiplicación "+mult);
            mult=mult*5;
            System.out.println("Valor de multiplicación "+mult);
            mult *= 5;
            System.out.println("Valor de multiplicación "+mult);
            
            //RESTA
            int res = 100;
            System.out.println("Valor de resta "+res);
            res=res - 5;
            System.out.println("Valor de resta "+res);
            res -= 5;
            System.out.println("Valor de resta "+res);
            
            //CONTADOR:
            //TIPO ESPECIAL DE ACUMULADOR
            
            int con = 0;
            System.out.println("Valor de contador "+con);
            con = con+1;
            System.out.println("Valor de contador "+con);
            con += 1;//INCREMENTA EN CUALQUIER VALOR
            System.out.println("Valor de contador "+con);
            con ++; //SOLO INCREMENTA EN 1
            System.out.println("Valor de contador "+con);
            con--;
            System.out.println("Valor de contador "+con);
            
            String cade = "Hola";
            System.out.println(cade);
            cade = cade + " mundo"; //CONCATENACIÓN
            System.out.println(cade);
            
            //CON++ --> SE APLICA DESPUÉS
            //++CON --> SE APLICA AL MOMENTO
            System.out.println("Valor de contador "+con);
            System.out.println("Valor de contador "+(con++));
            System.out.println("Valor de contador "+(++con));
            
    }
    
}
