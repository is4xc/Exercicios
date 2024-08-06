/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio044.Exercicio044;

import java.util.*;

/**
 *
 * @author isaac
 */
public class Exercicio044 {

    public static int entradaValorInt() {
        int valorInteiro = 0;
        
        Scanner scanner = new Scanner(System.in);
        valorInteiro = scanner.nextInt();
        
        return valorInteiro;
    }
        
    public static void contagem(int comeco, int fim, int incremento) {
        for(int i = comeco; i <= fim; i += incremento) {
            System.out.print(i + " ");
        }
        
    }
    
    public static void main(String[] args) {
        int comeco = 0, fim = 0, incremento = 0;
        
        System.out.print("DIGITE O PRIMEIRO VALOR: ");
        comeco = entradaValorInt();
        System.out.print("DIGITE O ULTIMO VALOR: ");
        fim = entradaValorInt();
        System.out.print("DIGITE O INCREMENTO: ");
        incremento = entradaValorInt();
        
        contagem(comeco, fim, incremento);
    }
}
