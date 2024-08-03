/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio004.Exercicio004;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Exercicio004 {
    
    public static int somatorio() {
        Scanner input = new Scanner(System.in); 
        int soma = 0; 
        
        for(int i = 0; i < 2; i++) { 
            System.out.format("Digite o %d valor: ", i+1); 
            soma += input.nextInt(); 
        }
        return soma; 
    }
    
    public static void main(String[] args) {
        int soma = somatorio(); 
        System.out.format("Total da soma: %d",soma); 
    }
}
