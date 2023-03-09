/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author CAMARGO
 */
public class ex06 {
    public static void main(String[] args) {
        
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do lado A"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do lado B"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do lado C"));
        
        if(a == b && b == c && a == c){
            JOptionPane.showMessageDialog(null, "TRIÂNGULO EQUILÁTERO");
        }
        
    }
}
