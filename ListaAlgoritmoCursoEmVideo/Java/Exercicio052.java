/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio052.Exercicio052;

import java.util.*;

/**
 *
 * @author isaac
 */
public class Exercicio052 {

    public static int maiorIdade = 0;
    
    public static int verificaMaioridade(int idade) {
        int contLocal = 0;
        
        if(idade > 18) {
            contLocal++;
        } else {
            contLocal = 0;
        }
        
        return contLocal;
    }
    
    public static int verificaMenor5(int idade) {
        int contLocal = 0;
        
        if(idade < 5) {
            contLocal++;
        } else {
            contLocal = 0;
        }
        
        return contLocal;
    }
    
    public static void verificaMaiorIdadeLida(int idade, int i) {
        if(i == 0) {
            maiorIdade = idade;
        } else if(idade > maiorIdade) {
            maiorIdade = idade;
        } 
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade = 0,
            somaIdades = 0,
            idadeMaior18 = 0,
            idadeMenor5 = 0;
        float mediaIdade = 0.0f;
        
        for(int i = 0; i < 10; i++) {
            System.out.format("CADASTRO %d\n", i+1);
            System.out.print("DIGITE SUA IDADE: ");
            idade = scanner.nextInt();
            
            somaIdades += idade;
            idadeMaior18 += verificaMaioridade(idade);
            idadeMenor5 += verificaMenor5(idade);
            verificaMaiorIdadeLida(idade, i);
            
            System.out.println("");
        }
        mediaIdade = somaIdades/10;
        
        System.out.format("\nMEDIA IDADE DO GRUPO: %.2f\n", mediaIdade);
        System.out.format("PESSOAS COM MAIS DE 18 ANOS: %d\n", idadeMaior18);
        System.out.format("PESSOAS MENORES QUE 5 ANOS: %d\n", idadeMenor5);
        System.out.format("MAIOR IDADE LIDA: %d\n", maiorIdade);
    }
}
