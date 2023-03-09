package JOpt_EXERCICIOS_contapropria;
//Faça um algoritmo que leia o nome, o sexo e o estado civil de uma pessoa. 
//Caso sexo seja “F” e estado civil seja “CASADA”, solicitar o tempo de casada (anos).

import javax.swing.JOptionPane;




public class e1 {
    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog("Digite seu nome");
        String sexo = JOptionPane.showInputDialog("Digite seu sexo (M ou F");
        String estadoCivil = JOptionPane.showInputDialog("Qual seu estado civil?");
        
        if(estadoCivil.equals("Casada") && sexo.equals("F")){
            String anosCasado = JOptionPane.showInputDialog("Quantos anos de casada?"); 
            
            JOptionPane.showMessageDialog(null, "Seu nome é " + nome + " você é " + sexo + " e é " + estadoCivil + " há " + anosCasado + " anos.");
        }
        else{
            JOptionPane.showMessageDialog(null, "Seu nome é " + nome + " você é " + sexo + " e é " + estadoCivil);
        }
        
        
    }
    
}
