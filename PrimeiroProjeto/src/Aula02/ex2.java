/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula02;

import java.util.Scanner;

/**
 *
 * @author CAMARGO
 */
public class ex2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
               
        
            System.out.println("Insira valor de a: ");
            int a = read.nextInt();
            System.out.println("Insira valor de b: ");
            int b = read.nextInt();
        
        int soma = a + b;          
        
        System.out.println("A soma de A + B é de " + soma);
        
        
    }
}
