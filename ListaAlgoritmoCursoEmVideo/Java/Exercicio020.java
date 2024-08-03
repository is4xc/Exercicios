/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio020.Exercicio020;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Exercicio020 {

    public static int verNumero() {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um numero: "); 
        int n = teclado.nextInt();
        
        return n;
    }
    
    public static String verTipoNumero(int n) {
        String t;
        
        if(n%2 == 0) { 
            t = "PAR";
        } else { 
            t = "IMPAR";
        }
        
        return t; 
    }
    
    public static void main(String[] args) {
        int numero = 0; 
        String tipo; 
        
        numero = verNumero(); 
        tipo = verTipoNumero(numero); 
        
        System.out.format("Numero %d: %s", numero, tipo);
    }
}
