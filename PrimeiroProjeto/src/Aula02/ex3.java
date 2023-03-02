package Aula02;
import java.util.Scanner;

public class ex3 {
    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        
        System.out.println("Insira o valor de A: ");
        int a = read.nextInt();
        
        System.out.println("Insira o valor de B: ");
        int b = read.nextInt();
        
        int divisao = a / b;
        
        System.out.println("A divisão dos valores é de " + divisao);
        
    }
    
}
