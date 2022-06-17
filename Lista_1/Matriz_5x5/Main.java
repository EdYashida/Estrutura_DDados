class Main {
  public static void main(String[] args) {
    int matrizM[][]=new int[5][5];
    int i,j,l=1;
    int a=0,b=0,c=0,d=0,e=0;

    for(i=0;i<5;i++){
      for(j=0;j<5;j++){
        matrizM[i][j]=l;
        l++;
        System.out.print("["+matrizM[i][j]+"]");
      }
      System.out.println();
    }

    
    System.out.println("");
    
    for(i=0;i<5;i++){
      a+=matrizM[3][i];
    }
    System.out.println("linha 4: "+a);

    for(i=0;i<5;i++){
      b+=matrizM[i][1];
    }
    System.out.println("coluna 2: "+b);

    for(i=0;i<5;i++){
      c+=matrizM[i][i];
    }
    System.out.println("Diagonal principal: "+c);

    for(i=0,j=4;i<5;i++,j--){
      d+=matrizM[i][j];
    }
    System.out.println("Diagonal secundaria: "+d);

    for(i=0;i<5;i++){
      for(j=0;j<5;j++){
        e+=matrizM[i][j];
      }
    }

    System.out.println("Matriz inteira: "+e);
    
  }
}
