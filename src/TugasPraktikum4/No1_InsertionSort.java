package TugasPraktikum4;

public class No1_InsertionSort {

    public static void InsertionSort(int[] A) {
        for (int i = 1; i < A.length; i++) { 
            int key = A[i]; 
            int j = i - 1; 
            while ((j >= 0) && (A[j] > key)) { 
                  A[j + 1] = A[j]; 
                  j--; 
            }
            A[j + 1] = key; 
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
        System.out.println("No.1 Insertion Sort");
        System.out.println("");
        int A[] = {25, 7, 9, 13, 3};
        No1_InsertionSort.tampil(A);
        No1_InsertionSort.InsertionSort(A);
        System.out.println("");
        No1_InsertionSort.tampil(A);
        System.out.println("");
    }
}  