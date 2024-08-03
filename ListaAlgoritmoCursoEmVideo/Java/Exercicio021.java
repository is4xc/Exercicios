/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio021.Exercicio021;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Exercicio021 {

    public static int verAno() {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("ANO: ");
        int a = teclado.nextInt();
        
        return a;
    }
    
    public static boolean verAnoBissexto(int an) {
        boolean vAb; 
        
        if((an%4 == 0 && an%100 != 0) || (an%400 == 0)) {
            vAb = true;
        } else {
            vAb = false;
        }
        
        return vAb;
    }
    
    public static void main(String[] args) {
        int ano = verAno(); 
        boolean anoBissexto = false; 
        
        anoBissexto = verAnoBissexto(ano); 
        
        if(anoBissexto == true) { 
            System.out.print("ANO BISSEXTO");
        } else {
            System.out.print("ANO NÃO BISSEXTO");
        }
        
    }
}
