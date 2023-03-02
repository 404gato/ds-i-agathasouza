
package Classes;


public class Celular {
    
    public String marca;
    public String modelo;
    public String cor;
    public int ramGB;
    public int carga;
    public boolean carrega;
    public boolean desbloqueia;
    
    
    public void Desbloquear(){
        this.desbloqueia = true;
    }
    
    public void Bloquear(){
        this.desbloqueia = false;
    }
    
    public void Carrega(){
        this.carrega = true;
    }
    
    public void TirarCarrega(){
        this.carrega = false;
    }
    
    
    
    
}
