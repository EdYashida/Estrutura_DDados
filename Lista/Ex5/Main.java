import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int vetG[]={1,2,3,3,1,2,2,1,2,1,3,1,3};
    int vetR[]=new int[13];
    int numR;

    int countacerto=0,i,j;

    Scanner teclado= new Scanner(System.in);

    //escolhe numero do cartao
    System.out.println("Escolha o numero do cartao: ");
    numR= teclado.nextInt();
    String tiraLinha = teclado.nextLine();

    //preenche cartao
    for(i=0,j=1;i<vetG.length;i++,j++){
      
    System.out.println("Digite o "+j+"° numero");
    vetR[i] = teclado.nextInt();
    tiraLinha = teclado.nextLine();
      
    }
    //checa se esta certo
    for(i=0;i<vetG.length;i++){
      if(vetR[i]==vetG[i]){
        countacerto++;
      }
    }
    
    System.out.println("Numero do apostador "+numR);
    System.out.println("Acertos: "+countacerto);
    if(countacerto==vetG.length){
      System.out.println("GANHADOR,PARABENS");
    }

   
    }
  }
