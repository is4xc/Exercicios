/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio043.Exercicio043;

/**
 *
 * @author isaac
 */
public class Exercicio043 {

    public static void contagem() {
        for(int i = 30; i >= 0; i--) {
            if(i % 4 == 0) {
                System.out.format("[%d] ", i);
            } else {
                System.out.print(i + " ");
            }
        }
    }
    
    public static void main(String[] args) {
        contagem();
    }
}
