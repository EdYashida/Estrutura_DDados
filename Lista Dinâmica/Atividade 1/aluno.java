public class Aluno {
    
    String nome;
    int idade;
    String curso;
    
    public Aluno(String n, int i, String c){
        this.nome=n;
        this.idade=i;
        this.curso=c;
    }
    
    public String toString(){
        return "Nome: "+nome+" | Idade: "+idade+" | Curso: "+curso;
    }
    
}
