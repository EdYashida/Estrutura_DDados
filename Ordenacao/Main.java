class Main {
  public static void main(String[] args) {
        
        int vetor1[] = {2,6,21,1,78,3,5,196,4};
        int vetor2[] = {2,6,21,1,78,3,5,196,4};
        int vetor3[] = {2,6,21,1,78,3,5,196,4};
        BubbleSort bub = new BubbleSort();
        InsertionSort ins = new InsertionSort();
        SelectionSort sel = new SelectionSort();
        
        
        System.out.println("Bubble Sort");
        vetor1=bub.bubleSort(vetor1);
        for(int i=0; i<vetor1.length; i++){
            System.out.print(vetor1[i]+" | ");
        }
        System.out.println();
        
        System.out.println("Insertion Sort");
        vetor2=ins.insertionSort(vetor2);
        for(int i=0; i<vetor2.length; i++){
            System.out.print(vetor2[i]+" | ");
        }
        System.out.println();
        
        System.out.println("Selection Sort");
        vetor3=sel.selectionSort(vetor3);
        for(int i=0; i<vetor3.length; i++){
            System.out.print(vetor3[i]+" | ");
        }
        System.out.println();
    }
}
