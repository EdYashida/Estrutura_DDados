class Main {
  public static void main(String[] args) {
    int vet1[]={1,2,3,4,5};        //vetor copiado
    int vet2[]=new int[5];        //vetor que copia

    for(int i=0;i<vet1.length;i++){
      vet2[i]=vet1[i];
      System.out.println(vet2[i]);
    }
  }
}

//Eh o exercicio 3, nomeei errado a pasta
