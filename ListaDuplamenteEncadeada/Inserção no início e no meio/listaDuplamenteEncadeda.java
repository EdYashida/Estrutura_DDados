public class Lista {
    
    No inicio;
    No fim;
    
    public void insereFinal(No n){
        if (inicio == null){
            inicio = n;
            fim = n;
        }
        else{
            fim.setProximo(n);
            n.setAnterior(fim);
            fim = n;
        }
    }
    
    public void insereInicio(No n){
            inicio.setAnterior(n);
            n.setProximo(inicio);
            inicio = n;
        
    
    }
    
    public void insereMeio(String conteudo,No n){
        No aux = inicio;
        No elAnt = null ;
        No elProx = null;
            
            
        while(aux!=null){
            if (aux.toString().contains(conteudo)){
                
                break;
            }
            aux=aux.getProximo();
            elAnt = aux;
            elProx = aux.getProximo();
            
        }
            n.setAnterior(elAnt);
            n.setProximo(elProx);
            
            elProx.setAnterior(n);
            elAnt.setProximo(n);

    }
    
    public void imprime(){
        No aux = inicio;
        while (aux!=null){
            System.out.println(aux.toString());
            aux = aux.getProximo();
        }

    }
}
