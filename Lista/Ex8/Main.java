public class Main {


    public static void main(String[] args) {
        ListaConta lc= new ListaConta();
        

        
       lc.cadastraConta(new Conta("Edgar","123","25543",500.00));
       System.out.println(lc.buscaConta("Edgar"));
       lc.depositar(800.00, "123");
       System.out.println(lc.buscaConta("Edgar"));
       lc.sacar("123", 200.00);
       System.out.println(lc.buscaConta("Edgar"));
  
    }
    
}
