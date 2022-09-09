public class InsertionSort {
    
   public int[] insertionSort(int vet[]){
       int tam = vet.length;
       
       for(int externo=1; externo<tam; externo++){
           for(int interno=externo; interno>0; interno--){
               
               if(vet[interno]<vet[interno-1]){
                   
                   int aux = vet[interno];
                   vet[interno]=vet[interno-1];
                   vet[interno-1]=aux;
               }
               else{
                   break;
               }
           }
           System.out.println("Passo encerrado");
           for(int i=0; i<vet.length; i++){
               System.out.print(vet[i]+" | ");
           }
           System.out.println();
       }
       return vet;
   }
    
}
