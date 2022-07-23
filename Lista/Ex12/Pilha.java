public class Pilha {
    
    No pilha[];
    int tamanho;
    int ponteiroFinal = -1;
    
    
    public Pilha(int tamanho){
        
        pilha = new No[tamanho];
        this.tamanho = tamanho;
        
    }

    public void empilha(No n){
        if(ponteiroFinal == -1 || ponteiroFinal < (this.tamanho-1)){
            
            ponteiroFinal++;
            pilha[ponteiroFinal] = n;
            System.out.println("Elemento inserido");
            
        }else{
            
            System.out.println("Pilha cheia");
            
        }      
        
    }
    
    public void desempilha(){
        if(ponteiroFinal != -1){
            pilha[ponteiroFinal] = null;
            ponteiroFinal--;
            System.out.println("Elemento removido");
            
        }else{
            
            System.out.println("Pilha vazia");
            
        }      
        
    }
    
    public void imprime(){
        for(int i = this.ponteiroFinal; i > 0; i--) {
            System.out.println(pilha[i].tostring());
        }
    }
    
}
