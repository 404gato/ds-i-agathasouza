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
public class ex05FUNCALC {
    public static void main(String[] args) {
        Funcalc funcao = new Funcalc();
        
        try{
            int op = Integer.parseInt(JOptionPane.showInputDialog("Digite o operador"));
            
            if (op == 1){
                funcao.soma();
            }
            else if(op == 2){
                funcao.sub();
            }
            else if (op == 3){
                funcao.div();
            }
            else if (op == 4){
                funcao.mult();
            }
            else{
                
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Valor inválido");
        }
    }
    
}
