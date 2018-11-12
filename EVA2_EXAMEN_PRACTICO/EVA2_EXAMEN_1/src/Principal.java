
import java.util.Random;
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
        /*
        1: piedra
        2: papel
        3: tijera
         */
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        int rondas = 1, maximasRondas;
        int victoriasU = 0, victoriasM = 0, empates = 0;
        int opcionUsuario = 4, opcionMaquina;

        System.out.println("======================");
        System.out.println("piedra: 1");
        System.out.println("papel: 2");
        System.out.println("tijeras: 3");
        System.out.println("======================");
        System.out.println("antes de iniciar, cuantas rondas quieres jugar?");
        maximasRondas = sc.nextInt();
        while (true) {
            System.out.println("======================");
            System.out.println("Ronda              #"+rondas);
            System.out.println("======================");
            System.out.print("Elige:");
            do {
                System.out.print("Elige:");
                opcionUsuario = sc.nextInt();
            } while(opcionUsuario>3);
            opcionMaquina = rn.nextInt(3) + 1;
            System.out.println("su oponente eligio "+opcionMaquina);
            if(opcionUsuario==3) {
                if (opcionMaquina==1) {
                    System.out.println("perdiste :(");
                    victoriasM++;
                } else if(opcionMaquina==2){
                    System.out.println("ganaste :D");
                    victoriasU++;
                } else {
                    System.out.println("empate (ง'̀-'́)ง");
                    empates++;
                }
            } else {
                if(opcionUsuario>opcionMaquina) {
                    System.out.println("ganaste :D");
                    victoriasU++;
                } else if(opcionUsuario<opcionMaquina){
                    System.out.println("perdiste :(");
                    victoriasM++;
                } else {
                    System.out.println("empate (ง'̀-'́)ง");
                    empates++;
                }
            }

            if(rondas == maximasRondas) {
                System.out.println("======================");
                System.out.println("la partida ha terminado");
                System.out.println("======================");
                break;
            } else {
                rondas++;
            }
        }
        System.out.println();
        System.out.println("======================");
        System.out.println("La computadora gano " + victoriasM + " juego/s");
        System.out.println("Ganaste " + victoriasU + " juego/s");
        System.out.println("Hubo " + empates + " empate/s");
        System.out.println("======================");
    }
    
}
