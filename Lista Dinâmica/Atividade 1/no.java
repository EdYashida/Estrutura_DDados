public class No{
    Aluno al;
    No proximo;

  public No(Aluno a){
    this.al = a;

  }
  
  public String toString(){
    if (proximo!=null)
      return this.hashCode()+" -> Aluno: "+al.toString() + "| Proximo: "+proximo.hashCode();
    else
      return this.hashCode()+" -> Aluno: "+al.toString() + "| Proximo: Vazio";
      
  }
  

}
