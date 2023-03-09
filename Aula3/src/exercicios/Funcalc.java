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
public class Funcalc {
    
    void soma(){
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor A"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor B"));
        int soma = a + b;
        
        JOptionPane.showMessageDialog(null, "O valor da soma " + soma);
        
    }
    
    void sub(){
        int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor A"));
        int d = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor B"));
        int sub = c - d;
        
        JOptionPane.showMessageDialog(null, "O valor da subtração é " + sub);
    }
    
    void mult(){
        double e = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor A"));
        double f = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor B"));
        double multp = e * f;
        
        JOptionPane.showMessageDialog(null, "O valor da multiplicação é " + multp);
    }
    
    void div(){
        double g = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor A"));
        double h = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor B"));
        double div = g / h;
        
        JOptionPane.showMessageDialog(null, "O valor da divisão é " + div);
    }
    
}
