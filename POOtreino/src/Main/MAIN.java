/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Classes.Caneta;
import Classes.Caneta;

/**
 *
 * @author CAMARGO
 */
public class MAIN {

    public static void main(String[] args) {  
        
        //CLASSE CANETAS
        
        Caneta c1 = new Caneta();
        c1.cor = "Vermelha";
        c1.Tampar();
        c1.Rabiscar();
        
        
        Caneta c2 = new Caneta();
        c2.cor = "Azul";
        c2.modelo = "simples";
        c2.carga = 100;
        c2.Destampar();
        c2.Status();
        
        
    }
    
}
