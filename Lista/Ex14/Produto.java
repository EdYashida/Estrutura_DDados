public class Produto {
    
    String nomeProduto;
    double valor;
    int quantidade;
    
    public Produto(String n, double v, int q){
        
        this.nomeProduto = n;
        this.valor = v;
        this.quantidade = q;
        
    }
    
    @Override
    public String toString(){
        
        return "Nome do produto: "+this.nomeProduto+" Preço: "+this.valor+" Quantidade: "+this.quantidade;
    
    }
         
}
