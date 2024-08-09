/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio053.Exercicio053;

import java.util.*;

/**
 *
 * @author isaac
 */
public class Exercicio053 {

    public static int somaHomem = 0;
    
    public static int contadorH(int sexo) {
        int contLocal = 0;
        
        if(sexo == 1) {
            contLocal++;
            somaHomem++;
        } else {
            contLocal = 0;
        }
        
        return contLocal;
    }
    
    public static int contadorM(int sexo) {
        int contLocal = 0;
        
        if(sexo == 2) {
            contLocal++;
        } else {
            contLocal = 0;
        }
        
        return contLocal;
    }
    
    public static int contadorMulherMais20(int sexo, int idade) {
        int contLocal = 0;
        
        if(sexo == 2 && idade > 20) {
            contLocal++;
        } else {
            contLocal = 0;
        }
        
        return contLocal;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade = 0,
            sexo = 0,
            contHomem = 0,
            contMulher = 0,
            somadorAutomatico = 0,
            mediaGrupo = 0,
            mediaHomens = 0,
            contMulher20 = 0;
        
        for(int i = 0; i < 10; i++) {
            System.out.format("USUARIO %d\n", i+1);
            System.out.print("DIGITE SUA IDADE: ");
            idade = scanner.nextInt();
            System.out.print("DIGITE SEU SEXO\n[1]HOMEM\n[2]MULHER\n");
            sexo = scanner.nextInt();
            System.out.println("");
            
            contHomem += contadorH(sexo);
            contMulher += contadorM(sexo);
            somadorAutomatico += idade;
            contMulher20 = contadorMulherMais20(sexo, idade);
        }
        
        mediaGrupo = somadorAutomatico/5;
        mediaHomens = contHomem/somaHomem;
        
        System.out.format("QUANTIDADE HOMENS CADASTRADOS: %d\n", contHomem);
        System.out.format("QUANTIDADE MULHERES CADASTRADAS: %d\n", contMulher);
        System.out.format("MEDIA DE IDADE DO GRUPO: %d\n", mediaGrupo);
        System.out.format("MEDIA DE IDADES DE HOMENS: %d\n", mediaHomens);
        System.out.format("QUANTIDADE DE MULHERES MAIOR DE 20 ANOS: %d", contMulher20);
    }
}
