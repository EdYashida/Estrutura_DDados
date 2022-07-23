public class Main {
public static void main(String[] args) {
        
        Pilha p = new Pilha(3);
        
        for (int i=0; i<3; i++){
            No n = new No("pil:"+i, i);
            p.empilha(n);
        }
        
        p.desempilha();
        
        p.imprime();
     
    }      
}
