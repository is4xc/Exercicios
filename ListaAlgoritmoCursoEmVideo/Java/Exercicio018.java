/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio018.Exercicio018;

import java.util.Scanner;
import java.time.Year;

/**
 *
 * @author isaac
 */
public class Exercicio018 {

    public static int verIdade() {
        Scanner teclado = new Scanner(System.in); 
        Year yearC = Year.now();
        int anoAtual = yearC.getValue();
        
        System.out.print("Digite seu ano de nascimento: ");
        int anoNasc = teclado.nextInt();
        
        int id = anoAtual - anoNasc;
        
        return id;
    }
    
    public static void main(String[] args) {
        int idade = verIdade(); 
        
        System.out.format("Idade: %d\n", idade); 
        
        if(idade >= 18) {
            System.out.print("Pode votar");
        } else {
            System.out.print("Não pode votar");
        }
    }
}
