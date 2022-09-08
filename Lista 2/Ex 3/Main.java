public class ED2E3 {


    public static void main(String[] args) {
        
        ListaDinamica l1= new ListaDinamica();
        pessoa p1= new pessoa("Pedro",25);
        pessoa p2= new pessoa("Caio",32);
        pessoa p3= new pessoa("Jack",52);
        
        l1.insere(new no(p1));
        l1.insere(new no(p2));
        l1.insere(new no(p3));
        
        l1.imprime();
        
        
        
    }
    
}
