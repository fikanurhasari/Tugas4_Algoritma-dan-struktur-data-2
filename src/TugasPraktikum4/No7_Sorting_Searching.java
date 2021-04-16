package TugasPraktikum4;

import java.util.Scanner;

public class No7_Sorting_Searching {
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
        for (int i = 0; i <data.length; i++) {
            System.out.print(data[i] + "");
        }
    System.out.println();
    }
    
    public static void main(String[] args) {
        System.out.println("Fika Nur Hasari - 21092001");
        System.out.println("");
        System.out.println("Insertion Sort");
        System.out.println("");
        int A[] = {25, 7, 9, 13, 3};
        No7_Sorting_Searching.tampil(A);
        No7_Sorting_Searching.InsertionSort(A);
        System.out.println("");
        No7_Sorting_Searching.tampil(A);
        System.out.println("");
        
        System.out.println("Searching Sequential");
        System.out.println("");
        
        int B[] = {25, 7, 9, 13, 3};
        int cari = 13;
        int ketemu = 0;
                
        //data array
        System.out.print("isi data B adalah:");
            for (int i = 0; i<B.length; i++) {
                System.out.print(B[i] + "");
                System.out.println("");
            }
            System.out.println("data yang dicari= "+cari);
        for (int i=0; i<B.length; i++) {
            if (B[i] == cari) {
                ketemu = 1;
                System.out.println("");
                System.out.print(" Data "+cari+" berada pada index ke - " + i);
            }
        }
        System.out.println("");
        System.out.println("");
        
        if (ketemu == 1)
            System.out.println("kesimpulan: data ditemukan");
        else
            System.out.println("kesimpulan: data tidak ditemukan");
    }
}

