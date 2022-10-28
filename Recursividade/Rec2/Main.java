public class Recursividade2 {

  public int potencia(int num,int pot){
       if (num==1){
            return 1;
        }
       else if(pot==1){
           return num;
       }
        else{
            return num*potencia(num,pot-1);
        }
    }
    
    public static void main(String[] args) {
        Recursividade2 r = new Recursividade2();
      
     int i= r.potencia(2,5);
     
      System.out.println("A potencia do numero digitado eh de: "+i);
    }
   
}
