package ex9;

public class Lista {
    
    int indice;
    int valor;
    
    public Lista(int indice, int valor){
        
        this.indice = indice;
        this.valor = valor;
        
    }
    
    public String toString(){
        
        return "Indice: "+this.indice+" Valor: "+this.valor;
    
    }  
}
