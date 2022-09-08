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
}
