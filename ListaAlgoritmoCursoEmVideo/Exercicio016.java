/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio016.Exercicio016;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Exercicio016 {

    public static int verQtdCigarroDia() {
        Scanner teclado = new Scanner(System.in); 
        
        System.out.print("Digite a quantidade de cigarro fumados p/dia: ");
        int qCd = teclado.nextInt();
        
        return qCd;
    }
    
    public static int verAnosFumados() {
        Scanner teclado = new Scanner(System.in); 
        
        System.out.print("Quantos anos voce ja fumou: "); 
        int qAf = teclado.nextInt();
        
        return qAf;
    }
    
    public static void main(String[] args) {
        
        int qtdCigarroDia = verQtdCigarroDia();
        int anosFumados = verAnosFumados();
        
        int perdaVidaMin = qtdCigarroDia * 10; 
        int cigarroFumadosAnual = anosFumados * 365;
        
        int totMin = perdaVidaMin * cigarroFumadosAnual; 
        
        int totDias = totMin / 1440; 
        
        System.out.format("Quantidade de dias perdidos: %d", totDias);
    }
}
