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
public class ex04FUNCALC {
    public static void main(String[] args) {
       
        Funcalc funcao = new Funcalc();
        
        String op = JOptionPane.showInputDialog("Digite um operador ( + - * / )");
        
        if(op.equals("+")){
            funcao.soma();              
        }
        else if(op.equals("-")){
            funcao.sub();
        }
        else if(op.equals("*")){
            funcao.mult();
        }
        else if(op.equals("/")){
            funcao.div();
        }
        else{
            JOptionPane.showMessageDialog(null, "Operador Inválido");
        }
    }
    
    
}
