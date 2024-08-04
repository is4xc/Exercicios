/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio026.Exercicio026;

import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author isaac
 */
public class Exercicio026 {

    public static int preencheNumeroInteiro(int indice) {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        
        System.out.format("Digite o %dº numero: ", indice+1);
        numero = teclado.nextInt();
        
        return numero;
    }
    
    public static String comparaNumerosInteiros(int numero1 , int numero2) {
        String resultadoComparacao = null;
        
        if(numero1 > numero2) {
            resultadoComparacao = "O primeiro valor é o maior";
        } else if(numero1 < numero2) {
            resultadoComparacao = "O segundo valor é o maior";
        } else {
            resultadoComparacao = "Não existe valor maior, os dois sao iguais";
        }
        
        return resultadoComparacao;
    }
    
    public static void main(String[] args) {
        int numeroInteiro[] = new int[2];
        Arrays.fill(numeroInteiro, 0);
        String mensagemComparacao = null;
        
        for(int i = 0; i < 2; i++) {
            numeroInteiro[i] = preencheNumeroInteiro(i);
        }
        
        mensagemComparacao = comparaNumerosInteiros(numeroInteiro[0], numeroInteiro[1]);
        System.out.print(mensagemComparacao);
    }
}
