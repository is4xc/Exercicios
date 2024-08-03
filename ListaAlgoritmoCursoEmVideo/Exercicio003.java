/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio003.Exercicio003;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Exercicio003 {
    public static Scanner input = new Scanner(System.in); 

    public static String inputNome() {
        System.out.print("Nome do funcionario: "); 
        String nome = input.nextLine(); 
        
        return nome; 
    }
    
    public static float inputSalario() { 
        System.out.print("Salario do funcionario: "); 
        float salario = input.nextFloat(); 
        
        return salario; 
    }
    
    public static void main(String[] args) {
        String nomeFuncionario = inputNome(); 
        float salarioFuncionario = inputSalario(); 
        
        System.out.format("O funcionario %s tem um salario de R$%.2f em Junho", 
                nomeFuncionario, 
                salarioFuncionario); 
    }
}
