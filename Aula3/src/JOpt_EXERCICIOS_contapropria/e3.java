/*Faça um algoritmo que leia dois valores inteiros A e B se os valores forem iguais deverá se
somar os dois, caso contrário multiplique A por B. Ao final de qualquer um dos cálculos deve-se 
atribuir o resultado para uma variável C e mostrar seu conteúdo na tela. */
package JOpt_EXERCICIOS_contapropria;

import javax.swing.JOptionPane;


public class e3 {
    public static void main(String[] args) {
        
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A"));
        
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B"));
        
        if (a == b){
            int c = a + b;
            
            JOptionPane.showMessageDialog(null, "A soma desses valores é " + c);
        }
        
        else{
            int c = a * b;
            
            JOptionPane.showMessageDialog(null, "A multiplicação desses valores é " + c);
        }
        
    }
    
}
