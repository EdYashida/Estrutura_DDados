public class no {
    no proximo;
    pessoa p;
    
    public no(pessoa p){
        this.p=p;
    }
    
    
    public String toString(){
        if(proximo==null){
        return this.hashCode()+"  Pessoa "+p.toString();
        }
        else{
        return this.hashCode()+ "  Pessoa "+p.toString()+"|| proximo:"+proximo.hashCode();    
        }
    }
}
