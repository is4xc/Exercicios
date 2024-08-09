/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio050.Exercicio050;

import java.util.*;

/**
 *
 * @author isaac
 */
public class Exercicio050 {

    public static int verificaNumerosAcima5(int numero) {
        int contAcima5 = 0;
        
        if(numero > 5) {
            contAcima5++; 
        } else {
            contAcima5 = 0;
        }
        
        return contAcima5;
    }
    
        public static int verificaNumeroDivisivel3(int numero) {
            int contDiv3 = 0;
            
            if(numero%3 == 0) {
                contDiv3++;
            } else {
                contDiv3 = 0;
            }
            
            return contDiv3;
        }
        
    public static void main(String[] args) {
        int numeroSorteado = 0;
        int numeroAcima5 = 0;
        int numeroDivisivel3 = 0;
        
        
        System.out.println("NUMEROS SORTEADOS");
        for(int i = 0; i < 20; i++){
            Random numeroAleatorio = new Random(); 
            numeroSorteado = numeroAleatorio.nextInt(10) + 1;
            
            System.out.print(numeroSorteado + " ");
            
            numeroAcima5 += verificaNumerosAcima5(numeroSorteado);
            numeroDivisivel3 += verificaNumeroDivisivel3(numeroSorteado); 
        }
        
        System.out.format("\nQUANTIDADE DE NUMEROS ACIMA 5: %d\n", numeroAcima5);
        System.out.format("QUANTIDADE DE NUMEROS DIVISIVEIS POR 3: %d\n", numeroDivisivel3);
    }
}
