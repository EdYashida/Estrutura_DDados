import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
       
        ListaDinamica lista = new ListaDinamica();
        
        Atleta atleta[]= new Atleta [10];           //permite insercao de 10 atletas
        Scanner teclado= new Scanner(System.in);
        int continuar;

        
        System.out.println("Digite 1 para inserir elemento, 2 para imprimir lista, ou qualquer outra tecla para encerrar programa");
        continuar = teclado.nextInt();
        String tiraLinha = teclado.nextLine();
            
        for(int i=0;continuar == 1 || continuar == 2;i++){
            
            
            
            if(continuar==1){
                System.out.println("Insira o nome do atleta: ");
                atleta[i].nome = teclado.nextLine();
                
                System.out.println("Insira a altura do atleta: ");
                atleta[i].altura = teclado.nextFloat();
                tiraLinha = teclado.nextLine();
                
                System.out.println("Insira o peso do atleta: ");
                atleta[i].peso= teclado.nextFloat();
                tiraLinha = teclado.nextLine();
                
                System.out.println("Insira a modalidade do atleta: ");
                atleta[i].esporte= teclado.nextLine();
                 
                
                System.out.println("Insira os patrocinadores do atleta: ");
                atleta[i].patrocinadores= teclado.nextLine();
                
                lista.insere(new No(atleta[i]));
            }
            
            else if(continuar==2){
                lista.imprime();
            }
            
            else if(i>=10){
                System.out.println("Lista cheia");
            }
            }
            
        }

    }
