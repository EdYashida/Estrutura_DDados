import java.util.Scanner;

class Main {


    public static void main(String[] args) {
        ListaDinamica lista= new ListaDinamica();
        int escolha=1;
        
        Scanner opcao = new Scanner (System.in);
        
        while(escolha==1 || escolha==2 || escolha==3 || escolha==4){
            System.out.println("Aperte 1 para inserir elemento, 2 para remover elemento, 3 para buscar elemento, 4 para imprimir lista ou qualquer outra tecla para fechar o programa");
            
            escolha = opcao.nextInt();
            System.out.println("\n\n\n");
            
             if(escolha==1){
                    Scanner teclado = new Scanner (System.in);
                    System.out.print("Nome: ");
                    String nome = teclado.next();
                    System.out.print("\nAltura: ");
                    float altura = teclado.nextFloat();
                    System.out.print("\nPeso: ");
                    float peso = teclado.nextFloat();
                    System.out.print("\nEsporte: ");
                    String esporte = teclado.next();
                    System.out.print("\nPatrocinadores: ");
                    String patrocinadores = teclado.next();
                    atleta at=new atleta(nome,altura,peso,esporte,patrocinadores);
                    lista.insere(new no(at));
                    continue;
             }
             else if(escolha==2){
                    Scanner teclado2 = new Scanner (System.in);
                    System.out.print("Nome: ");
                    String _nomeRemover = teclado2.next();
                    lista.remover(_nomeRemover);

                    continue;
             }
               else if(escolha==3){
                    Scanner teclado3 = new Scanner (System.in);
                    System.out.print("Nome: ");
                    String procura = teclado3.next();
                    System.out.print(procura);
                    no atleta = lista.busca(procura);
                    System.out.println(atleta.toString());
                    continue;
                }
                else if(escolha==4){
                    lista.imprime();
                    continue;
                }
        }
    }
    
}
