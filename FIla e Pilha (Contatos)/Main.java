public class Main {
  public static void main(String[] args) {

  ListaContato minhaLista= new ListaContato();
  Pilha pilha =new Pilha();
  Fila fila =new Fila();


    //imprimir normal
    Contato c1 = new Contato("Babi","112");
    minhaLista.preencheLista(c1);
    minhaLista.mostrarLista();

    Contato c2 = new Contato("Foguinho","420");
    minhaLista.preencheLista(c2);
    minhaLista.mostrarLista();

    Contato c3 = new Contato("Gallo","230");
    minhaLista.preencheLista(c3);
    minhaLista.mostrarLista();

    Contato c4 = new Contato("Icaro","015");
    minhaLista.preencheLista(c4);
    minhaLista.mostrarLista();

    Contato c5 = new Contato("Benini","099");

    System.out.println("");

    //imprimir pilha
    System.out.println("Pilha: ");
    pilha.inserirPilha(c1);
    pilha.inserirPilha(c2);
    pilha.inserirPilha(c3);
    pilha.inserirPilha(c4);
    pilha.inserirPilha(c5);

    pilha.removerPilha();

    System.out.println("");
    
    //imprimir fila
    System.out.println("Fila: ");
    fila.inserirFila(c1);
    fila.inserirFila(c2);
    fila.inserirFila(c3);
    fila.inserirFila(c4);
    fila.inserirFila(c5);

    fila.removerFila();
  }
}
