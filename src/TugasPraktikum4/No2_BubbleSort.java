package TugasPraktikum4;

public class No2_BubbleSort {
    
    public static void bubbleSort(int[] A) {
        int i=1, j, n=A.length;
        int temp;
        while (i<n) {   
            j = n-1;    
            while(j>=i) {    
                if (A[j-1]>A[j]) {   
                    temp = A[j];   
                    A[j] = A[j-1]; 
                    A[j-1] = temp; 
                }
                j = j - 1;  
            }
            i = i + 1;  
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
        System.out.println("No.2 Bubble Sort");
        System.out.println("");
        int A[] = {25, 7, 9, 13, 3};
        No2_BubbleSort.tampil(A);
        No2_BubbleSort.bubbleSort(A);
        System.out.println("");
        No2_BubbleSort.tampil(A);
        System.out.println("");
    }
}
