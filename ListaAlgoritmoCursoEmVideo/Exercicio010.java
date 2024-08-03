/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio010.Exercicio010;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Exercicio010 {

    public static float inputLarguraParede(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Qual a largura da parede: m"); 
        float lP = input.nextFloat();
        
        return lP;
    }
    
    public static float inputAlturaParede() {
        Scanner input = new Scanner(System.in); 
        
        System.out.print("Qual a altura da parede: m");
        float aP = input.nextFloat();
        
        return aP;
    }
    
    
    public static float areaPintada(float lP, float aP) { 
        float a = lP*aP; 
        
        return a;
    }
    
    public static void main(String[] args) {
        float larguraParede; 
        float alturaParede;
        float area;
        float tintaNecessaria;
        
        larguraParede = inputLarguraParede(); 
        alturaParede = inputAlturaParede(); 
        
        area = areaPintada(larguraParede, alturaParede);
        tintaNecessaria = area/2; 
        
        System.out.format("Area a ser pintada: %.1fm2\n"
                + "Quantidade de tinta necessaria: %.1fL", area, tintaNecessaria);
    }
}
