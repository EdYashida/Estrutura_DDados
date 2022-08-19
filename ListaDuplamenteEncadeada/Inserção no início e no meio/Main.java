public class InserçãoEmListaDuplamenteEncadeada {

    
    public static void main(String[] args) {
        
        Lista lista=new Lista();
        
        Pessoa P1= new Pessoa("Andre",18);
        Pessoa P2= new Pessoa("Bira",48);
        Pessoa P3= new Pessoa("Junior",21);
        Pessoa P4= new Pessoa("Clara",25);
        Pessoa P5= new Pessoa("Joana",31);
        
       
   lista.insereFinal(new No(P1));
   lista.insereFinal(new No(P2));
   lista.insereFinal(new No(P3));
   
   lista.imprime();
   
        System.out.println("");
   
   lista.insereInicio(new No(P4));
   
   lista.imprime();
   
        System.out.println("");
   
   lista.insereMeio("Bira",new No(P5));
   
   lista.imprime();
   
    }
    
}
