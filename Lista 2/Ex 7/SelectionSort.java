public class SelectionSort {
    
    public Objeto[] selectionSort(Objeto vet[]){
        int tam=vet.length;
        
        for(int externo=0; externo<tam; externo++){
        int elMin = vet[externo].chave;
        int posMin = externo;
        
        for(int interno=externo; interno<tam; interno++){
            
            if(elMin>vet[interno].chave){
                elMin=vet[interno].chave;
                posMin=interno;
            }         
        }
        
        if(elMin != vet[externo].chave){
            vet[posMin].chave=vet[externo].chave;
            vet[externo].chave = elMin;
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
