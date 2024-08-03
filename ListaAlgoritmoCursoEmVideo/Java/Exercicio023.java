/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio023.Exercicio023;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Exercicio023 {

    public static String verNome() {
        Scanner teclado = new Scanner(System.in);   
        String n = null;
        
        System.out.print("Nome: ");
        n = teclado.nextLine();
        
        return n;
    }
    
    public static String verSexo() {
        Scanner teclado = new Scanner(System.in);
        String s;
        
        do {
            System.out.print("Digite seu sexo [M/F]: ");
            s = teclado.nextLine();
            
        } while(!(s.equals("M") || s.equals("m") || s.equals("F") || s.equals("f")));
        
        return s;
    }
    
    public static double verValor(String s) {
        Scanner teclado = new Scanner(System.in);
        double v = 0.0;
        double vDesconto = 0.0; 
        
        System.out.print("Digite o valor do produto: ");
        v = teclado.nextDouble();
        
        if(s.equals("M")) {
            vDesconto = v - (v * 0.05);
        } else {
            vDesconto = v - (v *0.13);
        }
        
        return vDesconto;
    }
    
    public static void main(String[] args) {
        String nome;
        String sexo;
        double valor;
        
        nome = verNome();
        sexo = verSexo();
        valor = verValor(sexo.toUpperCase());
        
        System.out.format("Valor da compra com desconto: %.2f\nSexo: %s", valor, sexo);
        
    }
}
