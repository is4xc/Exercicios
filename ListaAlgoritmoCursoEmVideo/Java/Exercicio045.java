/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio045.Exercicio045;

import java.util.*;

/**
 *
 * @author isaac
 */
public class Exercicio045 {
    public static int preencheValorInt() {
        Scanner scanner = new Scanner(System.in);
        int valorInteiro = 0;
        
        valorInteiro = scanner.nextInt();
        
        return valorInteiro;
    }
    
    public static boolean verificaTipoContagem(int comeco, int fim) {
        boolean verificacao = false;
        
        if(comeco < fim) {
            verificacao = true;
        } else {
            verificacao = false;
        }
        
        return verificacao;
    }
    
    public static void contagemCrescente(int comeco, int fim, int incremento) {
        for(int i = comeco; i <= fim; i += incremento) {
            System.out.print(i + " ");
        }
    }
    
    public static void contagemDecrescente(int comeco, int fim, int incremento) {
        for(int i = comeco; i >= fim; i -= incremento) {
            System.out.print(i + " ");
        }
    }
    
    public static void main(String[] args) {
        int comeco = 0, fim = 0, incremento = 0;
        boolean tipoContagem = false;
        
        System.out.print("DIGITE O PRIMIERO VALOR: ");
        comeco = preencheValorInt();
        System.out.print("DIGITE O SEGUNDO VALOR: ");
        fim = preencheValorInt();
        System.out.print("DIGITE O INCREMENTO: ");
        incremento = preencheValorInt();
        
        if(comeco == fim) {
            System.out.print("CONTAGEM NAO NECESSARIA");
        } else {
            tipoContagem = verificaTipoContagem(comeco, fim);
            if(tipoContagem == true) {
                System.out.println("CONTAGEM CRESCENTE");
                contagemCrescente(comeco, fim, incremento);
            } else {
                System.out.print("CONTAGEM DECRESCENTE");
                contagemDecrescente(fim, comeco, incremento);
            }
        }
    }
}
