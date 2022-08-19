public class Pessoa {
    String nome;
    int idade;
    
    public Pessoa(String n,int i){
        this.nome=n;
        this.idade=i;
    }
    
    public String toString(){
        return "Nome: "+nome+"|   Idade:"+idade;
    }
}
