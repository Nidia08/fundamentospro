/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author NIDIA
 */
public class Principal {
 private static Scanner input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introducir Velocidad inicial");


        double Vloi;   
        Vloi = input.nextDouble();
        System.out.println("Introducir Velocidad final");

        double Vlof;
        Vlof = input.nextDouble();
        System.out.println("Introducir Tiempo");

        double TM;
        TM = input.nextDouble();
        System.out.println("Radio de en Metros");

        int RD;
        RD = input.nextInt();

        double AN;
        AN = (Vlof - Vloi) * TM;

        double MET;
        MET = (double) 2 * 3.1416 * RD / TM;

        double VLW;
        VLW = Vloi * Vlof / 2;

        double VMS;
        VMS = (Vloi * RD - Vlof * RD) / TM;

        double ANG;
        ANG = Vloi * Vlof / TM;

        double ACM;
        ACM = (Vlof * RD - Vloi * RD) / TM;

        double FR;
        FR = (double) 2 * 3.1416 / (Vlof - Vloi);

        System.out.println("Resultados:");

        System.out.println("Distancia Angular");
        System.out.println(AN);

        System.out.println("Distancia en Metros");
        System.out.println(MET);

        System.out.println("Distancia Angular Promedio");
        System.out.println(VLW);

        System.out.println("Velocidad Promedio en Metros ");
        System.out.println(VMS);

        System.out.println("Aceleracion Angular");
        System.out.println(ANG);

        System.out.println("Aceleracion en Metros");
        System.out.println(ACM);

        System.out.println("Frecuencia");
        System.out.println(FR);
    }
    
}
