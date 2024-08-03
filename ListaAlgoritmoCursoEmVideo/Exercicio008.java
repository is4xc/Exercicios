/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio008.Exercicio008;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Exercicio008 {

    public static float inputDistanciaMetros() {
        Scanner input = new Scanner(System.in); 
        
        System.out.print("Digite uma distancia em metros: "); 
        float dM = input.nextFloat(); 
        
        return dM; 
    }
    
    public static void main(String[] args) {
        float distanciaMetros = inputDistanciaMetros(); 
        
        //Exibicao
        System.out.format("A distancia de %.2f corresponde a: \n", distanciaMetros);
        System.out.format("%.5f KM\n", distanciaMetros/1000); 
        System.out.format("%.4f Hm\n", distanciaMetros/100); 
        System.out.format("%.3f Dam\n", distanciaMetros/10); 
        System.out.format("%.1f dm\n", distanciaMetros*10); 
        System.out.format("%.1f cm\n", distanciaMetros*100); 
        System.out.format("%.1f mm\n", distanciaMetros*1000); 
                
    }
}
