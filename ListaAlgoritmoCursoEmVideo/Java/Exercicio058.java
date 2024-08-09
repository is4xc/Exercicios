/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio058.Exercicio058;

import java.util.*;

/**
 *
 * @author isaac
 */
public class Exercicio058 {

    public static void main(String[] args) {
        int idade = 0, i = 0;
        Scanner scanner = new Scanner(System.in);
        
        do{
            System.out.println("9999 CANCELA");
            System.out.format("USUARIO: %d\n", ++i);
            System.out.print("DIGITE SUA IDADE: ");
            
            if(idade != 9999) {
                idade = scanner.nextInt();
            } else {
                break;
            }
            
            System.out.println("");
        } while(idade != 9999);
        
    }
}
