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
        //Diseñe una aplicacion que muestre las tablas de multiplicar
        //del 1 a un numero ingresado por el usuario.

        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Ingrese un numero :");
        numero = sc.nextInt();

        for (int i = 1; i <= numero; i++){
            System.out.println("\nTabla del " + i);

            for (int j = 1; j <= 10; j++){
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            
        }
    }
    
}
