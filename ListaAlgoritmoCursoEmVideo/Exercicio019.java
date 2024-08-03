/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio019.Exercicio019;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Exercicio019 {

    public static String cadastraAluno() {
        String a = null;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o nome do aluno: ");
        a = teclado.nextLine();
        
        return a;
    }
    
    public static float cadastraNota(int q) {
        Scanner teclado = new Scanner(System.in);
        float n = 0;
        
        System.out.format("Digite sua %dº questao: ", q+1);
        n = teclado.nextFloat(); 
        
        return n;
    }
    
    public static float verMedia(float n1, float n2) {
        float m = (n1 + n2)/2; 
        
        return m;
    }
    
    public static void main(String[] args) {
        String aluno = cadastraAluno(); 
        float nota[] = new float[2]; 
        Arrays.fill(nota, 0); 
        String sitAluno = null;
        
        for(int i = 0; i < 2; i++) { 
            nota[i] = cadastraNota(i);
        }
        
        float media = verMedia(nota[0], nota[1]);
        
        if(media >= 7) {
            sitAluno = "ACIMA DA MEDIA!";
        } else {
            sitAluno = "VOCÊ CONSEGUE MELHORAR!";
        }
        
        System.out.format("NOME ALUNO: %s\nMEDIA DO ALUNO: %.2f\nSITUACAO DO ALUNO: %s"
                , aluno, media, sitAluno);
    }
}
