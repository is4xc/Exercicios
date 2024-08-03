/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio006.Exercicio006;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Exercicio006 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        
        System.out.print("Digite um numero: "); 
        int numero = input.nextInt(); 
         
        System.out.format("O antecessor de %d e %d\n" 
                + "o sucessor de %d e %d", numero, numero-1, 
                numero, numero+1);
    }
}
