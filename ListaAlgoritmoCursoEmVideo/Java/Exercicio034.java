/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio034.Exercicio034;

import java.util.*;

/**
 *
 * @author isaac
 */
public class Exercicio034 {

    public static Scanner scanner = new Scanner(System.in);
    
    public static float preencheValor() {
        float valorFloat = 0f;
        
        valorFloat = scanner.nextFloat();
        
        return valorFloat;
    }
        
    public static float calcIMC(float peso, float altura) {
        float result = 0f;
        
        result = peso / ((int) (Math.pow(altura, 2)));
        
        return result;
    }
    
    public static String classificaIMC(float imc) {
        String classificao = null;
        
        if(imc < 18.5) {
            classificao = "ABAIXO DO PESO!";
        } else if(imc < 25) {
            classificao = "PESO IDEAL";
        } else if(imc < 30) {
            classificao = "SOBREPESO";
        } else if(imc < 40) {
            classificao = "OBESIDADE";
        } else {
            classificao = "OBESIDADE MÓRBIDA";
        }
            
        return classificao;
    }
    
    public static void main(String[] args) {
        float peso = 0f, 
              altura = 0f,
              imc = 0f;
        String classificaoIMC = null;
        
        System.out.print("DIGITE SEU PESO: kg");
        peso = preencheValor();
        
        System.out.print("DIGITE SUA ALTURA: m");
        altura = preencheValor();
        
        imc = calcIMC(peso, altura);
        classificaoIMC = classificaIMC(imc);
        
        System.out.format("IMC: %.2f\nCLASSIFICAO: %s", imc, classificaoIMC);
    }
}
