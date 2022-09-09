public class ListaDinamica {
   No inicio;
   No fim;
   
   public void cadastraAluno(No a){
       if(inicio==null){
           inicio=a;
           fim=a;
       }
       else{
           fim.setProximo(a);
           a.setAnterior(fim);
           fim=a;    
       }
   }
   
   public void imprimeAluno(String procura){
       No aux=inicio;
       
       while(aux!=null){
           if(aux.getAluno().nome==procura){
               System.out.println(aux.toString());
           }
           aux=aux.getProximo();
       }
   }
   
   public void mostraTodos(){
       No aux=inicio;
       
       while(aux!=null){
           System.out.println(aux.toString());
           aux=aux.getProximo();
       }
   }
}
