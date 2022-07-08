public class Contato{
  String nome;
  String numero;

  public Contato(String no,String nu){
    nome=no;
    numero=nu;
  }
  public String toString(){
    return nome+"-"+numero;
  }
}
