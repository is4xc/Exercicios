/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio049.Exercicio049;

import java.util.*;

/**
 *
 * @author isaac
 */
public class Exercicio049 {

    public static int verificaPar(int valor) {
        int par = 0;
        if(valor%2 == 0) {
            par = 1;
        } else {
            par = 0;
        }
        
        return par;
    }
    
    public static int verificaImpar(int valor) {
        int impar = 0;
        if(valor%2 != 0) {
            impar = 1;
        } else {
            impar = 0;
        }
        
        return impar;        
    }
        
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totPar = 0, totImpar = 0;
        int valor = 0;
        
        for(int i = 0; i < 6; i++) {
            System.out.format("DIGITE O %d VALOR: ", i+1);
            valor = scanner.nextInt();
            totPar += verificaPar(valor);
            totImpar += verificaImpar(valor); 
        }
        
        System.out.format("TOTAL DE NUMEROS PARES: %d\nTOTAL DE NUMEROS IMPARES: %d",
                totPar, totImpar);
    }
}
