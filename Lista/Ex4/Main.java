import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int vet[]=new int[20]; //vetor
    int numreserva;  //variavel que armazena valor na hora da troca
    int i,j;

  Scanner teclado= new Scanner(System.in);

    

    for(i=0,j=1;i<vet.length;i++,j++){   //preenchendo matriz de 20 posicoes
      System.out.println("Digite o "+j+"º numero: ");
      vet[i]=teclado.nextInt();
      String tiraLinha = teclado.nextLine();
    }

    System.out.println("Vetor original:");
    for(i=0;i<vet.length;i++){   //mostrando matriz de 20 posicoes
      System.out.println(vet[i]);
    }

    for(i=0,j=19;i<10;i++,j--){
      numreserva=vet[i];
      vet[i]=vet[j];
      vet[j]=numreserva;
    }

    System.out.println("");

    System.out.println("Matriz invertida: ");
    for(i=0;i<vet.length;i++){   
      System.out.println(vet[i]);
    }
    
  }
}
