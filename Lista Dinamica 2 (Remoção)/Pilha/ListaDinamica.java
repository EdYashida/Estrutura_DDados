public class ListaDinamica{
  No inicio;
  No fim;

  public void insere(No n){
    if (inicio == null){
        inicio = n;
        fim = n;
    }
    else{
      fim.proximo = n;
      fim = n;
    }
  }

public void imprime(){
  No aux = inicio;
  while (aux!=null){
    System.out.println(aux.toString());
    aux = aux.proximo;
  }
}

public void remove(){   //remocao no fim

    if(inicio == null){
        System.out.println("Não foi possivel remover nada, pois a lista esta vazia");
    }
    
    else{
    No aux = inicio;
    No anterior = null;
    while(aux!=null){
      if (aux==fim){
        break;
      }
      anterior = aux;
      aux = aux.proximo;       
    }
        fim = anterior;
        anterior.proximo=null;

    }
}
}
