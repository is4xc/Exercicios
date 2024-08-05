/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio035.Exercicio035;

import java.util.*;

/**
 *
 * @author isaac
 */
public class Exercicio035 {

    public static Scanner scanner = new Scanner(System.in);
    
    public static double calcTotal(int carro, int aluguel, float km) {
        double total = 0.0;
        int diaria = 0;
        float taxaKM = 0f;
                
        switch(carro) {
            case 1:
                diaria = 90;
                if(km <= 100) {
                    taxaKM = 0.20f;
                } else {
                    taxaKM = 0.10f;
                }
                total = (aluguel * diaria) + (km * taxaKM);
            break;
            case 2:
                diaria = 150;
                if(km <= 200) {
                    taxaKM = 0.30f;
                } else {
                    taxaKM = 0.25f;
                }
                total = (aluguel * diaria) + (km * taxaKM);
            break;
        }
        return total;
    }
    
    public static void main(String[] args) {
        int tipoCarro = 0, diaAlugado = 0;
        float kmRodado = 0f;
        double totalPagar = 0.0;
        
        do {
            System.out.println("[1] CARRO POPULAR");
            System.out.println("[2] CARRO LUXUOSO");
            tipoCarro = scanner.nextInt();
            
            if(tipoCarro < 1 || tipoCarro > 2) {
                System.out.print("\nNUMERO INVALIDO\n");
            }
            
        } while(tipoCarro < 1 || tipoCarro > 2);
        
        System.out.print("QUANTOS DIAS ALUGADO: ");
        diaAlugado = scanner.nextInt(); 
        System.out.print("KILOMETRAGEM RODADA: ");
        kmRodado = scanner.nextFloat();
        
        totalPagar = calcTotal(tipoCarro, diaAlugado, kmRodado);
        
        System.out.format("TOTAL: R$%.2f", totalPagar);
    }
}
