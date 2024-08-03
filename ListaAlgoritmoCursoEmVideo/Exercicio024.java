/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio024.Exercicio024;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Exercicio024 {

    public static int verKm() {
        Scanner teclado = new Scanner(System.in);
        int k = 0;
        
        System.out.print("Qual distancia deseja percorrer: km");
        k = teclado.nextInt();
        
        return k;
    }
    
    public static double verPrecoPassagem(int k) {
        double p;
        
        if(k <= 200) {
            p = k * 0.50;
        } else {
            p = k * 0.45;
        }
        
        return p;
    }
    
    public static void main(String[] args) {
        int km = verKm();
        double precoPassagem = verPrecoPassagem(km);
        
        System.out.format("O valor da sua viagem é: R$%.2f", precoPassagem);
    }
}
