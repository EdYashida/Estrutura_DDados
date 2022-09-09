public class Aluno {
    String nome;
    String matricula;
    double rendimento;
    String curso;
    
    public Aluno(String nome,String matricula, double nota,String curso){
        this.nome=nome;
        this.matricula=matricula;
        this.rendimento=nota;
        this.curso=curso;
    }
    
    public String toString(){
        return "Nome:"+nome+"  |Matricula:"+matricula+"  |Rendimento:"+rendimento+"  |Curso:"+curso;
    }
}
