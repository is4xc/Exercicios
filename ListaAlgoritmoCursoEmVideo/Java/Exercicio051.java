/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio051.Exercicio051;

import java.util.*;

/**
 *
 * @author isaac
 */
public class Exercicio051 {

    public static double maior = 0.0, menor = 0.0;
    
    public static void verificaMaiorPreco(int i, double preco) {
        if(i == 0) {
            maior = preco;
        } else if(preco > maior) {
            maior = preco;
        }
    }
    
    public static void verificaMenorPreco(int i, double preco) {
        if(i == 0) {
            menor = preco;
        } else if(preco < menor) {
            menor = preco;
        }
    }
    
    public static void main(String[] args) {
        double precoProduto = 0;
        Scanner scanner = new Scanner(System.in);
        
        for(int i = 0; i < 8; i++) {
            System.out.format("DIGITE O PRECO DO %dº PRODUTO: R$", i+1);
            precoProduto = scanner.nextDouble();
            
            verificaMaiorPreco(i, precoProduto);
            verificaMenorPreco(i, precoProduto);
        }
        
        System.out.format("\nMAIOR PRECO DIGITADO: R$%.2f\n", maior);
        System.out.format("MENOR PRECO DIGITADO: R$%.2f", menor);
        
    }
}
