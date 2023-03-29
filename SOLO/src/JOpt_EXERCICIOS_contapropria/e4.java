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
        
        double etiqueta, somaEtiqueta = 0;
        int resposta;
        
        //produto e repetição
        do{
            etiqueta = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor na etiqueta?"));
            
            resposta = JOptionPane.showConfirmDialog(null, "Deseja digitar mais valores?");
            
            somaEtiqueta += etiqueta;
        
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
                double desconto = (somaEtiqueta * 10)/100;
                double valorFinal = somaEtiqueta - desconto;
                
                JOptionPane.showMessageDialog(null,"Você recebeu 10% DE DESCONTO. \n" + 
                        "Sua compra de R$" + somaEtiqueta + " ficará por R$" + valorFinal);
            }
            //crédito + desconto 15%
            else{
                double desconto = (somaEtiqueta * 15)/100;
                double valorFinal = somaEtiqueta - desconto;
                
                JOptionPane.showMessageDialog(null, "Você recebeu 15% DE DESCONTO. \n" + 
                        "Sua compra de R$" + somaEtiqueta + " ficará por R$" + valorFinal);
            }
        }
        
        //2x
        else{
            String[] optionsPag = {"PIX", "Crédito (juros 10%)"};
            int pag2 = JOptionPane.showOptionDialog(null, "FORMA DE PAGAMENTO", "Clique no botão",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, optionsPag, optionsPag[0]);
            
            //pix
            if(pag2 == 0){
                double parcela = somaEtiqueta / 2;
                             
                JOptionPane.showMessageDialog(null, "O total da sua compra é de R$" + somaEtiqueta + 
                        "\nO valor de cada parcela a pagar é de R$" + parcela);
            }
            //crédito + juros 10%
            else{
                double juros = (somaEtiqueta * 10)/100;
                double valorFinal = somaEtiqueta + juros;             
                double parcela = valorFinal / 2;
                
                JOptionPane.showMessageDialog(null, "O total da sua compra com os juros é de R$" + valorFinal + 
                        "\nO valor de cada parcela a pagar é de R$" + parcela);
            }
        }
        
        //JOptionPane.showMessageDialog(null, "Seu pagamento é de " + pag1);
    
       
        
    }
    
    
    
}
