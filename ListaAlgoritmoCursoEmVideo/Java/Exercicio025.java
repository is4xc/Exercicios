/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio025.Exercicio025;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Exercicio025 {

    public static boolean verFormaTriangulo() {
        Scanner teclado = new Scanner(System.in);
        
        boolean triangulo = false;
        int valorSegmento[] = new int[3];
        
        for(int i = 0; i < 3; i++) {
            System.out.format("Digite o tamanho do %dº seguimento: ", i+1);
            valorSegmento[i] = teclado.nextInt();
        }
        
        if(valorSegmento[0] > valorSegmento[1] + valorSegmento[2]) {
            triangulo = false;
        } else if(valorSegmento[1] > valorSegmento[0] + valorSegmento[2]) {
            triangulo = false;
        } else if(valorSegmento[2] > valorSegmento[1] + valorSegmento[0]) {
            triangulo = false;
        } else {
            triangulo = true;
        }
        
        return triangulo;
    }
    
    public static void main(String[] args) {
        boolean formaTriangulo = false;
        String mensagemTriangulo = null;
        
        formaTriangulo = verFormaTriangulo();
        
        mensagemTriangulo = (formaTriangulo)?"Verdadeiro":"Falso";
                
        System.out.format("Forma um triangulo? %s", mensagemTriangulo);
    }
}
