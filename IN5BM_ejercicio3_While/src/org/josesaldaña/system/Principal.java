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
        //Mostrar los numeros pares, hasta el numero ingresado por el ususario.
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un numero :");
        int limite= sc.nextInt();

        int numero=0;

        while (numero<=limite) {
            if (numero%2==0){
                System.out.println(numero);
            }
            numero++;
            
        }

    }
    
}
