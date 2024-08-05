/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio032.Exercicio032;

import java.util.*;

/**
 *
 * @author isaac
 */
public class Exercicio032 {

    public static String verificaSituacaoPalpite(int palpite, int numSorteado) {
        String diferenca = null;
        
        if(palpite < numSorteado) {
            diferenca = "O NUMERO SORTEADO É MAIOR";
        } else {
            diferenca = "O NUMERO SORTEADO É MENOR";
        }
        
        return diferenca;
    }
        
    
    public static void main(String[] args) {
        Random numeroAleatorio = new Random();
        Scanner scanner = new Scanner(System.in);
        int palpite = 0;
        String situacaoPalpite = null;
        
        int numeroSorteado = numeroAleatorio.nextInt(5) + 1;
        
        do {
            System.out.print("DIGITE UM PALPITE: ");
            palpite = scanner.nextInt();   
            
            if(palpite != numeroSorteado) {
                situacaoPalpite = verificaSituacaoPalpite(palpite, numeroSorteado); 
                System.out.println(situacaoPalpite);
            }
                
        } while(palpite != numeroSorteado);
        
        System.out.print("\nPARABENS!");
    }
}
