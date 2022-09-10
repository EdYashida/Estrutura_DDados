public class InsertionSort {
    
   public Objeto[] insertionSort(Objeto vet[]){
       int tam = vet.length;
       
       for(int externo=1; externo<tam; externo++){
           for(int interno=externo; interno>0; interno--){
               
               if(vet[interno].chave<vet[interno-1].chave){
                   
                   int aux = vet[interno].chave;
                   vet[interno].chave=vet[interno-1].chave;
                   vet[interno-1].chave=aux;
               }
               else{
                   break;
               }
           }
           System.out.println("Passo encerrado");
           for(int i=0; i<vet.length; i++){
               System.out.print(vet[i].tostring()+" | ");
           }
           System.out.println();
       }
       return vet;
   }
    
}
