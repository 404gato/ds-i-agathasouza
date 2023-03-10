/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JOpt_EXERCICIOS_contapropria;

import javax.swing.JOptionPane;

/**
 *
 * @author CAMARGO
 */
public class joption_testes {
    public static void main(String[] args) {
        int y = 0;
        double etiqueta = 0;
        
        
        do{
       
        etiqueta = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do produto"));
       
        
        String[] x = {"Sim", "Não"};
        y = JOptionPane.showOptionDialog(null, "Adicionar mais um produto?",
                "Clique no botão",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, x, x[0]);
        
        } while(y == 0);
        
        System.out.println(etiqueta);
        
        
        
       
    }
    
}
