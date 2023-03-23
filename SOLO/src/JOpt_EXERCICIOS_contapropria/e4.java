/*
  Elabore um algoritmo que calcule o que deve ser pago por um produto, considerando 
o preço normal de etiqueta e a escolha da condição de pagamento. 
Utilize os códigos da tabela a seguir para ler qual a condição de pagamento escolhida 
e efetuar o cálculo adequado.
Código Condição de pagamento
1 À vista em dinheiro ou débito, recebe 10% de desconto
2 À vista no cartão de crédito, recebe 15% de desconto
3 Em duas vezes no pix, preço normal de etiqueta sem juros
4 Em duas vezes no crédito, preço normal de etiqueta mais juros de 10%
 */
package JOpt_EXERCICIOS_contapropria;

import javax.swing.JOptionPane;


public class e4 {
    public static void main(String[] args) {
        
        double etiqueta, soma;
        int resposta;
        
        //produto e repetição
        do{
            etiqueta = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor na etiqueta?"));
            
            resposta = JOptionPane.showConfirmDialog(null, "Deseja digitar mais valores?");
        
        }while (resposta == JOptionPane.YES_OPTION);
           
       
        //pagamento parcelas
        String[] options = {"A vista", "2x"};
        int pag1 = JOptionPane.showOptionDialog(null, "FORMA DE PAGAMENTO",
                "Clique no botão",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        
        
        //A vista
        if(pag1 == 0){
            String[] optionsPag = {"Dinheiro", "Crédito", "Débito"};
            int pag2 = JOptionPane.showOptionDialog(null, "FORMA DE PAGAMENTO", "Clique no botão",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, optionsPag, optionsPag[0]);
            
            //dinheiro ou débito + desconto 10%
            if(pag2 == 0 || pag2 == 2){
                double desconto = (etiqueta * 10)/100;
                etiqueta = etiqueta - desconto;
                
                JOptionPane.showMessageDialog(null, "10% DE DESCONTO. O valor total a pagar é R$" + etiqueta);
            }
            //crédito + desconto 15%
            else{
                double desconto = (etiqueta * 15)/100;
                etiqueta = etiqueta - desconto;
                
                JOptionPane.showMessageDialog(null, "15% DE DESCONTO. O valor total a pagar é R$" + etiqueta);
            }
        }
        
        //2x
        else{
            String[] optionsPag = {"PIX", "Crédito"};
            int pag2 = JOptionPane.showOptionDialog(null, "FORMA DE PAGAMENTO", "Clique no botão",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, optionsPag, optionsPag[0]);
            
            //pix
            if(pag2 == 0){
                double parcela = etiqueta / 2;
                             
                JOptionPane.showMessageDialog(null, "O valor de cada parcela é de R$" + parcela);
            }
            //crédito + juros 10%
            else{
                double juros = (etiqueta * 10)/100;
                etiqueta = etiqueta + juros;             
                double parcela = etiqueta / 2;
                
                JOptionPane.showMessageDialog(null, "O valor de cada parcela é de R$" + parcela);
            }
        }
        
        //JOptionPane.showMessageDialog(null, "Seu pagamento é de " + pag1);
    
       
        
    }
    
    
    
}
