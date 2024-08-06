/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio046.Exercicio046;

/**
 *
 * @author isaac
 */
public class Exercicio046 {

    public static void calculaTotalNumero() {
        int somaTotal = 0;
        
        for(int i = 6; i <= 100; i += 2) {
            somaTotal += i;
        }
        
        System.out.format("A SOMA TOTAL ENTRE 6 ATE 100 É: %d", somaTotal);
    }
    
    public static void main(String[] args) {
        calculaTotalNumero();
    }
}
