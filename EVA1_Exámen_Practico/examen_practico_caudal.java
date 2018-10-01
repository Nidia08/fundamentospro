/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caudal;

import java.util.Scanner;

/**
 *
 * @author odm 66945
 */
public class Caudal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("introduce el radio de la tuveria");
        double radio;
        
        radio = input.nextDouble();
        double area;
        
        area = Math.pow(radio, 2) * 3.1416;
        System.out.print("El area de la tuveria es ");
        System.out.println(area);
        System.out.println("introduce la velocidad del fluido en m/s");
        double vel;
        
        vel = input.nextDouble();
        double caudal;
        
        caudal = (vel * area) / 3600;
        System.out.print("El caudal es ");
        System.out.println(caudal);
        System.out.println("m^3");
        
    }
    
}
