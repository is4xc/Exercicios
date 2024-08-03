/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio022.Exercicio022;

import java.time.Year;
import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Exercicio022 {

    public static int verIdade() {
        Scanner teclado = new Scanner(System.in);
        Year data = Year.now(); 
        int anoAtual = data.getValue();  
        
        System.out.print("Digite o ano de nascimento: "); 
        int anoNasc = teclado.nextInt();
        int i = anoAtual - anoNasc; 
        
        return i; 
    }
    
    public static boolean verSit(int i) {
        boolean s = false;
        
        if(i < 18) { 
            s = false;
        } else {
            s = true;
        }
        
        return s;
    }
    
    public static void main(String[] args) {
        int idade = 0; 
        boolean sit = false;
        
        idade = verIdade(); 
        sit = verSit(idade); 
        
        if(sit == false) {
            int fIdade = 0;
            fIdade = 18 - idade; 
            System.out.format("Ainda falta %d anos para o alistamento", fIdade);
        } else {
            int aIdade = 0;
            aIdade = Math.abs(idade - 18); 
            System.out.format("Ja se passaram %d ano(s) para o alistamento", aIdade);
        }
    }
}
