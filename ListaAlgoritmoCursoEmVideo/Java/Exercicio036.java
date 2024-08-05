/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio036.Exercicio036;

import java.util.*;
/**
 *
 * @author isaac
 */
public class Exercicio036 {

    public static Scanner scanner = new Scanner(System.in);
    
    public static int preencheDadosInt() {
        int dado = 0;
        
        dado = scanner.nextInt();
        
        return dado;
    }
    
    public static double converteHorasPontos(int horaAtividade) {
        double totValor = 0.0;
        int pontosGanhos = 0;
        
        if(horaAtividade < 10) {
            pontosGanhos = 2;
        } else if(horaAtividade <= 20) {
            pontosGanhos = 5;
        } else {
            pontosGanhos = 10;
        }
        
        totValor = (pontosGanhos * 0.05) * horaAtividade;
        
        return totValor;
    }
    
    public static void main(String[] args) {
        int horasAtividade = 0;
        int totalPontos = 0;
        double dinheiroGanho = 0.0;
        
        System.out.print("QUANTAS HORAS VOCE PRATICOU ATIVIDADE FISICA ESTE MES? ");
        horasAtividade = preencheDadosInt();
        dinheiroGanho = converteHorasPontos(horasAtividade);
        System.out.format("HORAS VALIDAS DE ATIVIDADE: %d\nTOTAL RECEBIDO: R$%.2f", 
                horasAtividade, dinheiroGanho);
    }
}
