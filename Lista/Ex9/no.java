package ex9;

public class No {
    
    Object obj;   
    No proximo;
    
    public No(Object ob){
        obj = ob;
    }

    public Object getObj(){
        return obj;
    }

    public String toString(){
        return obj.toString();
    }

    public void setProximo(No p){
        proximo = p;
    }
    public No getProximo(){
        return proximo;
    }
    
}
