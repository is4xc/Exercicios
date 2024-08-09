/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio057.Exercicio057;

import java.util.*;

/**
 *
 * @author isaac
 */
public class Exercicio057 {

    public static double contSalarioM(int sexo, double salario) {
        double somaSalario = 0.0;
        
        if(sexo == 1) {
            somaSalario = salario;
        } else {
            somaSalario = 0;
        }
            
        return somaSalario;
    }
    
    public static double contSalarioF(int sexo, double salario) {
        double somaSalario = 0.0;
        
        if(sexo == 2) {
            somaSalario = salario;
        } else {
            somaSalario = 0;
        }
            
        return somaSalario;
    }
        
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salario = 0.0, somaSalarioM = 0.0, somaSalarioF = 0.0;
        int sexo = 0, i = 0;
        String resposta = null;
        
        do {
            i++;
            System.out.format("USUARIO: %d\n", i);
            System.out.print("DIGITE O SALARIO FUNCIONARIO: ");
            salario = scanner.nextDouble();
            System.out.println("[1]HOMEM\n[2]MULHER");
            sexo = scanner.nextInt();
            System.out.print("QUER CONTINUAR: [S/N]: ");
            resposta = scanner.next(); 
            
            somaSalarioM += contSalarioM(sexo, salario);
            somaSalarioF += contSalarioF(sexo, salario);
            
            System.out.println("");
        } while(!resposta.toUpperCase().equals("N"));
        
        System.out.format("TOTAL SALARIO HOMENS: %.2f\nTOTAL SALARIO MULHERES: %.2f",
                somaSalarioM, somaSalarioF);
    }
}

