public class Pilha {
    No inicio;
    No fim;
    
    public void empilha(No p){
       if(inicio==null){
           inicio=p;
           fim=p;
           
       }
       else{
           fim.proximo=p;
           p.anterior=fim;
           fim=p;    
       }
   }
    
    public void desempilha(){
        if(inicio==fim){
        fim=null;
        inicio=null;
        }
        else{
           fim=fim.anterior;
           fim.proximo=null;
        }
    }
    
    public void imprimir(){
        No aux=inicio;
        
        while(aux!=null){
            System.out.println(aux.toString());
            aux=aux.proximo;
        }
    }
}
