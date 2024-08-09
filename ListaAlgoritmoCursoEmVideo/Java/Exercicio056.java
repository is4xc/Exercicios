/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio056.Exercicio056;

import java.util.*;

/**
 *
 * @author isaac
 */
public class Exercicio056 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0,
            totalSoma = 0;
        
        do {
            System.out.println("1111 PARA CANCELAR");
            System.out.print("DIGITE UM NUMERO: ");
            numero = scanner.nextInt();
            
            if(numero != 1111) {
                totalSoma += numero;
            } 
            
            System.out.println("");
        } while(numero != 1111);
        
        System.out.format("TOTAL DA SOMA: %d", totalSoma);
    }
}
