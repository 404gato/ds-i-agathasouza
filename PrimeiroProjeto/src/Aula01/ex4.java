
package Aula01;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        int a, b;
        
        System.out.println("Insira o valor de A: ");
        a = read.nextInt();
        
        System.out.println("Insira o valor de B: ");
        b = read.nextInt();
        
        int soma = a + b;
        
        System.out.println("A soma dos valores é de " + soma);
        
    }
}
