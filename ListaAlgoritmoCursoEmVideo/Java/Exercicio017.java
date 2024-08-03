/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio017.Exercicio017;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Exercicio017 {

    public static int verVelCarro() {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Qual a velocidade atual: km");
        int vC = teclado.nextInt();
        
        return vC;
    }
    
    public static boolean verSituacaoCondutor(int vC) {
        boolean sit = false;
        
        if(vC > 80) { 
            sit = true;
        } else {
            sit = false; 
        }
        
        return sit; 
    }
    
    public static void main(String[] args) {
        int velCarro; 
        
        velCarro = verVelCarro(); 
        
        boolean situacao = verSituacaoCondutor(velCarro);
        
        if(situacao == true) {
            int multa = (velCarro - 80) * 5; 
            System.out.format("Usuario Multado! R$%d", multa); 
        } else {
            System.out.print("Continue!");
        }
    }
}
