import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int M[][]=new int[5][5];
    int i,j;
    int A=0,B=0,C=0,D=0,E=0;
    String tiraLinha;

    Scanner teclado= new Scanner(System.in);

    //preenche matriz
    System.out.println("Matriz original: ");
    for(i=0;i<5;i++){
      for(j=0;j<5;j++){
        System.out.println("Digite o numero de posicao ["+i+"] ["+j+"]");
        M[i][j]=teclado.nextInt();
        tiraLinha = teclado.nextLine();

      }
      System.out.println("");
    }

    //exibe matriz
    for(i=0;i<5;i++){
      for(j=0;j<5;j++){
        System.out.print("["+M[i][j]+"] ");
      }
      System.out.println("");
    }

    System.out.print("Soma da linha 4: ");
    for(i=0;i<5;i++){
      A=A+M[3][i];
    }
    System.out.println(A);

    System.out.print("Soma da coluna 2: ");
    for(i=0;i<5;i++){
      B=B+M[i][1];
    }
    System.out.println(B);

    System.out.print("Soma da diagonal principal: ");
    for(i=0;i<5;i++){
      C=C+M[i][i];
    }
    System.out.println(C);

    System.out.print("Soma da diagonal secundaria: ");
    for(i=0,j=4;i<5;i++,j--){
      D=D+M[j][i];
    }
    System.out.println(D);

    System.out.print("Todos os elementos da matriz: ");
    for(i=0;i<5;i++){
      for(j=0;j<5;j++){
        E=E+M[i][j];
      }
    }
     System.out.println(E);
    
  }
}
