/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio037.Exercicio037;

import java.util.*;
/**
 *
 * @author isaac
 */
public class Exercicio037 {

    public static Scanner scanner = new Scanner(System.in);
    
    public static int preencheValorInt() {
        int valorInteiro = 0;
        
        valorInteiro = scanner.nextInt();
        
        return valorInteiro;
    }
    
    public static double calcNovoSalario(double salarioAT, int genero, int anosTR) {
        double nvSalario = 0.0;
        float porcentoAumento = 0.0f;
        
        switch(genero) {
            case 1:
                if(anosTR < 15) {
                    porcentoAumento = 0.05f;
                } else if(anosTR <= 20) {
                    porcentoAumento = 0.12f;
                } else {
                    porcentoAumento = 0.23f;
                }
            break;
            
            case 2:
                if(anosTR < 20) {
                    porcentoAumento = 0.03f;
                } else if(anosTR <= 30) {
                    porcentoAumento = 0.13f;
                } else {
                    porcentoAumento = 0.25f;
                }
            break;
        }
        
        nvSalario = salarioAT + (salarioAT * porcentoAumento); 
        
        return nvSalario;
    }
    
    public static void main(String[] args) {
        //salarioAtual, generoFuncionario, anosTrabalhados, novoSalario
        double salarioAtual = 0.0, novoSalario = 0.0;
        int generoFuncionario = 0, anosTrabalhados = 0;
        
        System.out.print("DIGITE O SALARIO ATUAL: ");
        salarioAtual = scanner.nextDouble();
        System.out.println("DIGITE SEU GENERO GENERO \n[1]MULHER \n[2]HOMEM");
        generoFuncionario = preencheValorInt();
        System.out.print("QUANTOS ANOS VOCE TRABALHA NA EMPRESA: ");
        anosTrabalhados = preencheValorInt();
        
        novoSalario = calcNovoSalario(salarioAtual, generoFuncionario, anosTrabalhados);
        
        System.out.format("NOVO SALARIO: R$%.2f", novoSalario);
    }
}
