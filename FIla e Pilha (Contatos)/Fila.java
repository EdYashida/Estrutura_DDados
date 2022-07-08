class Fila{
  int ponteiro_final=-1;
  Contato listaFi[] = new Contato[5];
  int inicio=0;

  

  public void inserirFila(Contato ci){
    if(ponteiro_final<(listaFi.length-1)){ 
      listaFi[ponteiro_final+1] = ci; 
      ponteiro_final++;
    }
    else{
      System.out.println("Fila cheia");
    }
  }

  public void removerFila(){
    for(int i=0;i<ponteiro_final+1;i++){
      System.out.println(listaFi[i]);
    }
    System.out.println();
  }
}
