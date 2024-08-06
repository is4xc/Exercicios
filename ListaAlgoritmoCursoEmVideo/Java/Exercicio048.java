/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio048.Exercicio048;

import java.util.*;

/**
 *
 * @author isaac
 */
public class Exercicio048 {

    public static int calcNumeros() {
        int resultado = 0;
        Scanner scanner = new Scanner(System.in);
        
        resultado = scanner.nextInt();
        
        return resultado;
    }
    
    public static void main(String[] args) {
        int somaTotal = 0;
        
        for(int i = 0; i < 7; i++) {
            System.out.format("DIGITE O %d valor: ", i+1);
            somaTotal += calcNumeros();
        }
        
        System.out.format("TOTAL DA SOMA ENTRE OS NUMEROS: %d", somaTotal);
    }
}
