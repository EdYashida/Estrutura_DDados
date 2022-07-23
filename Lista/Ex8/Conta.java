public class Conta {
    String nomeTitular;
    String numeroConta;
    String numeroAgencia;
    Double saldoConta;
    
   public Conta(String not,String nuc,String numa,Double sac){
  nomeTitular=not;
  numeroConta=nuc;
  numeroAgencia=numa;
  saldoConta=sac;
  }
   
   public String toString(){
       return "Nome_do_titular: "+nomeTitular+" Numero_da_conta: "+numeroConta+" Numero_da_agencia: "+numeroAgencia+" Saldo_da_conta: "+saldoConta;
   }
}
