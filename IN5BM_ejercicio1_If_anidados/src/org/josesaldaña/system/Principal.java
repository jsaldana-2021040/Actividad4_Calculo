package org.josesaldaña.system;
import java.util.Scanner;

/**
 * @author José Roberto Saldaña Arrazola
 * Correo: jsaldana-2021040@kinal.edu.gt
 * Codigo tecnico: IN5BM
 * Jornada: Matutina
 * Grupo: 2  
 */

public class Principal {

    public static void main(String[] args) {
        /* 
        Martha va a realizar una fiesta por lo cual ha invitado a una gran
        cantidad de personas. Pero tambien ha decidido algunas reglas:
        Que todas las personas Con edades mayores a los quince años,
        solo pueden entrar si traen regalos;
        que jovenes con los quince años cumplidos entra totalmente gratis
        pero los de menos de quince anos no pueden entrar a la fiesta.
        Hacer un algoritmo donde se tome la edad de una persona y que requisito
        de los anteriores le toca cumplir si quiere entrar.
        */
        Scanner sc = new Scanner(System.in);
        byte edad;
        boolean traeRegalo;

        //Entrada
        System.out.println("Ingrese la edad del invitado :");
        edad = sc.nextByte();
        System.out.println("¿Trae regalo (true/false)?");
        traeRegalo = sc.nextBoolean();

        //Proceso y salida
        if (edad>15){
            if (traeRegalo){
                System.out.println("Si puede entrar");
            } else {
                System.out.println("No puede entrar");
            }
        } else {
            if (edad==15) {
                System.out.println("Entra gratis");
            } else {
            if (edad<15) {
                System.out.println("No puede entrar"); 
                } 
        
            }
    
        }
    }
}
