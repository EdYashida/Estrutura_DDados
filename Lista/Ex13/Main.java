public class Main {

public static void main(String[] args) {
        
        Fila fila = new Fila(4);
        
        for (int i = 0; i < 5; i++) {
            No n = new No(i);
            fila.inserir(n);
        }
        fila.remover();
  
        fila.imprime();
                
               
    }
    
}
