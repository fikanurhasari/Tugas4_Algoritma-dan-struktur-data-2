package TugasPraktikum4;

public class No4_ShellSort {
   
    public static void shellSort(int[] arr) {
        int n = arr.length;
        int C,M;
        int jarak, i, j, kondisi;
        boolean Sudah = true;
        int temp;
        C = 0;
        M = 0;
        jarak = n;
        
        while (jarak >=1) {
            jarak = jarak / 2;
            Sudah = true;
            while (Sudah) {
                Sudah = false;
                for (j = 0; j < n - jarak; j++) {
                    i = j + jarak;  //i=0+2=2
                    C++;
                    if (arr[j]> arr[i]) {
                        temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                        Sudah = true;
                    }
                }
            }
        }
    }
    
    public static void tampil(int data[]) {
        for(int i=0; i<data.length; i++)
            System.out.print(data[i]+"");
        System.out.println();
    }
    
    public static void main(String[] args) {
        System.out.println("Fika Nur Hasari - 21092001");
        System.out.println("No.4 Shell Sort");
        System.out.println("");
        int A[] = {25, 7, 9, 13, 3};
        No4_ShellSort.tampil(A);
        No4_ShellSort.shellSort(A);
        System.out.println("");
        No4_ShellSort.tampil(A);
        System.out.println("");
    }
}
