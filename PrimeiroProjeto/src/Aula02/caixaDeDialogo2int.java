
package Aula02;

import javax.swing.JOptionPane;

public class caixaDeDialogo2int {
    public static void main(String[] args){
        
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
        
        JOptionPane.showMessageDialog(null, "Sua idade é " + idade);
        
        
        
    }
    
}
