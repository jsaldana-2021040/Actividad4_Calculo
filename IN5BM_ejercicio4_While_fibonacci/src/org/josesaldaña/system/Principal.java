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
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad deseada :");

        int limite = sc.nextInt();

        int num1 = 0;
        int num2 = 1;
        int temp;
        int conta = 2;

        System.out.print("\n" + num1 + ", \t");
        System.out.print(num2 + ", \t");

        while (conta < limite){ 
            temp = num1;
            num1=num2;
            num2= temp + num1;
            System.out.print(num2 + ", \t");
            conta++;
        }
        System.out.println("\n");
    }
    
}
