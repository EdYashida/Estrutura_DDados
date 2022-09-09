public class No {
    private Aluno a;
    private No proximo;
    private No anterior;
    
    public No(Aluno aluno){
        this.a=aluno;
    }
    
    public void setProximo(No p){
        this.proximo=p;
    }
    public No getProximo(){
        return proximo;
    }
    
    public void setAnterior(No a){
        this.anterior=a;
    }
    public No getAnterior(){
        return anterior;
    }
    
    public void setAluno(Aluno a){
        this.a=a;
    }
    public Aluno getAluno(){
        return a;
    }
    
    public String toString(){
        if(proximo!=null && anterior!=null ){
            return this.hashCode()+"  Pessoa-->"+a.toString()+"  |Proximo:"+proximo.hashCode()+"  |Anterior:"+anterior.hashCode();
        }
        else if(proximo !=null && anterior ==null){
            return this.hashCode()+"  Pessoa-->"+a.toString()+"  |Proximo:"+proximo.hashCode();
        }
        else if(proximo ==null && anterior!= null){
            return this.hashCode()+"  Pessoa-->"+a.toString()+"  |Anterior:"+anterior.hashCode();
        }
        else{
            return this.hashCode()+"  Aluno-->"+a.toString()+"  |Proximo:Vazio  |Anterior: Vazio";
        }
    }
    
    
}
