public class Ordenacao {


    public static void main(String[] args) {
        
        Objeto vetObj1[] = new Objeto[5];
        Objeto vetObj2[] = new Objeto[5];
        Objeto vetObj3[] = new Objeto[5];
        
        vetObj1[0]=new Objeto(3,"Tangerina");
        vetObj1[1]=new Objeto(23,"Limao");
        vetObj1[2]=new Objeto(1,"Principe");
        vetObj1[3]=new Objeto(75,"Velho");
        vetObj1[4]=new Objeto(12,"Joaninha");
        
        vetObj2[0]=new Objeto(3,"Tangerina");
        vetObj2[1]=new Objeto(23,"Limao");
        vetObj2[2]=new Objeto(1,"Principe");
        vetObj2[3]=new Objeto(75,"Velho");
        vetObj2[4]=new Objeto(12,"Joaninha");
        
        vetObj3[0]=new Objeto(3,"Tangerina");
        vetObj3[1]=new Objeto(23,"Limao");
        vetObj3[2]=new Objeto(1,"Principe");
        vetObj3[3]=new Objeto(75,"Velho");
        vetObj3[4]=new Objeto(12,"Joaninha");

 
        BubbleSort bub = new BubbleSort();
        InsertionSort ins = new InsertionSort();
        SelectionSort sel = new SelectionSort();
        
        
        System.out.println("Bubble Sort");
        vetObj1=bub.bubleSort(vetObj1);
        for(int i=0; i<vetObj1.length; i++){
            System.out.print(vetObj1[i].tostring()+" | ");
        }
        System.out.println();
        
        System.out.println("Insertion Sort");
        vetObj2=ins.insertionSort(vetObj2);
        for(int i=0; i<vetObj2.length; i++){
            System.out.print(vetObj2[i].tostring()+" | ");
        }
        System.out.println();
        
        System.out.println("Selection Sort");
        vetObj3=sel.selectionSort(vetObj3);
        for(int i=0; i<vetObj3.length; i++){
            System.out.print(vetObj3[i].tostring()+" | ");
        }
        System.out.println();
    }
    
}
