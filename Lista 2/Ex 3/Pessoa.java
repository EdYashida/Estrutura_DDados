public class pessoa {
    String nome;
    int idade;
    
    public pessoa(String s, int i){
        this.nome=s;
        this.idade=i;
    }
    
    
    public String toString(){
        return "nome: "+nome+"  ||  idade: "+idade;
    }
}
