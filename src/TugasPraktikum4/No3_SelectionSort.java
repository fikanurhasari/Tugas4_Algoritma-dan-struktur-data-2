package TugasPraktikum4;

public class No3_SelectionSort {
    
    public static void selectionSort(int[] A) {
        int smallIndex;
        int pass, j, n = A.length;
        int temp;
        
        
        for (pass = 0; pass < n - 1; pass++) {  
            smallIndex = pass;                  
            for (j = pass + 1; j < n; j++) {    
                if (A[j]<A[smallIndex]) {       
                    smallIndex = j;  
                }
            }
            
            temp = A[pass]; 
            A[pass] = A[smallIndex];
            A[smallIndex] = temp;
        }
    }
    
    public static void tampil(int data[]) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        System.out.println("Fika Nur Hasari - 21092001");
        System.out.println("No.3 Selection Sort");
        System.out.println("");
        int A[] = {25, 7, 9, 13, 3};
        No3_SelectionSort.tampil(A);
        No3_SelectionSort.selectionSort(A);
        System.out.println("");
        No3_SelectionSort.tampil(A);
        System.out.println("");
    }
}
