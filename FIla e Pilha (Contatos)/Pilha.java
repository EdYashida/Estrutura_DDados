class Pilha{
  int ponteiroFinal=-1;
  Contato listaPi[] = new Contato[5];
  int inicio = 0;

  public void inserirPilha(Contato ci){
    if(ponteiroFinal<(listaPi.length-1)){
      
      if(ponteiroFinal==-1){
        listaPi[inicio]=ci;
      }
      else{
        for(int i=ponteiroFinal;i>=0;i--){
          listaPi[i+1] = listaPi[i];
        }
        listaPi[inicio]=ci;
      }
      ponteiroFinal++;
    }
    else{
      System.out.println("Pilha cheia");
    }
  }

  public void removerPilha(){
    for(int i=0;i<ponteiroFinal+1;i++){
      System.out.println(listaPi[i]);
    }
  }
}
