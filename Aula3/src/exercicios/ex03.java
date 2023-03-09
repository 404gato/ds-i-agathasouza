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
public class ex03 {
    public static void main(String[] args) {
        
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor A"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor B"));
        int soma = a + b;
        
        JOptionPane.showMessageDialog(null, "O valor da soma " + soma);
        
    }
}
