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
      Recursividade1 r = new Recursividade1();
      
     int i= r.soman(7);
     
      System.out.println("A soma dos n primeiros numero inteiro eh de: "+i);
    }  
}
