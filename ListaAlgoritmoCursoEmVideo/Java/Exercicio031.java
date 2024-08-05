/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio031.Exercicio031;

import java.util.Scanner;
/**
 *
 * @author isaac
 */
public class Exercicio031 {

    public static int solicitaJogada(int indice) {
        Scanner teclado = new Scanner(System.in);
        int jogada = 0;
        
        System.out.format("JOGADOR %d\n", indice+1);
        System.out.println("[1] PEDRA");
        System.out.println("[2] PAPEL");
        System.out.println("[3] TESOURA");
        System.out.print("Digite sua jogada: ");
        jogada = teclado.nextInt();
        
        return jogada;
    }
    
    public static String verificaGanhador(int j1, int j2) {
        String resultado = null;
        if(j1 == j2) {
            resultado = "EMPATE";
        } else if(j1 == 1 && j2 == 3) {
            resultado = "JOGADOR 1 GANHOU";
        } else if(j1 == 2 && j2 == 1) {
            resultado = "JOGADOR 1 GANHOU";
        } else if(j1 == 3 && j2 == 2) {
            resultado = "JOGADOR 1 GANHOU";
        } else {
            resultado = "JOGADOR 2 GANHOU";
        }
        
        return resultado;
    }
    
    public static void main(String[] args) {
        int jogador[] = new int[2];
        String ganhador;
        for(int i = 0; i < 2; i++) {
            jogador[i] = solicitaJogada(i);
        }
        
        ganhador = verificaGanhador(jogador[0], jogador[1]);
        System.out.print(ganhador);
    }
}
