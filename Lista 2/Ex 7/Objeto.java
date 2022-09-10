public class Objeto {
    int chave;
    String nome;
    
    public void setObjeto(int c, String n){
        this.chave=c;
        this.nome=n;
    }
    
    public Objeto(int c,String n){
        this.chave=c;
        this.nome=n;
    }
    
    public String tostring(){
        return "Chave:"+chave+"   Nome:"+nome;
    }
}
