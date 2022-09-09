public class no {
    atleta a;
    no proximo;
    
    public no(atleta a){
     this.a=a;
    }
    
    public String toString(){
        if(proximo==null){
            return this.hashCode()+"  |Atleta "+a.toString();
        }
        else{
            return this.hashCode()+"  |Atleta "+a.toString()+"  |  Proximo: "+proximo.hashCode();
        }
    }
}
