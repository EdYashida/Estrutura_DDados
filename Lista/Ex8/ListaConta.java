public class ListaConta {
    int ponteiroFinal=-1;
    Conta listaC[]=new Conta[8];
    
    public void cadastraConta(Conta ci){
        if(ponteiroFinal<(listaC.length-1)){
            ponteiroFinal++;
            listaC[ponteiroFinal]=ci;
            System.out.println("Conta inserida");
        }
        else{
            System.out.println("Nao foi possivel inserir a conta");
        }
    }
        
    public String buscaConta(String nomeC){
        for(int i=0;i<=ponteiroFinal;i++){
            if(listaC[i].nomeTitular.contains(nomeC)){
              
                return listaC[i].toString();
        }

    }
        return "A conta nao foi encontrada";
    }
    
    
   
    public void sacar(String numcon, Double saque){
        for(int i=0; i<=ponteiroFinal;i++){
            
            if(listaC[i].numeroConta== numcon){
                listaC[i].saldoConta=listaC[i].saldoConta-saque;
                System.out.println("Saque realizado");
            }
            else{
                System.out.println("Nao foi possivel encontrar a conta");
            }
        }
    }
    
    public void depositar(Double deposito, String numcon){
        for(int i=0; i<=ponteiroFinal;i++){
            
            if(listaC[i].numeroConta== numcon){
                listaC[i].saldoConta=listaC[i].saldoConta+deposito;
                System.out.println("Deposito realizado");
           
        }
            else{  
                System.out.println("Nao foi possivel encontrar a conta");
          }
    }
    
}
}
