public class BubbleSort {
    
    public int[] bubleSort(int vet[]){
    int tam = vet.length;
    boolean troca = false;
    
    for(int externo = (tam-1); externo>=0; externo--){
        troca=false;
        
        for(int interno=0; interno<externo; interno++){
            
            if(vet[interno]>vet[interno+1]){
                int aux =vet[interno];
                vet[interno]=vet[interno+1];
                vet[interno+1]=aux;
                troca=true;
            }
        }
        
        System.out.println("proximo passo...");
        
        for(int i=0; i < vet.length; i++){
        System.out.print(vet[i]+" | ");
    }
        System.out.println();
        
        if(!troca){
            System.out.println("Vetor ordenado");
            break;
        }
    }
    return vet;
}
}
