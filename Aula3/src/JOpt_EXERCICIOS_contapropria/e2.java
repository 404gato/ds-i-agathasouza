/* Faça um algoritmo para receber um número qualquer e informar na tela 
se é par ou ímpar.*/
package JOpt_EXERCICIOS_contapropria;

import javax.swing.JOptionPane;

public class e2 {
    public static void main(String[] args) {
        
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        
        if (num % 2 == 0){
            JOptionPane.showMessageDialog(null, "Seu número é PAR");
        }
        else{
            JOptionPane.showMessageDialog(null, "Seu número é ÍMPAR");
        }
        
    }
    
}
