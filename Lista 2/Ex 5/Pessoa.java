public class Pessoa {
    String nome;
    int idade;
    
    public Pessoa(String s, int i){
        this.nome=s;
        this.idade=i;
    }
    
    
    public String toString(){
        return "nome: "+nome+"  ||  idade: "+idade;
    }
}
