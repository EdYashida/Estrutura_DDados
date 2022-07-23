public class Fila {
    
    No fila[];
    int tamanho = 5;
    int ponteiroInicio = -1;
    int ponteiroFinal =-1;
    
    
    public Fila(int tamanho){
        
        this.fila = new No[tamanho];
        this.tamanho = tamanho;
        
    }
    
    public void inserir(No n){
        
        if(ponteiroInicio == -1){
            
            ponteiroInicio = 0;
            ponteiroFinal = 0;
            fila[ponteiroFinal] = n;
            System.out.println("Elemento inserido");
            
        }
        else if(ponteiroFinal < (tamanho-1)){
            
            ponteiroFinal++;
            fila[ponteiroFinal] = n;
            System.out.println("Elemento inserido");
            
        }
        else{
            
            System.out.println("Nao foi possivel inserir");
            
        }
        
    }
    
    public void remover(){
        
        if(ponteiroInicio != -1){
            
            for(int i = ponteiroInicio; i < ponteiroFinal; i++){
                
                fila[i] = fila[i+1];
                
            }
            fila[ponteiroFinal] = null;
            ponteiroFinal--;
            System.out.println("Elemento removido");
            
        }
        else{
            
            System.out.println("Lista vazia");
            
        }
        
    }
    
    public void imprime(){
        for (int i = this.ponteiroInicio; i <= this.ponteiroFinal; i++) {
            System.out.println(fila[i].tostring());
        }
    }
     
}
