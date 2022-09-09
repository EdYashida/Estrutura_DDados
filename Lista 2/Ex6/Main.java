public class ED2E5 {

    
    public static void main(String[] args) {
        ListaDinamica ld = new ListaDinamica();
        Aluno a1= new Aluno("Eduardo","202111113030002",100.0,"Ciencia_Da_Computacao");
        Aluno a2= new Aluno("Joao","1997948271",16.8,"Agronomia");
        Aluno a3= new Aluno("Maria","20471957462",85.7,"Enfermagem");
        
        ld.cadastraAluno(new No(a1));
        ld.cadastraAluno(new No(a2));
        ld.cadastraAluno(new No(a3));
        
        System.out.println("Buscando pelo nome...");
        ld.imprimeAluno("Eduardo");
        
        System.out.println();
        System.out.println("Imprimindo todos os alunos");
        ld.mostraTodos();

    }
    
    
}
