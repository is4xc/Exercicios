/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio015.Exercicio015;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Exercicio015 {

    public static int verDiasTrabalhados(int dT, int sPd) {
        int tot = dT * sPd; 
        
        return tot; 
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        
        int diasTrabalhados = 0; 
        int salarioPdia = 8 * 25; 
        int salarioFuncionario;
        
        System.out.print("Digite quantidade de dias trabalhados: "); 
        diasTrabalhados = teclado.nextInt();
        
        salarioFuncionario = verDiasTrabalhados(diasTrabalhados, salarioPdia);
        
        System.out.format("Salario total do funcionario: R$%d", salarioFuncionario);
    }
}
