/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio007.Exercicio007;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Exercicio007 {

    public static float preencheNumero() {
        Scanner input = new Scanner(System.in); 
        System.out.print("Digite um numero: "); 
        float n = input.nextFloat(); 
        
        return n; 
    }
    
    public static float calcDobro(float n) { 
        float d = n*2; 
        
        return d; 
    }
    
    public static float calcTercaParte(float n) { 
        float tP = n/3; 
        
        return tP; 
    }
    
    public static void main(String[] args) {
        float numero = preencheNumero(); 
        float dobro = calcDobro(numero); 
        float tercaParte = calcTercaParte(numero); 
        
        System.out.format("O dobro de %.1f é %.1f\n"
                + "A terça parte de %.1f é %.4f", numero, dobro, numero, tercaParte);
    }
}
