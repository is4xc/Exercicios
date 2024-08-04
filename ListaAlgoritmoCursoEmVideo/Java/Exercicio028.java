/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio028.Exercicio028;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Exercicio028 {
    
    public static Scanner teclado = new Scanner(System.in);
    
    public static float preencheLargura() {
        float largura = 0;
        
        System.out.print("DIGITE A LARGURA DO TERRENO: ");
        largura = teclado.nextFloat();
        
        return largura;
    }
    
    public static float preencheComprimento() {
        float comprimento = 0;
        
        System.out.print("DIGITE O COMPRIMENTO DO TERRENO: ");
        comprimento = teclado.nextFloat();
        
        return comprimento;
    }
    
    public static float calculaArea(float largura, float comprimento) {
        float area = 0;
        
        area = largura*comprimento;
        
        return area;
    }
    
    public static String verificaClassificaoTerreno(float area) {
        String classificaTerreno = null; 
        
        if(area < 100) {
            classificaTerreno = "TERRENO POPULAR";
        } else if( area <= 500) {
            classificaTerreno = "TERRENO MASTER";
        } else {
            classificaTerreno = "TERRENO VIP";
        }
        
        return classificaTerreno; 
    }
    
    public static void main(String[] args) {
        float larguraTerreno = 0;
        float comprimentoTerreno = 0;
        float area = 0;
        String classificaoTerreno = null;
        
        larguraTerreno = preencheLargura();
        comprimentoTerreno = preencheComprimento();
        
        area = calculaArea(larguraTerreno, comprimentoTerreno);
        
        classificaoTerreno = verificaClassificaoTerreno(area);
        
        System.out.format("AREA DO TERRENO: %.2fm²\nCLASSIFICACAO DO TERRENO: %s",
                area, classificaoTerreno);
    }
}
