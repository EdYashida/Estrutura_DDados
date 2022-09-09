public class No {
     Pessoa p;
     No proximo;
     No anterior;
    
    public No(Pessoa pessoa){
        this.p=pessoa;
    }
    
 public String toString(){
        if(proximo!=null && anterior!=null ){
            return this.hashCode()+"  Pessoa-->"+p.toString()+"  |Proximo:"+proximo.hashCode()+"  |Anterior:"+anterior.hashCode();
        }
        else if(proximo !=null && anterior ==null){
            return this.hashCode()+"  Pessoa-->"+p.toString()+"  |Proximo:"+proximo.hashCode();
        }
        else if(proximo ==null && anterior!= null){
            return this.hashCode()+"  Pessoa-->"+p.toString()+"  |Anterior:"+anterior.hashCode();
        }
        else{
            return this.hashCode()+"  Pessoa-->"+p.toString()+"  |Proximo:Vazio  |Anterior: Vazio";
        }
    }
    
 
}
