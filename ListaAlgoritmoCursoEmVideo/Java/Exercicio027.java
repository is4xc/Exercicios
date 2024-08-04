/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio027.Exercicio027;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Exercicio027 {

    public static float preencheNotaAluno(int indice) {
        Scanner teclado = new Scanner(System.in);
        float nota = 0;
        
        System.out.format("Digite a %dº nota: ", indice+1);
        nota = teclado.nextFloat();
        
        return nota;
    }
    
    public static float calculaMediaAluno(float nota1, float nota2) {
        float mediaNota = 0;
        
        mediaNota = (nota1 + nota2)/2;
        
        return mediaNota;
    }
    
    public static String verificaSituacaoAluno(float media) {
        String mensagemSituacao = null;
        
        if(media < 4.9) {
            mensagemSituacao = "REPROVADO";
        } else if(media < 6.9) {
            mensagemSituacao = "RECUPERACAO";
        } else {
            mensagemSituacao = "APROVADO";
        }
        
        return mensagemSituacao;
    }
    
    public static void main(String[] args) {
        float notaAluno[] = new float[2];
        Arrays.fill(notaAluno, 0);
        float media = 0;
        String situacaoAluno = null;
        
        for(int i = 0; i < 2; i++) {
            notaAluno[i] = preencheNotaAluno(i);
        }
        
        media = calculaMediaAluno(notaAluno[0], notaAluno[1]);
        situacaoAluno = verificaSituacaoAluno(media);
        
        System.out.format("MEDIA: %.2f\nSITUACAO DO ALUNO: %s",
                media, situacaoAluno);
    }
}
