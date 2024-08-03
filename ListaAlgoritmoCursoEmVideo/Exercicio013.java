/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio013.Exercicio013;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Exercicio013 {

    public static double verSalFuncionario() {
        Scanner entradaTeclado = new Scanner(System.in); 
        double sF;
        
        System.out.print("Salario do funcionario: R$"); 
        sF = entradaTeclado.nextDouble();
        
        return sF;
    }
    
    public static double calcNovoSal(double sF) {
        double nS = sF + (sF * 0.15); 
        
        return nS;
    }
    
    public static void main(String[] args) {
        double salarioFuncionario = 0, novoSalario = 0; 
        
        salarioFuncionario = verSalFuncionario(); 
        novoSalario = calcNovoSal(salarioFuncionario); 
        
        System.out.format("Salario antigo: R$%.2f\nSalario Atual: R$%.2f", salarioFuncionario,
                novoSalario);
    }
}
