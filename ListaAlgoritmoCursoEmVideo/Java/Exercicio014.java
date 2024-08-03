/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio014.Exercicio014;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Exercicio014 {

    public static int verKm() {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Quantos kilometros o carro percorreu: "); 
        int kmP = teclado.nextInt();
        
        return kmP;
    }
    
    public static int verDiasAlugado() {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Quantos dias o carro foi alugado: "); 
        int dA = teclado.nextInt();
        
        return dA;
    }
    
    public static double calcTotal(int k, int d) {
        double tot = (d * 90) + (k * 0.20); 
        
        return tot;
    }
    
    public static void main(String[] args) {
        int km = 0; 
        int diasAlugado = 0;
        double totalPagar = 0;
        
        km = verKm(); 
        diasAlugado = verDiasAlugado(); 
        
        totalPagar = calcTotal(km, diasAlugado); 
        
        System.out.format("PREÇO TOTAL A PAGAR: R$%.2f", totalPagar); 
    }
}
