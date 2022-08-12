public class Pilha {

    public static void main(String[] args) {
        ListaDinamica lista = new ListaDinamica();

           Atleta atleta1=new Atleta("Dustin",1.77f,70.7f,"MMA","UFC");
           Atleta atleta2=new Atleta("Morpheu",1.80f,54.8f,"Atletismo","Vertigo");
           Atleta atleta3=new Atleta("Jotaro",1.90f,83.3f,"Boxe","Araki");
           Atleta atleta4=new Atleta("Joseph",1.88f,80.2f,"Atletismo","Hirohiko");
           Atleta atleta5=new Atleta("Vegeta",1.69f,74.1f,"Karate","Akira");
           

           lista.insere(new No(atleta1));
           lista.insere(new No(atleta2));
           lista.insere(new No(atleta3));
           lista.insere(new No(atleta4));
           lista.insere(new No(atleta5));
           
           lista.imprime();
           
           lista.remove();
           
           System.out.println("");
           System.out.println("Pilha apos remocao:");
           
           lista.imprime();
    }
    }
