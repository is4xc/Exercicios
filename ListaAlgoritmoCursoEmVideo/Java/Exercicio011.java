/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio011.Exercicio011;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Exercicio011 {

    public static int calcDelta(int a, int b, int c) { 
        int d;
        
        d = (int)Math.pow(b, 2) -4 * a * c; 
        
        return d;
    }
    
    public static void main(String[] args) {
        int vetorABC[] = new int[3]; 
        String mostraLetra[] = {"a", "b", "c"}; 
        Arrays.fill(vetorABC, 0);  
        Scanner teclado = new Scanner(System.in); 
        int delta; 
        
        for(int i = 0; i < 3; i++) { 
            System.out.format("Digite o valor de %s: ", mostraLetra[i]);
            vetorABC[i] = teclado.nextInt();
        }
        
        delta = calcDelta(vetorABC[0], vetorABC[1], vetorABC[2]);
        
        System.out.println("Formula = b² - 4 * a * c");
        System.out.format("Valor delta: %d", delta);
    }
}
