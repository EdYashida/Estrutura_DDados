public class ListaDinamica {
    no inicio;
    no fim;
    
    public void insere(no n){
        if(inicio==null){
            inicio=n;
            fim=n;
        }
        else{
         fim.proximo=n;
         fim=n;
        }
    }
    
    public void imprime(){
        no aux = inicio;
        while(aux!=null){
            System.out.println(aux.toString());
            aux=aux.proximo;
        }
    }
    
    public no busca(String procurado){
        no aux=inicio;
        
        while(aux!=null){
            if(aux.toString().contains(procurado)){
                return aux;
            }
            aux=aux.proximo;
        }
        return null;
    }
    
    public void remover(String tirar){
        no anterior = null;
        no remove = inicio;
        
        while(remove!=null){
            if(remove.toString().contains(tirar)){
                if(anterior!=null){
                    anterior.proximo=remove.proximo;
                    if(remove==fim){
                        fim=anterior;
                    }
                   remove.proximo=null;
                }
                
                else{
                    inicio = remove.proximo;
                    remove.proximo=null;
                    if(fim == remove){
                        fim=remove.proximo;
                    }
                }
            }
            anterior=remove;
            remove=remove.proximo;
        }
    }
}
