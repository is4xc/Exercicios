/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio054.Exercicio054;

import java.util.*;

/**
 *
 * @author isaac
 */
public class Exercicio054 {

    public static int verificaPeso90(float peso) {
        int contLocal = 0;
        
        if(peso > 80) {
            contLocal++;
        } else {
            contLocal = 0;
        }
        
        return contLocal;
    }
    
    public static int verificaMetricas1(float altura, float peso) {
        int contLocal = 0;
        
        if(peso < 50 && altura < 1.60) {
            contLocal++;
        } else {
            contLocal = 0;
        }
        
        return contLocal;
    }
    
    public static int verificaMetricas2(float altura, float peso) {
        int contLocal = 0;
        
        if(peso > 100 && altura > 1.90) {
            contLocal++;
        } else {
            contLocal = 0;
        }
        
        return contLocal;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float altura = 0f,
              peso = 0f,
              mediaAltura = 0f;
        int somaAltura = 0,
            contPeso90 = 0,
            contCond1 = 0,
            contCond2 = 0;
        
        for(int i = 0; i < 7; i++) {
            System.out.format("CADASTRO %d\n", i+1);
            System.out.print("DIGITE SUA ALTURA: m");
            altura = scanner.nextFloat();
            System.out.print("DIGITE SEU PESO: kg");
            peso = scanner.nextFloat();
            somaAltura += altura;
            contPeso90 += verificaPeso90(peso);
            contCond1 += verificaMetricas1(altura, peso);
            contCond2 += verificaMetricas2(altura, peso);
            
            System.out.println("");
        }
        
        mediaAltura = somaAltura/7;
        
        System.out.format("\nMEDIA ALTURA DO GRUPO: %.2fm", mediaAltura);  
        System.out.format("QUANTIDADE DE PESSOAS QUE PESAM MAIS DE 90kg: %d\n", contPeso90);
        System.out.format("QTD PESSOAS QUE TEM MENOR QUE 50KG E MENOS DE 1.60m: %d\n", contCond1);
        System.out.format("QTD PESSOAS QUE TEM MAIS DE 1.90m e PESAM MAIS DE 100KG: %d", contCond2);
    }
}
