/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

public class Caneta {
    
        public String cor;
        public String modelo;
        public int carga;
        public boolean tampada;
        
        
        
        public void Status(){
            System.out.println("\nA caneta é " + this.cor + ", do modelo " + 
                        this.modelo + ", tem " + this.carga + "% de carga");
    }
        
        public void Tampar(){
            this.tampada = true;
    }
        public void Destampar(){
            this.tampada = false;
    }
        public void Rabiscar(){
        if(this.tampada == true){
            System.out.print("\nDestampe a caneta para poder rabiscar");
        }
        else{
            System.out.print("\nRABISCANDO...");
        }
    
        
        
        }
}
