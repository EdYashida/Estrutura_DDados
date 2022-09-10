public class BubbleSort {
    
    public Objeto[] bubleSort(Objeto vet[]){
    int tam = vet.length;
    boolean troca = false;
    
    for(int externo = (tam-1); externo>=0; externo--){
        troca=false;
        
        for(int interno=0; interno<externo; interno++){
            
            if(vet[interno].chave>vet[interno+1].chave){
                int aux =vet[interno].chave;
                vet[interno].chave=vet[interno+1].chave;
                vet[interno+1].chave=aux;
                troca=true;
            }
        }
        
        System.out.println("proximo passo...");
        
        for(int i=0; i < vet.length; i++){
        System.out.print(vet[i].tostring()+" | ");
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
