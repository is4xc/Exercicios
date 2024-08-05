/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio033.Exercicio033;

import java.util.*;

/**
 *
 * @author isaac
 */
public class Exercicio033 {
    
    public static Scanner scanner = new Scanner(System.in);
    
    public static double solicitaValor() {
        double guardaValor = 0.0;
        guardaValor = scanner.nextDouble();
        
        return guardaValor;
    }
    
    public static float calcPorcentagemSal(double salarioMensal) {
        float porcentoSalario = 0f;
            
        porcentoSalario = (float) (salarioMensal * 0.30);
        
        return porcentoSalario;
    }
    
    public static void main(String[] args) {
        double valorEmprestimo = 0.0, salarioMensal = 0.0;
        int parcelaAnos = 0;
        float porcentagemSalarial = 0f, parcelaMes = 0f;
        String situacaoEmprestimo = null;
        
        System.out.print("DIGITE O VALOR DO EMPRESTIMO: R$");
        valorEmprestimo = solicitaValor();
        
        System.out.print("DIGITE SEU SALARIO MENSAL: R$");
        salarioMensal = solicitaValor();
        
        System.out.print("DIGITE EM QUANTOS ANOS IRA PARCELAR: ");
        parcelaAnos = scanner.nextInt();
        
        parcelaMes = (float)valorEmprestimo / (parcelaAnos * 12);
        porcentagemSalarial = calcPorcentagemSal(salarioMensal);
        
        situacaoEmprestimo = (parcelaMes < porcentagemSalarial)?"EMPRESTIMO APROVADO":"EMPRESTIMO NEGADO";
        System.out.print(situacaoEmprestimo + "!");
    }
}
