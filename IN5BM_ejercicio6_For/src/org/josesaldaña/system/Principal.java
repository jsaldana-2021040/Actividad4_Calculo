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
        //Leer las calificaciones de una clase de 10 estudeiantes u
        //contar el número total de aprobados (Mayor o igual a 61 pts.).

        Scanner sc = new Scanner(System.in);

        int contador = 0;
   
        for (int i = 1; i <=10; i++){
            System.out.println("Nota del alumno :");
            int nota = sc.nextInt();
            
            if (nota>=61){
                contador++;
            }
        }
        System.out.println("Cantidad de aprobados: " + contador);
    }  
}
