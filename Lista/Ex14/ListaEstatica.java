public abstract class ListaEstatica {
    
    public int prim;
  
    public int ultimo;
    
    abstract public void insere(Produto prod);
  
    abstract public void limpaLista();
  
    abstract public String busca(String busc);
  
    abstract public void remove(String rem);
  
    abstract public void imprimeLista();
    
}
