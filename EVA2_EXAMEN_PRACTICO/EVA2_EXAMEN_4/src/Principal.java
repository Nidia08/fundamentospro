
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
        Scanner Leer = new Scanner (System.in);
        
        String a="_",b="_",c="_",d="_",e="_",i="_",l="_",m="_",n="_",o="_",s="_",t="_",r="_",p="_",car,brazos="---",cabeza="0",cuerpo="|",pierna="|";
        String pal="";
        int palabra = (int) (Math.random()*5)+1;
        
        int count=1, letrasPal=0, counte=0;
        
        if(palabra==1){
            letrasPal=7;//caballo
        }else if(palabra==2){
            letrasPal=4;//mesa
        }else if(palabra==3){
            letrasPal=5;//silla
        }else if(palabra==4){
            letrasPal=6;//perros
        }else if(palabra==5){
            letrasPal=7;//palabra
        }
        
       
        
        System.out.println("Tienes 5 intentos para adivinar");
        System.out.println("Porfavor ingrese todos los caracteres en minusculas");
        System.out.println("Palabras de "+ letrasPal+" letras");
        
        while(count<=5){
            System.out.println(count+".-letra: ");
            car = Leer.nextLine();
            
            if((letrasPal==7)&&(palabra==1)){
                if(car.equals("c")){
                    c=car;
                    System.out.println("Palabra de "+letrasPal+" letras "+c+" "+a+" "+b+" "+a+" "+"l"+" "+"l"+" "+o+" "+s);
                    
                    count++;
                }else if(car.equals("a")){
                    a=car;
                   System.out.println("Palabra de "+letrasPal+" letras "+c+" "+a+" "+b+" "+a+" "+"l"+" "+"l"+" "+o+" "+s);
                    
                    count++;
                }else if(car.equals("b")){
                    b=car;
                    System.out.println("Palabra de "+letrasPal+" letras "+c+" "+a+" "+b+" "+a+" "+"l"+" "+"l"+" "+o+" "+s);
                    
                    count++;
                }else if(car.equals("l")){
                    l=car;
                    System.out.println("Palabra de "+letrasPal+" letras "+c+" "+a+" "+b+" "+a+" "+"l"+" "+"l"+" "+o+" "+s);
                   
                    count++;
                }else if(car.equals("o")){
                    o=car;
                    System.out.println("Palabra de "+letrasPal+" letras "+c+" "+a+" "+b+" "+a+" "+"l"+" "+"l"+" "+o+" "+s);
                    count++;
                }else if(car.equals("s")){
                    s=car;System.out.println("Palabra de "+letrasPal+" letras "+c+" "+a+" "+b+" "+a+" "+"l"+" "+"l"+" "+o+" "+s);System.out.println("Palabra de "+letrasPal+" letras "+c+" "+a+" "+b+" "+a+" "+l+" "+l+" "+o+" "+s);
                    count++;
                }else{
                    counte++;
                    count++;
                    System.out.println("Error "+car);
                System.out.println("Palabra de "+letrasPal+" letras "+c+a+b+a+l+l+o);
                if(counte==1){
                   
                    System.out.println("  ___");
                    System.out.println(" |   |");
                    System.out.println(" |  "+cabeza);
                    System.out.println(" |   ");
                    System.out.println(" |   ");
                    System.out.println(" |   ");
                    System.out.println(" |   ");
                    System.out.println("_|________   ");
                }else if(counte==2){
                    
                    System.out.println("  ___");
                    System.out.println(" |   |");
                    System.out.println(" |   "+cabeza);
                    System.out.println(" |  "+brazos);
                    System.out.println(" |   ");
                    System.out.println(" |   ");
                    System.out.println(" |   ");
                    System.out.println("_|________   ");
                }else if(counte==3){
                    
                    System.out.println("  ___");
                    System.out.println(" |   |");
                    System.out.println(" |   "+cabeza);
                    System.out.println(" |  "+brazos);
                    System.out.println(" |   "+cuerpo);
                    System.out.println(" |   ");
                    System.out.println(" |   ");
                    System.out.println("_|________   ");
                }else if(counte==4){
                    
                    System.out.println("  ___");
                    System.out.println(" |   |");
                    System.out.println(" |   "+cabeza);
                    System.out.println(" |  "+brazos);
                    System.out.println(" |   "+cuerpo);
                    System.out.print(" |  "+pierna);
                    System.out.println(" |   ");
                    System.out.println("_|________   ");
                }else if(counte==5){
                    
                   System.out.println("  ___");
                    System.out.println(" |   |");
                    System.out.println(" |   "+cabeza);
                    System.out.println(" |  "+brazos);
                    System.out.println(" |   "+cuerpo);
                    System.out.print(" |  "+pierna);
                    System.out.println(" |   ");
                    System.out.println("_|________   ");
                }
                 
                }
            }else if(letrasPal==4){
                if(car.equals("m")){
                    m=car;
                    System.out.println("Palabra de "+letrasPal+" letras "+m+" "+e+" "+s+" "+a);
                    
                    count++;
                }else if(car.equals("e")){
                    e=car;
                   System.out.println("Palabra de "+letrasPal+" letras "+m+" "+e+" "+s+" "+a);
                    
                    count++;
                }else if(car.equals("s")){
                    s=car;
                    System.out.println("Palabra de "+letrasPal+" letras "+m+" "+e+" "+s+" "+a);
                    
                    count++;
                }else if(car.equals("a")){
                    a=car;
                    System.out.println("Palabra de "+letrasPal+" letras "+m+" "+e+" "+s+" "+a);
                   
                    count=count+2;
                }else{
                    counte++;
                   count++;
                    System.out.println("Error "+car);
                System.out.println("Palabra de "+letrasPal+" letras "+m+" "+e+" "+s+" "+a);
                if(counte==1){
                   
                    System.out.println("  ___");
                    System.out.println(" |   |");
                    System.out.println(" |   "+cabeza);
                    System.out.println(" |   ");
                    System.out.println(" |   ");
                    System.out.println(" |   ");
                    System.out.println(" |   ");
                    System.out.println("_|________   ");
                }else if(counte==2){
                    
                    System.out.println("  ___");
                    System.out.println(" |   |");
                    System.out.println(" |   "+cabeza);
                    System.out.println(" |  "+brazos);
                    System.out.println(" |   ");
                    System.out.println(" |   ");
                    System.out.println(" |   ");
                    System.out.println("_|________   ");
                }else if(counte==3){
                    
                    System.out.println("  ___");
                    System.out.println(" |   |");
                    System.out.println(" |   "+cabeza);
                    System.out.println(" |  "+brazos);
                    System.out.println(" |   "+cuerpo);
                    System.out.println(" |   ");
                    System.out.println(" |   ");
                    System.out.println("_|________   ");
                }else if(counte==4){
                    
                    System.out.println("  ___");
                    System.out.println(" |   |");
                    System.out.println(" |   "+cabeza);
                    System.out.println(" |  "+brazos);
                    System.out.println(" |   "+cuerpo);
                    System.out.print(" |  "+pierna);
                    System.out.println(" |   ");
                    System.out.println("_|________   ");
                }else if(counte==5){
                    
                   System.out.println("  ___");
                    System.out.println(" |   |");
                    System.out.println(" |   "+cabeza);
                    System.out.println(" |  "+brazos);
                    System.out.println(" |   "+cuerpo);
                    System.out.print(" |  "+pierna);
                    System.out.println(" |   ");
                    System.out.println("_|________   ");
                }
                 
                }
            }else if(letrasPal==5){
                if(car.equals("s")){
                    s=car;
                    System.out.println("Palabra de "+letrasPal+" letras "+s+" "+i+" "+l+" "+l+" "+a);
                    
                    count++;
                }else if(car.equals("i")){
                    i=car;
                   System.out.println("Palabra de "+letrasPal+" letras "+s+" "+i+" "+l+" "+l+" "+a);
                    
                    count++;
                }else if(car.equals("l")){
                    l=car;
                    System.out.println("Palabra de "+letrasPal+" letras "+s+" "+i+" "+l+" "+l+" "+a);
                    
                    count++;
                }else if(car.equals("a")){
                    a=car;
                    System.out.println("Palabra de "+letrasPal+" letras "+s+" "+i+" "+l+" "+l+" "+a);
                   
                    count++;
                }else{
                    counte++;
                    count++;
                    System.out.println("Error  "+car);
                System.out.println("Palabra de "+letrasPal+" letras "+s+" "+i+" "+l+" "+l+" "+a);
                if(counte==1){
                   
                    System.out.println("  ___");
                    System.out.println(" |   |");
                    System.out.println(" |   "+cabeza);
                    System.out.println(" |   ");
                    System.out.println(" |   ");
                    System.out.println(" |   ");
                    System.out.println(" |   ");
                    System.out.println("_|________   ");
                }else if(counte==2){
                    
                    System.out.println("  ___");
                    System.out.println(" |   |");
                    System.out.println(" |   "+cabeza);
                    System.out.println(" |  "+brazos);
                    System.out.println(" |   ");
                    System.out.println(" |   ");
                    System.out.println(" |   ");
                    System.out.println("_|________   ");
                }else if(counte==3){
                    
                    System.out.println("  ___");
                    System.out.println(" |   |");
                    System.out.println(" |   "+cabeza);
                    System.out.println(" |  "+brazos);
                    System.out.println(" |   "+cuerpo);
                    System.out.println(" |   ");
                    System.out.println(" |   ");
                    System.out.println("_|________   ");
                }else if(counte==4){
                    
                    System.out.println("  ___");
                    System.out.println(" |   |");
                    System.out.println(" |   "+cabeza);
                    System.out.println(" |  "+brazos);
                    System.out.println(" |   "+cuerpo);
                    System.out.print(" |  "+pierna);
                    System.out.println(" |   ");
                    System.out.println("_|________   ");
                }else if(counte==5){
                    
                   System.out.println("  ___");
                    System.out.println(" |   |");
                    System.out.println(" |   "+cabeza);
                    System.out.println(" |  "+brazos);
                    System.out.println(" |   "+cuerpo);
                    System.out.print(" |  "+pierna);
                    System.out.println(" |   ");
                    System.out.println("_|________   ");
                }
                
                }
            }else if(letrasPal==7){
                if(car.equals("p")){
                    p=car;
                    System.out.println("Palabra de "+letrasPal+" letras "+p+" "+a+" "+l+" "+a+" "+b+" "+r+" "+a);
                    
                    count++;
                }else if(car.equals("a")){
                    a=car;
                   System.out.println("Palabra de "+letrasPal+" letras "+p+" "+a+" "+l+" "+a+" "+b+" "+r+" "+a);
                    
                    count++;
                }else if(car.equals("l")){
                    l=car;
                    System.out.println("Palabra de "+letrasPal+" letras "+p+" "+a+" "+l+" "+a+" "+b+" "+r+" "+a);
                    
                    count++;
                }else if(car.equals("b")){
                    b=car;
                    System.out.println("Palabra de "+letrasPal+" letras "+p+" "+a+" "+l+" "+a+" "+b+" "+r+" "+a);        
                    count++;
                }else if(car.equals("r")){
                    r=car;
                    System.out.println("Palabra de "+letrasPal+" letras "+p+" "+a+" "+l+" "+a+" "+b+" "+r+" "+a);                 
                    count++;
                }else{
                    counte++;
                   count++;
                    System.out.println("Error "+car);
                System.out.println("Palabra de "+letrasPal+" letras "+p+" "+a+" "+l+" "+a+" "+b+" "+r+" "+a);
                if(counte==1){
                   
                    System.out.println("  ___");
                    System.out.println(" |   |");
                    System.out.println(" |   "+cabeza);
                    System.out.println(" |   ");
                    System.out.println(" |   ");
                    System.out.println(" |   ");
                    System.out.println(" |   ");
                    System.out.println("_|________   ");
                }else if(counte==2){
                    
                    System.out.println("  ___");
                    System.out.println(" |   |");
                    System.out.println(" |   "+cabeza);
                    System.out.println(" |  "+brazos);
                    System.out.println(" |   ");
                    System.out.println(" |   ");
                    System.out.println(" |   ");
                    System.out.println("_|________   ");
                }else if(counte==3){
                    
                    System.out.println("  ___");
                    System.out.println(" |   |");
                    System.out.println(" |   "+cabeza);
                    System.out.println(" |  "+brazos);
                    System.out.println(" |   "+cuerpo);
                    System.out.println(" |   ");
                    System.out.println(" |   ");
                    System.out.println("_|________   ");
                }else if(counte==4){
                    
                    System.out.println("  ___");
                    System.out.println(" |   |");
                    System.out.println(" |   "+cabeza);
                    System.out.println(" |  "+brazos);
                    System.out.println(" |   "+cuerpo);
                    System.out.print(" |  "+pierna);
                    System.out.println(" |   ");
                    System.out.println("_|________   ");
                }else if(counte==5){
                    
                   System.out.println("  ___");
                    System.out.println(" |   |");
                    System.out.println(" |   "+cabeza);
                    System.out.println(" |  "+brazos);
                    System.out.println(" |   "+cuerpo);
                    System.out.print(" |  "+pierna);
                    System.out.println(" |   ");
                    System.out.println("_|________   ");
                }
                 
                }
            }else if(letrasPal==6){
                if(car.equals("p")){
                    p=car;
                    System.out.println("Palabra de "+letrasPal+" letras "+p+" "+e+" "+r+" "+r+" "+o+" "+s);
                    
                    count++;
                }else if(car.equals("e")){
                    e=car;
                   System.out.println("Palabra de "+letrasPal+" letras "+p+" "+e+" "+r+" "+r+" "+o+" "+s);
                    
                    count++;
                }else if(car.equals("r")){
                    r=car;
                    System.out.println("Palabra de "+letrasPal+" letras "+p+" "+e+" "+r+" "+r+" "+o+" "+s);
                    
                    count++;
                }else if(car.equals("o")){
                    o=car;
                    System.out.println("Palabra de "+letrasPal+" letras "+p+" "+e+" "+r+" "+r+" "+o+" "+s);
                   
                    count++;
                }else if(car.equals("s")){
                    s=car;
                    System.out.println("Palabra de "+letrasPal+" letras "+p+" "+e+" "+r+" "+r+" "+o+" "+s);
                   
                    count++;
                }else{
                    counte++;
                    count++;
                    System.out.println("Error "+car);
                System.out.println("Palabra de "+letrasPal+" letras "+p+" "+e+" "+r+" "+r+" "+o+" "+s);
                if(counte==1){
                   
                    System.out.println("  ___");
                    System.out.println(" |   |");
                    System.out.println(" |   "+cabeza);
                    System.out.println(" |   ");
                    System.out.println(" |   ");
                    System.out.println(" |   ");
                    System.out.println(" |   ");
                    System.out.println("_|________   ");
                }else if(counte==2){
                    
                    System.out.println("  ___");
                    System.out.println(" |   |");
                    System.out.println(" |   "+cabeza);
                    System.out.println(" |  "+brazos);
                    System.out.println(" |   ");
                    System.out.println(" |   ");
                    System.out.println(" |   ");
                    System.out.println("_|________   ");
                }else if(counte==3){
                    
                    System.out.println("  ___");
                    System.out.println(" |   |");
                    System.out.println(" |   "+cabeza);
                    System.out.println(" |  "+brazos);
                    System.out.println(" |   "+cuerpo);
                    System.out.println(" |   ");
                    System.out.println(" |   ");
                    System.out.println("_|________   ");
                }else if(counte==4){
                    
                    System.out.println("  ___");
                    System.out.println(" |   |");
                    System.out.println(" |   "+cabeza);
                    System.out.println(" |  "+brazos);
                    System.out.println(" |   "+cuerpo);
                    System.out.print(" |  "+pierna);
                    System.out.println(" |   ");
                    System.out.println("_|________   ");
                }else if(counte==5){
                    
                   System.out.println("  ___");
                    System.out.println(" |   |");
                    System.out.println(" |   "+cabeza);
                    System.out.println(" |  "+brazos);
                    System.out.println(" |   "+cuerpo);
                    System.out.print(" |  "+pierna);
                    System.out.println(" |   ");
                    System.out.println("_|________   ");
                }
                
                }
            }
                
            
            
        }
        
                    
                        if((letrasPal==7)&&(palabra==1)){
                            if((!c.equals("_"))&&(!a.equals("_"))&&(!b.equals("_"))&&(!l.equals("_"))&&(!o.equals("_"))){
                                System.out.println("Ganaste");
                            }else{
                                System.out.println("Perdiste");
                                System.out.println("  ___");
                                System.out.println(" |   |");
                                System.out.println(" |   "+cabeza);
                                System.out.println(" |  "+brazos);
                                System.out.println(" |   "+cuerpo);
                                System.out.print(" |  "+pierna);
                                System.out.println(" |   ");
                                System.out.println("_|________   ");
                            }
                        }else if(letrasPal==4){
                            if((!m.equals("_"))&&(!e.equals("_"))&&(!s.equals("_"))&&(!a.equals("_"))){
                                System.out.println("Ganaste");
                            }else{
                                System.out.println("Perdiste");
                                System.out.println("  ___");
                                System.out.println(" |   |");
                                System.out.println(" |   "+cabeza);
                                System.out.println(" |  "+brazos);
                                System.out.println(" |   "+cuerpo);
                                System.out.print(" |  "+pierna);
                                System.out.println(" |   ");
                                System.out.println("_|________   ");
                            }
                        }else if(letrasPal==5){
                            if((!s.equals("_"))&&(!i.equals("_"))&&(!l.equals("_"))&&(!a.equals("_"))){
                                System.out.println("Ganaste");
                            }else{
                                System.out.println("Perdiste");
                                System.out.println("  ___");
                                System.out.println(" |   |");
                                System.out.println(" |   "+cabeza);
                                System.out.println(" |  "+brazos);
                                System.out.println(" |   "+cuerpo);
                                System.out.print(" |  "+pierna);
                                System.out.println(" |   ");
                                System.out.println("_|________   ");
                            }
                        }else if(letrasPal==6){
                            if((!p.equals("_"))&&(!e.equals("_"))&&(!r.equals("_"))&&(!o.equals("_"))&&(!s.equals("_"))){
                                System.out.println("Ganaste");
                            }else{
                                System.out.println("Perdiste");
                                System.out.println("  ___");
                                System.out.println(" |   |");
                                System.out.println(" |   "+cabeza);
                                System.out.println(" |  "+brazos);
                                System.out.println(" |   "+cuerpo);
                                System.out.print(" |  "+pierna);
                                System.out.println(" |   ");
                                System.out.println("_|________   ");
                            }
                        }else if(letrasPal==7){
                            if((!p.equals("_"))&&(!a.equals("_"))&&(!l.equals("_"))&&(!b.equals("_"))&&(!r.equals("_"))){
                                System.out.println("Ganaste");
                            }else{
                                System.out.println("Perdiste");
                                System.out.println("  ___");
                                System.out.println(" |   |");
                                System.out.println(" |   "+cabeza);
                                System.out.println(" |  "+brazos);
                                System.out.println(" |   "+cuerpo);
                                System.out.print(" |  "+pierna);
                                System.out.println(" |   ");
                                System.out.println("_|________   ");
                            }
                        }
                        
    }
    
}
