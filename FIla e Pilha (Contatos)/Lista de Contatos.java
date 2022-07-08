public class ListaContato{
  int ponteiro_final = -1;

  Contato lista[]=new Contato[10];
  

  public void preencheLista(Contato ci){
    if(ponteiro_final < this.lista.length){
      ponteiro_final++;
      lista[ponteiro_final]=ci;
    }
    else{
      System.out.println("A lista esta cheia!");
    }
  }

  public void mostrarLista(){
    System.out.println(lista[ponteiro_final].toString());
  }

  public int busca(String nome2){
    for(int i = 0; i <= ponteiro_final ; i++) {
      if (lista[i].nome.contains(nome2))
        return i;
    }
      return -1;
  } 

  public void remove(String nomeR){
    int posR = busca(nomeR);
    if(posR!=-1){
      for(int i=posR;i<ponteiro_final;i++){
        lista[i] = lista[i+1];
      }
      ponteiro_final--;
    }
    else{
      System.out.println(" Elemento nao encontrado ");
    }
    
  }

  public void insereInicio(Contato ci){
    if(ponteiro_final==-1){
      preencheLista(ci);
    }
      
    else if(ponteiro_final<(lista.length-1)){
      
      for(int i=ponteiro_final; i >= 0;i--){
        lista[i+1] = lista[i];
      }
      
      lista[0]=ci; 
      ponteiro_final++;
    }
      
    else{
      System.out.println("A lista esta cheia");
    }
  }

  public void insereOrdenado(Contato ci){
    
    if(ponteiro_final==-1){
      preencheLista(ci);
    }
      
    else if(ponteiro_final<(lista.length-1)){
      int posInsercao = ponteiro_final+1;
      
      for(int i=0;i<=ponteiro_final;i++){
        if(ci.nome.compareTo(lista[i].nome)<0){
          posInsercao=i;
          break;
        }
      }
      
      for(int i=ponteiro_final;i>=posInsercao;i--){
        lista[i+1] = lista[i];
      }
      
      lista[posInsercao] = ci;
      ponteiro_final++;
    }
      
    else{
      System.out.println("A lista esta cheia");
    }
    
  }
  
}
