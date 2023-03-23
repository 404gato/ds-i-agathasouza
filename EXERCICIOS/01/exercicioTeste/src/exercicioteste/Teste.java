package exercicioteste;

import javax.swing.JOptionPane;

public class Teste {

    public static void main(String[] args) {
        
        
        
        
        String[] options = {"Triângulo", "Quadrado", "Retângulo"}; 

        int forma = JOptionPane.showOptionDialog(null, "Qual área deseja calcular?", 

                "Clique no botão", 

                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,  

                null, options, options[0]); 

         

         

        if(forma == 0){ 

            int b = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor da BASE?")); 

            int h = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor da ALTURA?")); 

             

            int a = (b * h) / 2; 

             

            JOptionPane.showMessageDialog(null, "A área do triângulo é de " + a); 

        } 
        
        else if (forma == 1){
            
            int b = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor de um dos LADOS?"));
            
            int a = b*b;
            
            JOptionPane.showMessageDialog(null, "A área do quadrado é de " + a); 
            
        }
        
        else{
            
            int b = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor da BASE?")); 

            int h = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor da ALTURA?")); 
            
            int a = b * h;
            
            JOptionPane.showMessageDialog(null, "A área do retângulo é de " + a);
            
        }
    }
    
}
