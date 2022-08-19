public class No {
    
    private Pessoa p;
    private No proximo;
    private No anterior;
    
    public No(Pessoa pes){
        this.p = pes;

    }
    
    public Pessoa getPessoa(){
        return p;
    }
    
    public void setPessoa(Pessoa pes){
        this.p=pes;
    }
    
    public No getProximo(){
        return proximo;
    }
    
    public void setProximo(No prox){
        this.proximo=prox;
    }
    public No getAnterior(){
        return anterior;
    }
    
    public void setAnterior(No ant){
        this.anterior=ant;
    }
    
    public String toString(){
        if (proximo!=null && anterior!=null)
            return this.hashCode()+" -> Obj Pessoa: "+p.toString() + "| Proximo: "+proximo.hashCode() + "| Anterior: "+anterior.hashCode();
        else if (proximo == null && anterior!=null)
            return this.hashCode()+" -> Obj Pessoa: "+p.toString() + "| Proximo: Vazio" + "| Anterior: "+anterior.hashCode();
        else if (proximo != null && anterior==null)
            return this.hashCode()+" -> Obj Pessoa: "+p.toString() + "| Proximo: "+proximo.hashCode() + "| Anterior: Vazio";
        else
            return this.hashCode()+" -> Obj Pessoa: "+p.toString() + "| Proximo: Vazio" + "| Anterior: Vazio";

    }
}
