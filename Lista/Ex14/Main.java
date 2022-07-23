import java.util.Scanner;

public class Main {
    
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        ListaDeCompra lista = new ListaDeCompra();
        String nomeProduto;
        double valor;
        int quant;
    
        for(int i = 0; i < 2; i++){

            System.out.println("Digite o nome do produto: ");
            nomeProduto = teclado.next();
            
            System.out.println("Digite o preço do produto: ");
            valor = teclado.nextDouble();
            
            System.out.println("Digite a quantidade comprada: ");
            quant = teclado.nextInt();
            
            Produto p = new Produto(nomeProduto, valor, quant);
            lista.insere(p);

        }
        
        System.out.println(lista.busca("mouse"));
        
        lista.imprimeLista();
        
        lista.remove("teclado");
        
        lista.calculoTotal();
        
        lista.limpaLista();
        
        lista.imprimeLista();
        
        
    }   
}
