/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio055.Exercicio055;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Exercicio055 {

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
        int tentativa = 0;
        
        int numeroSorteado = numeroAleatorio.nextInt(10) + 1;
        
        do {
            System.out.format("TENTIVA: %d\n", tentativa+1);
            System.out.print("DIGITE UM PALPITE: ");
            palpite = scanner.nextInt();   
            
            if(palpite != numeroSorteado) {
                situacaoPalpite = verificaSituacaoPalpite(palpite, numeroSorteado); 
                System.out.println(situacaoPalpite);
                tentativa++;
                System.out.println("");
            }
            
        } while(palpite != numeroSorteado && tentativa < 3);
        
        if(palpite != numeroSorteado) {
            System.out.format("\nNUMERO SORTEADO: %d\nVOCE PERDEU!", numeroSorteado);
        } else {
            System.out.print("\nPARABENS!");
        }
    }
}
