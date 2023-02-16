//calcular a area do triangulo
package exercicios;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args){
        
        Scanner read = new Scanner(System.in);
        
        int a, b, h;
        
        System.out.println("Insira o valor da base do triangulo: ");
        b = read.nextInt();
        
        System.out.println("Insira o valor da altura do triangulo: ");
        h = read.nextInt();
        
        a = b * h / 2;
        
        System.out.println("A area do triangulo é: " + a);
        
        
    }
}
