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
        Se le solicita ingresar números y mostrar la suma,
        hasta que el usuario que ya no desea ingresar mas,
        para ello debe mostrar un mensaje despues de cada ingreso
        preguntandole si desea continuar.
        */

        Scanner sc = new Scanner(System.in);

        double suma = 0.0;
        String respuesta = "";
        
        do{
            System.out.println("Ingrese un número: ");
            double numero = sc.nextDouble();
            
            suma = suma + numero;
            
            System.out.println("¿Desea ingresar otro número? (s/n)");
            sc.nextLine();
            respuesta = sc.nextLine();
        } while (respuesta.equalsIgnoreCase("s"));
        
        System.out.println("Suma total: " + suma);
    }
    
}
