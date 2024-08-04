/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio029.Exercicio029;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Exercicio029 {

    public static Scanner teclado = new Scanner(System.in);
    
    public static String preencheNomeFuncionario() {
        String nomeFuncionario = null;
        
        System.out.print("Digite o nome do funcionario: ");
        nomeFuncionario = teclado.nextLine();
        
        return nomeFuncionario;
    }
    
    public static double preencheSalarioFuncionario() {
        double salarioFuncionario = 0.0;
        
        System.out.print("Digite o salario do funcionario: ");
        salarioFuncionario = teclado.nextDouble();
        
        return salarioFuncionario;
    }
    
    public static int preencheAnosTrabalhados() {
        int anosTrabalhados = 0 ; 
        
        System.out.print("Quantos anos voce trabalha na empresa: ");
        anosTrabalhados = teclado.nextInt();
        
        return anosTrabalhados;
    }
    
    public static float verificaAumentoSalario(int anosTrabalhados) {
        float porcentoAumento = 0;
        
        if(anosTrabalhados < 4) {
            porcentoAumento = 0.03f;
        } else if(anosTrabalhados < 10) {
            porcentoAumento = 0.125f;
        } else {
            porcentoAumento = 0.20f;
        }
        
        return porcentoAumento;
    }
    
    public static double calculaAumentoSalario(double salarioFuncionario ,float porcentoAumentoSalario) {
        double novoSalario = 0.0;
        
        novoSalario += salarioFuncionario + (salarioFuncionario * porcentoAumentoSalario);
        
        return novoSalario;
    }
    
    public static void main(String[] args) {
        String nomeFuncionario = null;
        double salarioFuncionario = 0.0;
        int anosTrabalhados = 0;
        double novoSalarioFuncionario = 0.0;
        float porcentoAumentoSalario = 0;
        
        nomeFuncionario = preencheNomeFuncionario();
        salarioFuncionario = preencheSalarioFuncionario();
        anosTrabalhados = preencheAnosTrabalhados();
        
        porcentoAumentoSalario = verificaAumentoSalario(anosTrabalhados);
        
        novoSalarioFuncionario = calculaAumentoSalario(salarioFuncionario, porcentoAumentoSalario);
        
        System.out.format("NOME DO FUNCIONARIO: %s\n", nomeFuncionario);
        System.out.format("ANOS TRABALHADOS: %d\n", anosTrabalhados);
        System.out.format("AUMENTO DO SALARIO EM %.3f porcento \n", porcentoAumentoSalario*100);
        System.out.format("NOVO SALARIO: %.3f", novoSalarioFuncionario);
    }
}
