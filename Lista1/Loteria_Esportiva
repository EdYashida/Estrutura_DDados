import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    int gabarito[]={1,1,3,3,1,2,1,3,1,2,2,3,3};
    int countacerto=0,i,j;
    int cartaoresposta[]=new int[13];

    Scanner teclado= new Scanner(System.in);
    System.out.println("Digite o numero do cartao: ");
    int c1 = teclado.nextInt();
    teclado.nextLine();

    for(i=0,j=1;i<13;i++,j++){
    System.out.println("Digite a" +j+"ª resposta do seu  cartao: (as respostas variam de 1 a 3)");
    cartaoresposta[i]=teclado.nextInt();
    teclado.nextLine();

    if(cartaoresposta[i]==gabarito[i]){
      countacerto++;
    }
    }

    System.out.println("Cartao: "+c1);
    System.out.println("Acertos: "+countacerto);

    if(countacerto==13){
      System.out.println("GANHADOR, PARABENS");
    }

    
  }
}
