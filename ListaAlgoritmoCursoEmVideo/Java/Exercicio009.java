/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio009.Exercicio009;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Exercicio009 {

    public static double verQtdDinheiro() {
        Scanner input = new Scanner(System.in); 
        
        System.out.print("Quantidade de R$ disponivel: "); 
        double dR$ = input.nextDouble(); 
        
        double dU$ = dR$/5.61; 
        
        return dU$; 
    }
    
    public static void main(String[] args) {
        
        double dinheiroU$ = verQtdDinheiro(); 
        
        System.out.format("Voce possui US%.2f em US", dinheiroU$); 
        
    }
}
