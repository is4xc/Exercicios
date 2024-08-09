/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio059.Exercicio059;

import java.util.*;

/**
 *
 * @author isaac
 */
public class Exercicio059 {

    public static int somaIdadeHomem = 0;
    public static int mulherJovem = 0;
    public static int maior = 0;
    
    public static void maiorIdade(int idade, int i) {
        if(i == 1) {
            maior = idade;
        } else if(idade > maior) {
            maior = idade;
        }
    }
    
    public static int incrementoContaHomem(int sexo, int idade) {
        int contLocal = 0;
        
        if(sexo == 1) {
            contLocal++;
            somaIdadeHomem += idade;
        } else {
            contLocal = 0;
        }
        
        return contLocal;
    }
    
    public static void verificaMulherJovem(int idade, int i) {
        
        if(i == 1) {
            mulherJovem = idade;
        } else if(idade < mulherJovem) {
            mulherJovem = idade;
        }
    }
        
    
    public static void main(String[] args) {
        int sexo = 0, idade = 0, i = 0, contHomem = 0, contMulher = 0;
        
        Scanner scanner = new Scanner(System.in);
        String resposta = null;
        float mediaIdadeHomem = 0f;
        
        do {
        i++;
        System.out.format("USUARIO: %d\n", i);
        System.out.print("[1]HOMEM\n[2]MULHER\n");
        sexo = scanner.nextInt();
        System.out.print("IDADE: ");
        idade = scanner.nextInt();
        System.out.print("QUER CONTINUAR[S/N]: ");
        resposta = scanner.next();
        
        if(sexo == 2) {
            contMulher++;
            verificaMulherJovem(idade, contMulher);
        } 
        
        maiorIdade(idade, i);
        contHomem += incrementoContaHomem(sexo, idade);
        
        System.out.println("");
        } while(!resposta.toUpperCase().equals("N"));
        
        if(contHomem > 0) {
            mediaIdadeHomem = somaIdadeHomem/contHomem;
        }
        
        System.out.println("");
        
        System.out.format("MAIOR IDADE LIDA: %d\n", maior);
        System.out.format("QTD HOMENS: %d\n", contHomem);
        System.out.format("IDADE DA MULHER MAIS JOVEM: %d\n", mulherJovem);
        System.out.format("MEDIA DA IDADE ENTRE OS HOMENS: %.2f", mediaIdadeHomem);
    }
}
