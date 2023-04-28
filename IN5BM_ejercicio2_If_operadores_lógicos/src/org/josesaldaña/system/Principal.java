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
        Despliegue un mensaje indicando, Si un año ingresado por el usuario
        (yyyy) es o no bisiesto.
        La regla para los años bisiestos según el calendario gregoriano es:
        Un año es bisiesto si es divisible por 4, excepto el último de cada
        Slglo (aquel divis1ble por 100), Salvo que este ultimo sea divis1ble
        por 4009. 
       */
    
        //Entrada
        Scanner sc = new Scanner(System.in);        
        int year;    

        System.out.println("Ingrese el año en formato (yyyy): ");
        year=sc.nextInt();
        
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El años no es bisiesto");
        }

    }
    
}
