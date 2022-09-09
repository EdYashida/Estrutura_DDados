public class FilaEplha {


    public static void main(String[] args) {
        Pessoa p1=new Pessoa("John",15);
        Pessoa p2=new Pessoa("Johana",42);
        Pessoa p3=new Pessoa("Jonathan",78);
        
        
        System.out.println("FILA");
        
        Fila fila=new Fila();
        Pilha pilha=new Pilha();
        
        fila.entrar(new No(p1));
        fila.entrar(new No(p2));
        fila.entrar(new No(p3));
        
        fila.imprimir();
        
        System.out.println();
        System.out.println("Retirando primeiro elemento");
        System.out.println();
        
        fila.tirar();
        
        fila.imprimir();
        
        System.out.println("PILHA");
        
        pilha.empilha(new No(p1));
        pilha.empilha(new No(p2));
        pilha.empilha(new No(p3));
        
        pilha.imprimir();
        
        System.out.println();
        System.out.println("Retirando ultimo elemento");
        System.out.println();
        
        pilha.desempilha();
        
        pilha.imprimir();


    }
    
}
