/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio012.Exercicio012;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Exercicio012 {

    public static double verPrecoProduto() {
        Scanner entradaTeclado = new Scanner(System.in);
        
        System.out.print("Digite o valor do produto: "); 
        double pP = entradaTeclado.nextDouble();
        
        return pP; 
    }
    
    public static double calcDesconto(double pP) {
        double dP = pP - (pP * 0.05); 
        
        return dP;
    } 
    
    public static void main(String[] args) {
        double precoProduto = 0; 
        double descontoProduto = 0;
        
        precoProduto = verPrecoProduto(); 
        descontoProduto = calcDesconto(precoProduto);
        
        System.out.format("Preço Produto: %.2f\nTotal: %.2f",
                precoProduto, descontoProduto);
    }
}
