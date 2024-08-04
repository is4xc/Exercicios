/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio030.Exercicio030;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Exercicio030 {
    
    public static int valorSegmento[] = new int[3];
      
    public static boolean verFormaTriangulo() {
        Scanner teclado = new Scanner(System.in);
        
        boolean triangulo = false;
        
        for(int i = 0; i < 3; i++) {
            System.out.format("Digite o tamanho do %dº seguimento: ", i+1);
            valorSegmento[i] = teclado.nextInt();
        }
        
        if(valorSegmento[0] >= valorSegmento[1] + valorSegmento[2]) {
            triangulo = false;
        } else if(valorSegmento[1] >= valorSegmento[0] + valorSegmento[2]) {
            triangulo = false;
        } else if(valorSegmento[2] >= valorSegmento[1] + valorSegmento[0]) {
            triangulo = false;
        } else {
            triangulo = true;
        }
        
        return triangulo;
    }

    public static String verificaTipoTriangulo(int a, int b, int c) {
        String tipoTriangulo = null; 
        
        if(a == b && b == c) {
            tipoTriangulo = "EQUILATERO";
        } else if(a != b && b != c && c != a) {
            tipoTriangulo = "ESCALENO";
        } else {
            tipoTriangulo = "ISOSCELES";
        }
        
        return tipoTriangulo;
    }
    
    public static void main(String[] args) {
        boolean formaTriangulo = false;
        String mensagemTriangulo = null;
        String tipoTriangulo = null; 
        
        formaTriangulo = verFormaTriangulo();
        
        mensagemTriangulo = (formaTriangulo)?"Verdadeiro":"Falso";
        
        System.out.format("Forma um triangulo? %s", mensagemTriangulo);
        
        if(formaTriangulo == true) {
            tipoTriangulo = verificaTipoTriangulo(valorSegmento[0], valorSegmento[1], valorSegmento[2]);
            System.out.format("\nTIPO DO TRIANGULO: %s", tipoTriangulo);
        }
    }
}

