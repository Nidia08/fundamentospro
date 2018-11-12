
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NIDIA
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);
        
        String a=" ",b=" ",c=" ",d=" ",e=" ",f=" ",g=" ",h=" ",i=" ",pos="";
        
        int s=0,gan=0,cordiprincipal=0,cordi1=0,cordi2=0,cor=0,imprimir=0;
        
        int start = (int) (Math.random()*6)+1;
        
        System.out.println("Porfavor ingresa los caracteres en minusculas\nElige la posición como se muestra acontinuación\nEjemplo:");
        System.out.println("a"+" | "+"b"+" | "+"c");
        System.out.println("");
        System.out.println("d"+" | "+"e"+" | "+"f");
        System.out.println("");
        System.out.println("g"+" | "+"h"+" | "+"i");
        System.out.println("   Caracter: \n   x\n   Posición\n   e");
        System.out.println("Obtendrá:");
        System.out.println("a"+" | "+"b"+" | "+"c");
        System.out.println("");
        System.out.println("d"+" | "+"x"+" | "+"f");
        System.out.println("");
        System.out.println("g"+" | "+"h"+" | "+"i");
        
        if(start<=3){
            cordiprincipal=0;
        }else{
            cordiprincipal=1;
        }
        
        System.out.println("*******************");
        System.out.println("*Comienza el juego*");
        System.out.println("*******************\n");
       
        while((cordi2==0)&&(s==0)&&(gan==0)){
            
        while((cordiprincipal==0)&&(gan==0)&&(s==0)){
            imprimir=0;
            System.out.println("Ingrese la posición (s para salir): ");
            pos = Leer.nextLine();
           switch(pos){
               case "s":
                   s=1;
                break;
               case "a":
                    a="x";
                    System.out.println(a+" | "+b+" | "+c);
                    System.out.println("");
                    System.out.println(d+" | "+e+" | "+f);
                    System.out.println("");
                    System.out.println(g+" | "+h+" | "+i);
                    cordiprincipal=1;
               break;
               case "b":
                   b="x";
                    System.out.println(a+" | "+b+" | "+c);
                    System.out.println("");
                    System.out.println(d+" | "+e+" | "+f);
                    System.out.println("");
                    System.out.println(g+" | "+h+" | "+i);
                    cordiprincipal=1;
               break;
               case "c":
                   c="x";
                   System.out.println(a+" | "+b+" | "+c);
                    System.out.println("");
                    System.out.println(d+" | "+e+" | "+f);
                    System.out.println("");
                    System.out.println(g+" | "+h+" | "+i);
                   cordiprincipal=1;
               break;
               case "d":
                   d="x";
                   System.out.println(a+" | "+b+" | "+c);
                    System.out.println("");
                    System.out.println(d+" | "+e+" | "+f);
                    System.out.println("");
                    System.out.println(g+" | "+h+" | "+i);
                   cordiprincipal=1;
               break;
               case "e":
                   e="x";
                   System.out.println(a+" | "+b+" | "+c);
                    System.out.println("");
                    System.out.println(d+" | "+e+" | "+f);
                    System.out.println("");
                    System.out.println(g+" | "+h+" | "+i);
                   cordiprincipal=1;
               break;
               case "f":
                   f="x";
                   System.out.println(a+" | "+b+" | "+c);
                    System.out.println("");
                    System.out.println(d+" | "+e+" | "+f);
                    System.out.println("");
                    System.out.println(g+" | "+h+" | "+i);
                   cordiprincipal=1;
               break;
               case "g":
                   g="x";
                   System.out.println(a+" | "+b+" | "+c);
                    System.out.println("");
                    System.out.println(d+" | "+e+" | "+f);
                    System.out.println("");
                    System.out.println(g+" | "+h+" | "+i);
                   cordiprincipal=1;
               break;
               case "h":
                   h="x";
                   System.out.println(a+" | "+b+" | "+c);
                    System.out.println("");
                    System.out.println(d+" | "+e+" | "+f);
                    System.out.println("");
                    System.out.println(g+" | "+h+" | "+i);
                   cordiprincipal=1;
               break;
               case "i":
                   i="x";
                   System.out.println(a+" | "+b+" | "+c);
                    System.out.println("");
                    System.out.println(d+" | "+e+" | "+f);
                    System.out.println("");
                    System.out.println(g+" | "+h+" | "+i);
                   cordiprincipal=1;
               break;
               default:
                   System.out.println("Caracter invalido");
                   cordiprincipal=0;
           }
           
     if(a.equals(b)&&b.equals(c)&&a.equals("x")){
            System.out.println("Ganaste");
            gan=1;
            imprimir=1;
        }else if(a.equals(d)&&d.equals(g)&&a.equals("x")){
            System.out.println("Ganaste");
            gan=1;
            imprimir=1;
        }else if(g.equals(h)&&h.equals(i)&&g.equals("x")){
            System.out.println("Ganaste");
            gan=1;
            imprimir=1;
        }else if(c.equals(f)&&f.equals(i)&&c.equals("x")){
            System.out.println("Ganaste");
            gan=1;
            imprimir=1;
        }else if(a.equals(e)&&e.equals(i)&&a.equals("x")){
            System.out.println("Ganaste");
            gan=1;
            imprimir=1;
        }else if(c.equals(e)&&e.equals(g)&&c.equals("x")){
            System.out.println("Ganaste");
            gan=1;
            imprimir=1;
        }else if(b.equals(e)&&e.equals(h)&&b.equals("x")){
                 System.out.println("Ganaste");
                 gan=1;
                 imprimir=1;
        }else if((d.equals(e))&&(e.equals(f))&&(d.equals("x"))){
                 System.out.println("Ganaste");
                 gan=1;
                 imprimir=1;
        }else if(a.equals(b)&&b.equals(c)&&a.equals("o")){
            System.out.println("Perdiste");
            gan=1;
            imprimir=1;
        }else if(a.equals(d)&&d.equals(g)&&a.equals("o")){
            System.out.println("Perdiste");
            gan=1;
            imprimir=1;
        }else if(g.equals(h)&&h.equals(i)&&g.equals("o")){
            System.out.println("Perdiste");
            gan=1;
            imprimir=1;
        }else if(c.equals(f)&&f.equals(i)&&c.equals("o")){
            System.out.println("Perdiste");
            gan=1;
            imprimir=1;
        }else if(a.equals(e)&&e.equals(i)&&a.equals("o")){
            System.out.println("Perdiste");
            gan=1;
            imprimir=1;
        }else if(c.equals(e)&&e.equals(g)&&c.equals("o")){
            System.out.println("Perdiste");
            gan=1;
            imprimir=1;
        }else if(b.equals(e)&&e.equals(h)&&b.equals("o")){
                 System.out.println("Perdiste");
                 gan=1;
                 imprimir=1;
        }else if((d.equals(e))&&(e.equals(f))&&(d.equals("0"))){
                 System.out.println("Perdiste");
                 gan=1;
                 imprimir=1;
        }else if(!(a.equals(" "))&&!(b.equals(" "))&&!(c.equals(" "))&&!(d.equals(" "))&&!(e.equals(" "))&&!(f.equals(" "))&&!(g.equals(" "))&&!(h.equals(" "))&&!(i.equals(" "))){
                 System.out.println("No hubo ganadores");
                 s=1;
        }
        
        
        }
        
          if((imprimir==0)&&(cordiprincipal==1)){
            System.out.println("***********************");
            System.out.println("*La computadora eligió*");
            System.out.println("***********************");
            
        }   
          
        
            while(cordi1==0){
                cor = (int) (Math.random()*9)+1;
                cordi1=1;
            }
           
             
            while((cordiprincipal==1)&&(gan==0)&&(s==0)&&(cordi1==1)){   
            imprimir=1;
             switch(cor){
               case 1:
                  
                  if(a.equals(" ")&&(!a.equals("x"))){
                    a="o";
                    System.out.println(a+" | "+b+" | "+c);
                    System.out.println("");
                    System.out.println(d+" | "+e+" | "+f);
                    System.out.println("");
                    System.out.println(g+" | "+h+" | "+i);
                    cordiprincipal=0;
                  }else{
                      cordiprincipal=1;
                      cordi1=0;
                  }
                    
               break;
               case 2:
                   
                  if(b.equals(" ")&&(!b.equals("x"))){
                    b="o";
                    System.out.println(a+" | "+b+" | "+c);
                    System.out.println("");
                    System.out.println(d+" | "+e+" | "+f);
                    System.out.println("");
                    System.out.println(g+" | "+h+" | "+i);
                    cordiprincipal=0;
                     }else{
                      cordiprincipal=1;
                      cordi1=0;
                  }
                    
               break;
               case 3:
                   
                   if(c.equals(" ")&&(!c.equals("x"))){
                    c="o";
                    System.out.println(a+" | "+b+" | "+c);
                    System.out.println("");
                    System.out.println(d+" | "+e+" | "+f);
                    System.out.println("");
                    System.out.println(g+" | "+h+" | "+i);
                    cordiprincipal=0;
                  }else{
                       cordiprincipal=1;
                      cordi1=0;
                   }
                   
               break;
               case 4:
                   
                   if(d.equals(" ")&&(!d.equals("x"))){
                    d="o";
                    System.out.println(a+" | "+b+" | "+c);
                    System.out.println("");
                    System.out.println(d+" | "+e+" | "+f);
                    System.out.println("");
                    System.out.println(g+" | "+h+" | "+i);
                   cordiprincipal=0;
                  }else{
                       cordiprincipal=1;
                      cordi1=0;
                   }
                   
               break;
               case 5:
                   
                   if(e.equals(" ")&&(!e.equals("x"))){
                    e="o";
                    System.out.println(a+" | "+b+" | "+c);
                    System.out.println("");
                    System.out.println(d+" | "+e+" | "+f);
                    System.out.println("");
                    System.out.println(g+" | "+h+" | "+i);
                    cordiprincipal=0;
                  }else{
                       cordiprincipal=1;
                       cordi1=0;
                   }
                   
               break;
               case 6:
                   
                   if(f.equals(" ")&&(!f.equals("x"))){
                    f="o";
                    System.out.println(a+" | "+b+" | "+c);
                    System.out.println("");
                    System.out.println(d+" | "+e+" | "+f);
                    System.out.println("");
                    System.out.println(g+" | "+h+" | "+i);
                   cordiprincipal=0;
                  }else{
                       cordiprincipal=1;
                      cordi1=0;
                   }
                   
               break;
               case 7:
                   
                   if(g.equals(" ")&&(!g.equals("x"))){
                    g="o";
                    System.out.println(a+" | "+b+" | "+c);
                    System.out.println("");
                    System.out.println(d+" | "+e+" | "+f);
                    System.out.println("");
                    System.out.println(g+" | "+h+" | "+i);
                   cordiprincipal=0;
                  }else{
                       cordiprincipal=1;
                      cordi1=0;
                   }
                   
               break;
               case 8:
                  
                   if(h.equals(" ")&&(!h.equals("x"))){
                    h="o";
                    System.out.println(a+" | "+b+" | "+c);
                    System.out.println("");
                    System.out.println(d+" | "+e+" | "+f);
                    System.out.println("");
                    System.out.println(g+" | "+h+" | "+i);
                    cordiprincipal=0;
                  }else{
                       cordiprincipal=1;
                      cordi1=0;
                   }
                   
               break;
               case 9:
                   
                   if(i.equals(" ")&&(!i.equals("x"))){
                    i="o";
                    System.out.println(a+" | "+b+" | "+c);
                    System.out.println("");
                    System.out.println(d+" | "+e+" | "+f);
                    System.out.println("");
                    System.out.println(g+" | "+h+" | "+i);
                    cordiprincipal=0;
                  }else{
                       cordiprincipal=1;
                      cordi1=0;
                   }
                   
               break;
           }
             
             if(a.equals(b)&&b.equals(c)&&a.equals("x")){
            System.out.println("Ganaste");
            gan=1;
        }else if(a.equals(d)&&d.equals(g)&&a.equals("x")){
            System.out.println("Ganaste");
            gan=1;
        }else if(g.equals(h)&&h.equals(i)&&g.equals("x")){
            System.out.println("Ganaste");
            gan=1;
        }else if(c.equals(f)&&f.equals(i)&&c.equals("x")){
            System.out.println("Ganaste");
            gan=1;
        }else if(a.equals(e)&&e.equals(i)&&a.equals("x")){
            System.out.println("Ganaste");
            gan=1;
        }else if(c.equals(e)&&e.equals(g)&&c.equals("x")){
            System.out.println("Ganaste");
            gan=1;
        }else if(b.equals(e)&&e.equals(h)&&b.equals("x")){
                 System.out.println("Ganaste");
                 gan=1;
        }else if((d.equals(e))&&(e.equals(f))&&(d.equals("x"))){
                 System.out.println("Ganaste");
                 gan=1;
        }else if(a.equals(b)&&b.equals(c)&&a.equals("o")){
            System.out.println("Perdiste");
            gan=1;
        }else if(a.equals(d)&&d.equals(g)&&a.equals("o")){
            System.out.println("Perdiste");
            gan=1;
        }else if(g.equals(h)&&h.equals(i)&&g.equals("o")){
            System.out.println("Perdiste");
            gan=1;
        }else if(c.equals(f)&&f.equals(i)&&c.equals("o")){
            System.out.println("Perdiste");
            gan=1;
        }else if(a.equals(e)&&e.equals(i)&&a.equals("o")){
            System.out.println("Perdiste");
            gan=1;
        }else if(c.equals(e)&&e.equals(g)&&c.equals("o")){
            System.out.println("Perdiste");
            gan=1;
        }else if(b.equals(e)&&e.equals(h)&&b.equals("o")){
                 System.out.println("Perdiste");
                 gan=1;
        }else if((d.equals(e))&&(e.equals(f))&&(d.equals("o"))){
                 System.out.println("Perdiste");
                 gan=1;
        }else if(!(a.equals(" "))&&!(b.equals(" "))&&!(c.equals(" "))&&!(d.equals(" "))&&!(e.equals(" "))&&!(f.equals(" "))&&!(g.equals(" "))&&!(h.equals(" "))&&!(i.equals(" "))){
                 System.out.println("No hubo ganadores");
                 s=1;
        }
        }
        
    }
    }
}
