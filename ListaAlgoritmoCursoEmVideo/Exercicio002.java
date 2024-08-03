/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio002.Exercicio002;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Exercicio002 {
    
    public static String preencheNome() {
        Scanner input = new Scanner(System.in); 
        System.out.print("Qual é seu nome: "); 
        String nome = input.nextLine(); 
        return nome; 
    }
    
    public static void main(String[] args) {
        String nome = preencheNome(); 
        System.out.format("Olá %s , é um prazer te conhecer!", 
                nome); 
    }
}
