
import java.util.Scanner;

/*
 *Recibir un número y devolver el nombre de mes
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
        // Recibir un número y devolver el nombre de mes
        Scanner Leer = new Scanner(System.in);
            System.out.println("Ingresa un número de mes");
            int val=Leer.nextInt();
            System.out.println("El mes es "+mes(val));
        
        System.out.println("************");
        
        //Recibir una letra y devolver la calificacion numerica
        System.out.println("Escribe la letra de la calificaión en mayúsculas");
            Leer.nextLine();
            String cal=Leer.nextLine();
            System.out.println(calificacion(cal));
        
        System.out.println("************");
        
        //Recibir una calificación y devolcer la letra
        System.out.println("Escribe la calificaión base 100");
            int calnu=Leer.nextInt();
            System.out.println(calificacionnum(calnu));
        
        System.out.println("************");
        
        //entero
        System.out.println("Ingresa un entero");
            int iVal = Leer.nextInt();
            System.out.println("El resultado de multiplicarlo por 5 y sumarle 5 es "+res(iVal));
            
        System.out.println("************");
        
        //double
        System.out.println("Ingresa un número decimal o un número entero");
            double dVal = Leer.nextDouble();
            System.out.println("El resultado de dividirlo entre 3 es "+res(dVal));
            
        System.out.println("************");
        
        //string
        System.out.println("Ingresa un texto");
            Leer.nextLine();
            String sVal = Leer.nextLine();
            System.out.println(res("Este es tu texto: ",sVal));
            
        System.out.println("************");
        
        //boolean
        System.out.println("Ingresa si o no");
            String bVal = Leer.nextLine();
            boolean ver=false,resu=false;
            if(bVal.equals("si")){
                ver=true;
                resu = res(ver);
            }else if(bVal.equals("no")){
                ver=false;
                resu = res(ver);
            }else{
                System.out.println("Valor inválido");
            }
            
            if(resu){
                System.out.println("Respuesta: si");
            }else{
                System.out.println("Respuesta: no");
            }
            
        System.out.println("************");
        
        //Numero primo
        System.out.println("Ingrese un número entero positivo");
            int num=Leer.nextInt();
            boolean resul = primo(num);
            if(resul){
                System.out.println(num+" es un número primo");
            }else{
                System.out.println(num+" no es un número primo");
            }
            
        System.out.println("************");
        
        //bisiesto
         System.out.println("Ingresa el número de un año");
            int iAnnio = Leer.nextInt();
            anniobis(iAnnio);
            
        System.out.println("************");
            
    }
    // Recibir un número y devolver el nombre de mes
    public static String mes (int Mes){
        String rMes= "";
        switch(Mes){
            //Opciones
            case 1://Primer caso --> Enero
                rMes="Enero";
            break;
            case 2:
                 rMes="Febrero";
            break;
            case 3:
                 rMes="Marzo";
            break;
            case 4:
                rMes="Abril";
            break;
            case 5:
                 rMes="Mayo";
            break;
            case 6:
                 rMes="Junio";
            break;
            case 7:
                 rMes="Julio";
            break;
            case 8:
                 rMes="Agosto";
            break;
            case 9:
                 rMes="Septiembre";
            break;
            case 10:
                 rMes="Octubre";
            break;
            case 11:
                 rMes="Noviembre";
            break;
            case 12:
                 rMes="Diciembre";
            break;
            default:
                 rMes="No corresponde con ningun mes";
            
        }
       return rMes; 
    }
    
    //Recibir una letra y devolver la calificacion numerica
    public static String calificacion(String caln){
        switch(caln){
            case "A":
                caln="Su calificación es 100";
            break;
            case "B":
                caln="Su calificación es 90";
            break;
            case "C":
                caln="Su calificación es 80";
            break;
            case "D":
                caln="Su calificación es 70";
            break;
            case "F":
                caln="Su calificación es 0";
            break;
            default:
               caln="No corresponde con una calificación válida";
        }
    return caln;
    }
    
    //Recibir una calificación y devolcer la letra
     public static String calificacionnum(int caln){
         String resu="";
        switch(caln){
            case 100:
                resu="Su calificación es A";
            break;
            case 90:
                resu="Su calificación es B";
            break;
            case 80:
                resu="Su calificación es C";
            break;
            case 70:
                resu="Su calificación es D";
            break;
            case 0:
                resu="Su calificación es F";
            break;
            default:
               resu="No corresponde con una calificación válida";
        }
    return resu;
    }
     
     //entero
     public static int res(int val){
     val=val*5+5;
         return val;
     }
     
     //double
     public static double res(double val){
     val=val/3;
         return val;
     }
     
     //string
     public static String res(String val,String cade){
        return val+cade;
     }
     
     //boolean
     public static boolean res(boolean val){
     if(val){
         val=false;
     }else{
         val=true;
     }
         return val;
     }
     
     //primos
     public static boolean primo(int val){
         int con=2;
        boolean primo=true; 
     while((primo)&&(con<(val/2))){
                con++;
                if((val%con)==0){
                   primo=false;
               }
            }
         return primo;
     }
     
     //bisiesto
     public static void  anniobis  (int val){
         String respues = "";
     if((val%4==0)&&(val%100!=0)){
            respues=(" es año bisisesto");
        }else{
            if((val%100==0)&&(val%400==0)){
                respues=(" es año bisisesto");
            }else{
                respues=(" no es año bisiesto");
            }
        }
            System.out.println(val+respues);
    }
}
