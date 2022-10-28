import java.util.Scanner;
public class Recursividade1 {
    
    public int soman(int n){
       if (n==1){
            return 1;
        }
        else{
            return n+soman(n-1);
        }
    }

    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
        
      Recursividade1 r = new Recursividade1();
      
      System.out.println("Digite o valor dos n primeiros numeros inteiros");
        
      int j = teclado.nextInt();
      
     int i= r.soman(j);
     
      System.out.println("A soma dos n primeiros numero inteiro eh de: "+i);
    }  
}
