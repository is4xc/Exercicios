/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio042.Exercicio042;

import java.util.*;

/**
 *
 * @author isaac
 */
public class Exercicio042 {

    public static void contagem(int fim) {
        for(int i = 1; i <= fim; i++) {
            System.out.print(i + " ");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fim = 0;
        
        System.out.print("QUER CONTAR ATE ONDE: ");
        fim = scanner.nextInt();
        
        contagem(fim);
    }
}
