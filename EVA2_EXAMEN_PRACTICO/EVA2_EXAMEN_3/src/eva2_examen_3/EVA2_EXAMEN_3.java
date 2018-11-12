/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_examen_3;

import java.util.Scanner;

/**
 *
 * @author FamFG
 */
public class EVA2_EXAMEN_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        boolean bSi;
        
        System.out.println("Conteste true o false a las siguientes preguntas");
        System.out.println("¿Tienes fiebre?");
        bSi = input.nextBoolean();
        if (bSi == true) {
            System.out.println("¿Tose?");
            bSi = input.nextBoolean();
            if (bSi == true) {
                System.out.println("¿Le cuesta respirar, resuella o tose con flemas?");
                bSi = input.nextBoolean();
                if (bSi == true) {
                    System.out.println("Posible diagnostico: neumonia o infeccion en las vias respiratorias");
                } else {
                    System.out.println("¿Le duele la cabeza?");
                    bSi = input.nextBoolean();
                    if (bSi == true) {
                        System.out.println("Posible diagnostico: infeccion virica");
                    } else {
                        System.out.println("¿Le duelen los huesos o las articulaciones?");
                        bSi = input.nextBoolean();
                        if (bSi == true) {
                            System.out.println("Posible diagnostico: infeccion virica");
                        } else {
                            System.out.println("¿Presenta erucciones cutaneas?");
                            bSi = input.nextBoolean();
                            if (bSi == true) {
                                System.out.println("No se dispone de informacion suficiente para realizar un diagnostico");
                            } else {
                                System.out.println("¿Le duele la garganta?");
                                bSi = input.nextBoolean();
                                if (bSi == true) {
                                    System.out.println("Posible diagnostico: infeccion de garganta");
                                } else {
                                    System.out.println("¿Le duele la espalda por encima de las lumbares, con escalofrios y fiebre?");
                                    bSi = input.nextBoolean();
                                    if (bSi == true) {
                                        System.out.println("Posible diagnostico: infeccion renal");
                                    } else {
                                        System.out.println("¿Le duele al orinar o lo hace con mas frecuencia?");
                                        bSi = input.nextBoolean();
                                        if (bSi == true) {
                                            System.out.println("Posible diagnostico: infeccion del tracto urinario");
                                        } else {
                                            System.out.println("¿ha pasado el dia al sol o con mucho calor?");
                                            bSi = input.nextBoolean();
                                            if (bSi == true) {
                                                System.out.println("Posible diagnostico: golpe de calor o agotamiento por calor");
                                            } else {
                                                System.out.println("No se dispone de informacion suficiente");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                System.out.println("¿Duele la cabeza?");
                bSi = input.nextBoolean();
                if (bSi == true) {
                    System.out.println("¿Tiene alguno de los siguientes sintomas: dolor cuando inclina la cabeza hacia delante,\n nauseas, vomitos, fuertes molestia en los ojos ante una luz brillante, somnolencia o confucion?");
                    bSi = input.nextBoolean();
                    if (bSi == true) {
                        System.out.println("Posible diagnostico: meningitis");
                    } else {
                        System.out.println("¿Vomita o tiene diarrea?");
                        bSi = input.nextBoolean();
                        if (bSi == true) {
                            System.out.println("Infeccion en el tracto digestivo");
                        } else {
                            System.out.println("¿Le duele la espalda por encima de las lumbares, con escalofrios y fiebre?");
                            bSi = input.nextBoolean();
                            if (bSi == true) {
                                System.out.println("Posible diagnostico: infeccion renal");
                            } else {
                                System.out.println("¿Presenta erucciones cutaneas?");
                                bSi = input.nextBoolean();
                                if (bSi == true) {
                                    System.out.println("Posible diagnostico: infeccion de garganta");
                                } else {
                                    System.out.println("¿Le duele la espalda por encima de las lumbares, con escalofrios y fiebre?");
                                    bSi = input.nextBoolean();
                                    if (bSi == true) {
                                        System.out.println("Posible diagnostico: infeccion renal");
                                    } else {
                                        System.out.println("¿Le duele al orinar o lo hace con mas frecuencia?");
                                        bSi = input.nextBoolean();
                                        if (bSi == true) {
                                            System.out.println("Posible diagnostico: infeccion del tracto urinario");
                                        } else {
                                            System.out.println("¿ha pasado el dia al sol o con mucho calor?");
                                            bSi = input.nextBoolean();
                                            if (bSi == true) {
                                                System.out.println("Posible diagnostico: golpe de calor o agotamiento por calor");
                                            } else {
                                                System.out.println("No se dispone de informacion suficiente");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            System.out.println("No se dispone de informacion suficiente para hacer un dianostico");
        }
    }
}

