/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio005.Exercicio005;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Exercicio005 {
    
    public static float calcMedia(float n1, float n2) { 
        float m = (n1+n2)/2; 
        return m; 
    }
    
    public static void main(String[] args) {
        float nota[] = new float[2]; 
        Arrays.fill(nota, 0);
        Scanner input = new Scanner(System.in);
        
        for(int i = 0; i < 2; i++) { 
            System.out.format("Digite a %dº nota: ", i+1);
            nota[i] = input.nextFloat();
        }
        
        float media = calcMedia(nota[0], nota[1]); 
        System.out.format("A media entre %.2f e %.2f e igual a %.2f", 
                nota[0], nota[1], media); 
    }
}
