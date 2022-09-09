public class SelectionSort {
    
    public int[] selectionSort(int vet[]){
        int tam=vet.length;
        
        for(int externo=0; externo<tam; externo++){
        int elMin = vet[externo];
        int posMin = externo;
        
        for(int interno=externo; interno<tam; interno++){
            
            if(elMin>vet[interno]){
                elMin=vet[interno];
                posMin=interno;
            }         
        }
        
        if(elMin != vet[externo]){
            vet[posMin]=vet[externo];
            vet[externo] = elMin;
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
